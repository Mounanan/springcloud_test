package com.mouna.request.controller;

import com.mouna.request.bean.Score;
import com.mouna.request.bean.Student;
import com.mouna.request.service.ScoreService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController extends HystrixErrorController{

    @Autowired
    private ScoreService scoreService;

    @Autowired
    private RestTemplate restTemplate;

//    @RequestMapping("/getAllStudents")
////    @RequestMapping(value = "/getAll", method = POST, produces = "application/json")
//    public ModelAndView getAllStudents(Model model){
//        model.addAttribute("studentList",studentService.getAllStudents());
//        model.addAttribute("title","学生列表");
//        return new ModelAndView("index","studentModel", model);
//    }

    @RequestMapping(value = "/getStudentScore")
    @HystrixCommand(fallbackMethod = "HiError")
    public Score getStudentScore(String stuName){
        stuName = "小小";
        ResponseEntity<Student> student = restTemplate.getForEntity(
                "http://service-student/student/getStudentByStuName?stuName=" + stuName, Student.class);
        return scoreService.getStudentScore(student.getBody().getStuId());
    }

    public Score HiError(String stuName){
        Score sc = new Score();
        sc.setChinese("77");
        return sc;
    }
}

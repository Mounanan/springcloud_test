package com.mouna.service.controller;

import com.mouna.service.bean.Student;
import com.mouna.service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    @RequestMapping("/getAllStudents")
////    @RequestMapping(value = "/getAll", method = POST, produces = "application/json")
//    public ModelAndView getAllStudents(Model model){
//        model.addAttribute("studentList",studentService.getAllStudents());
//        model.addAttribute("title","学生列表");
//        return new ModelAndView("index","studentModel", model);
//    }

    @RequestMapping(value = "/getStudentByStuName")
    public Student getStudentByStuName(@RequestParam String stuName){
        return studentService.getStudentByStuName(stuName);
    }

    @RequestMapping(value = "/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}

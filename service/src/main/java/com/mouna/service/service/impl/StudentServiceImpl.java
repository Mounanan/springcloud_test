package com.mouna.service.service.impl;

import com.mouna.service.bean.Student;
import com.mouna.service.dao.StudentMapper;
import com.mouna.service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentByStuName(String stuName) {
        return studentMapper.getStudentByStuName(stuName);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }


}

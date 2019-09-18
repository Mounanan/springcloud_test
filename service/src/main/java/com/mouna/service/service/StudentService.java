package com.mouna.service.service;

import com.mouna.service.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentByStuName(@Param("stuName") String stuName);
}

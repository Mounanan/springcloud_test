package com.mouna.service.dao;

import com.mouna.service.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {

    Student getStudentByStuName(@Param("stuName") String stuName);

    List<Student> getAllStudents();
}

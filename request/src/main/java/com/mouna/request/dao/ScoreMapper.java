package com.mouna.request.dao;

import com.mouna.request.bean.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ScoreMapper {

//    List<Score> getAllStudents();

    Score getStudentScore(@Param("stuId") String stuId);
}

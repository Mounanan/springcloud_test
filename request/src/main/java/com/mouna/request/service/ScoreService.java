package com.mouna.request.service;

import com.mouna.request.bean.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreService {

//    List<Score> getAllStudents();

    Score getStudentScore(@Param("stuId") String stuId);
}

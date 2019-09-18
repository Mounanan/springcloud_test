package com.mouna.request.service.impl;

import com.mouna.request.bean.Score;
import com.mouna.request.dao.ScoreMapper;
import com.mouna.request.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public Score getStudentScore(String stuId) {
        return scoreMapper.getStudentScore(stuId);
    }
}

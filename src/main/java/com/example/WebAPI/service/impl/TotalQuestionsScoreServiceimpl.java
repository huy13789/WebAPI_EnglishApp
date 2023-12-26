package com.example.WebAPI.service.impl;

import com.example.WebAPI.model.TotalQuestionsScore;
import com.example.WebAPI.repository.ITotalQuestionsScoreRespository;
import com.example.WebAPI.service.TotalQuestionsScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TotalQuestionsScoreServiceimpl implements TotalQuestionsScoreService {
    @Autowired
    private ITotalQuestionsScoreRespository repository;
    @Override
    public TotalQuestionsScore saveTotalScore(TotalQuestionsScore totalQuestionsScore) {
        return repository.save(totalQuestionsScore);
    }
}

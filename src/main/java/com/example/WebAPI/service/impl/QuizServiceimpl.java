package com.example.WebAPI.service.impl;

import com.example.WebAPI.model.Quiz;
import com.example.WebAPI.model.User;
import com.example.WebAPI.repository.IQuizRespository;
import com.example.WebAPI.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceimpl implements QuizService {
    @Autowired
    private IQuizRespository iQuizRespository;
    @Override
    public List<Quiz> getQuizByCategoryID(Long id) {
        return iQuizRespository.findByCategoryId(id);
    }

    @Override
    public Quiz getQuizById(Long quizId) {
        Optional<Quiz> optional = iQuizRespository.findById(quizId);
        if(optional.isPresent())
        {
            return optional.get();
        } else {
            throw new RuntimeException("User not found for id " + quizId);
        }
    }
}

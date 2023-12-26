package com.example.WebAPI.service;

import com.example.WebAPI.model.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> getQuizByCategoryID(Long id);
    Quiz getQuizById(Long quizId); // Thêm phương thức này
}

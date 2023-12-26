package com.example.WebAPI.repository;

import com.example.WebAPI.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionsRepository extends JpaRepository<Questions,Long> {
    @Query("SELECT p FROM Questions  p WHERE p.quiz.id = :id")
    List<Questions> findQByQuizId(Long id);
}

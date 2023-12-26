package com.example.WebAPI.repository;

import com.example.WebAPI.model.Quiz;
import com.example.WebAPI.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuizRespository extends JpaRepository<Quiz,Long> {
    @Query("SELECT p FROM Quiz  p WHERE p.category.id = :id")
    List<Quiz> findByCategoryId(Long id);
}

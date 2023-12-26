package com.example.WebAPI.repository;

import com.example.WebAPI.model.TotalQuestionsScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITotalQuestionsScoreRespository extends JpaRepository<TotalQuestionsScore,Long> {
}

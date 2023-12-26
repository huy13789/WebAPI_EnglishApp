package com.example.WebAPI.controller;

import com.example.WebAPI.model.TotalQuestionsScore;
import com.example.WebAPI.service.TotalQuestionsScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/totalScore")
public class TotalQuestionsScoreController {

    @Autowired
    private TotalQuestionsScoreService service;

    @PostMapping("/save")
    public ResponseEntity<String> saveTotalScore(@RequestBody TotalQuestionsScore totalScore) {
        try {
            TotalQuestionsScore savedScore = service.saveTotalScore(totalScore);
            return ResponseEntity.ok(savedScore.getTotalScoreId().toString());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error saving total score: " + e.getMessage());
        }
    }
}

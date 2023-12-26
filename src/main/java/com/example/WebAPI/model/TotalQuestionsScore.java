package com.example.WebAPI.model;

import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "totalquestionsscore")
    public class TotalQuestionsScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long totalScoreId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @Column(name = "total_score", nullable = true)
    private double totalScore;
}

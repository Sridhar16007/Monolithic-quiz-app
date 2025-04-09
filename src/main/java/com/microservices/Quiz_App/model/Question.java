package com.microservices.Quiz_App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String category;
    String difficultylevel;
    String questionsTitle;
    String option1;
    String option2;
    String option3;
    String option4;
    String rightAnswer;

    public Question(String category, String difficultylevel, String questionsTitle, String option1, String option2, String option3, String option4, String rightAnswer) {
        this.category = category;
        this.difficultylevel = difficultylevel;
        this.questionsTitle = questionsTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.rightAnswer = rightAnswer;
    }

}

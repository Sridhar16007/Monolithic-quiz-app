package com.microservices.Quiz_App.model;

import lombok.Data;

@Data
public class QuestionWrapper {

    int id;
    String questionsTitle;
    String option1;
    String option2;
    String option3;
    String option4;

    public QuestionWrapper(int id, String questionsTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionsTitle = questionsTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}

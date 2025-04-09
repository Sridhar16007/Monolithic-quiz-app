package com.microservices.Quiz_App.controller;

import com.microservices.Quiz_App.model.Question;
import com.microservices.Quiz_App.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //Http get methods
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
       return questionService.getQuestionsByCategory(category);
    }

    //Http post methods
    @PostMapping("addQuestions")
    public ResponseEntity<?> addAllQuestions(@RequestBody List<Question> questions){
        return questionService.addAllQuestions(questions);
    }

}

package com.microservices.Quiz_App.service;

import com.microservices.Quiz_App.model.Question;
import com.microservices.Quiz_App.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo repo;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(repo.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
       try{
           return new ResponseEntity<>(repo.findByCategory(category),HttpStatus.OK);
       } catch (Exception e) {
           e.printStackTrace();
       }
       return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<?> addAllQuestions(List<Question> questions) {
        try{
            repo.saveAll(questions);
            return new ResponseEntity<>("Succesfully added",HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Invalid Request",HttpStatus.BAD_REQUEST);
    }


}

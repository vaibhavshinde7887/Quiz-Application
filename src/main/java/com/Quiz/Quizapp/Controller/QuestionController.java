package com.Quiz.Quizapp.Controller;


import com.Quiz.Quizapp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

   @GetMapping("/allQuestions")
   public String getAllQuestions(){

       return questionService.getAllQuestions();

   }
}

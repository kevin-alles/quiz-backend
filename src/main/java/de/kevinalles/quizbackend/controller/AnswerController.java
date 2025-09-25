package de.kevinalles.quizbackend.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class AnswerController {

    @GetMapping("/answers/{id}")
    public String getAnswerById(@PathVariable Long id) {
        log.info("Fetching answer by ID '" + id + "'");
        return "Answer details";
    }

    @GetMapping("/answers/questions/{questionID}")
    public String getAnswersByQuestionId(@PathVariable Long questionID) {
        log.info("Fetching answers for question ID '" + questionID + "'");
        return "List of answers for the question";
    }
}

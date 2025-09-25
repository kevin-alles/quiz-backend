package de.kevinalles.quizbackend.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class QuestionController {

    @GetMapping("/questions")
    public String getAllQuestions() {
        log.info("Fetching all questions");
        return "List of all questions";
    }

    @GetMapping("/questions/{id}")
    public String getQuestionById(@PathVariable Long id) {
        log.info("Fetching question by ID '" + id + "'");
        return "Question details";
    }

    @GetMapping("/questions/number/{number}")
    public String getQuestionByNumber(@PathVariable Integer number) {
        log.info("Fetching question by number '" + number + "'");
        return "Question details by number";
    }
}

package de.kevinalles.quizbackend.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@RestController
@Log
public class StatisticController {

    @PutMapping("/statistics/{questionID}")
    public String addStatistics(@PathVariable Long questionID, @RequestParam int professionGroupID, @RequestParam int answerID) {
        log.info("Updating statistics for question ID '" + questionID + "', profession group ID '" + professionGroupID + "', answer ID '" + answerID + "'");
        return "Statistics added";
    }

    @GetMapping("/statistics/{questionID}")
    public String getStatisticsByQuestionId(@PathVariable Long questionID) {
        log.info("Fetching statistics for question ID '" + questionID + "'");
        return "Statistics details";
    }
}

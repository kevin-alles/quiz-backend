package de.kevinalles.quizbackend.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class ProfessionGroupController {

    @GetMapping("/profession-groups")
    public String getAllProfessionGroups() {
        log.info("Fetching all profession groups");
        return "List of all profession groups";
    }
}

package de.kevinalles.quizbackend.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class ReachableController {

    // Endpoint to check if the backend is reachable
    @PostMapping("/reachable")
    public String isReachable() {
        log.info("Backend is reachable");
        return "Backend is reachable";
    }
}

package de.kevinalles.quizbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReachableController {

    // Endpoint to check if the backend is reachable
    @PostMapping("/reachable")
    public String isReachable() {
        return "Backend is reachable";
    }
}

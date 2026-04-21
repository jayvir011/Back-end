package com.example.SpringBootAssignment.program1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String getGreeting() {
        GreetingModel model = new GreetingModel();
        return model.getMessage();
    }

    public static void main(String[] args) {
        SpringApplication.run(GreetingController.class, args);
    }
}

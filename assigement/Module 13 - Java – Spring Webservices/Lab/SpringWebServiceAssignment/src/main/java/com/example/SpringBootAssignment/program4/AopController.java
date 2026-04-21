package com.example.SpringBootAssignment.program4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AopController {

    @Autowired
    private MyService myService;

    @GetMapping("/run-aop")
    public String runAop() {
        myService.performTask();
        return "Check your console for AOP logs!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AopController.class, args);
    }
}

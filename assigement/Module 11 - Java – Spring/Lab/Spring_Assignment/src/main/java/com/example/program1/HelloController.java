package com.example.program1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    private HelloModel model = new HelloModel();

    @GetMapping("/")
    public String sayHello() {
        return model.getMessage();
    }
}

package com.example.program6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Program6App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Program6App.class, args);
        MyService service = context.getBean(MyService.class);
        service.performTask();
    }
}

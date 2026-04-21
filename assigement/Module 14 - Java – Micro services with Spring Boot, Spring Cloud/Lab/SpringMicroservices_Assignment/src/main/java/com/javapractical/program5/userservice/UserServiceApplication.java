package com.javapractical.program5.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/users")
public class UserServiceApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "8085");
        System.setProperty("spring.application.name", "user-service");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        return "User data for ID " + id + " from Program 5 Service";
    }
}

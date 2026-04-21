package com.javapractical.program7.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class UserServiceInstance1 {
    public static void main(String[] args) {
        System.setProperty("server.port", "8087");
        System.setProperty("spring.application.name", "user-service");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(UserServiceInstance1.class, args);
    }

    @GetMapping("/info")
    public String getInfo() {
        return "Response from Instance 1 (Port 8087)";
    }
}

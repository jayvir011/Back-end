package com.javapractical.program4.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class OrderServiceApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "8084");
        System.setProperty("spring.application.name", "order-service");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @GetMapping("/info")
    public String getInfo() {
        return "Order Service Registered with Eureka!";
    }
}

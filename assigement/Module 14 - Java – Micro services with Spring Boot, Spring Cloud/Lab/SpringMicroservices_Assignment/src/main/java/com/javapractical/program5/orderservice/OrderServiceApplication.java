package com.javapractical.program5.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("/orders")
public class OrderServiceApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        System.setProperty("server.port", "8086");
        System.setProperty("spring.application.name", "order-service");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable int id) {
        // Client-Side Discovery: Using logical service name "user-service"
        String result = restTemplate().getForObject("http://user-service/users/" + id, String.class);
        return "Order " + id + " fetched: " + result;
    }
}

package com.javapractical.program7.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class LoadBalancerClientApp {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        System.setProperty("server.port", "8089");
        System.setProperty("spring.application.name", "lb-client");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(LoadBalancerClientApp.class, args);
    }

    @GetMapping("/call")
    public String callService() {
        // Automatically balances between port 8087 and 8088
        return restTemplate().getForObject("http://user-service/info", String.class);
    }
}

package com.javapractical.program8.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class LoadBalancerGateway {

    public static void main(String[] args) {
        System.setProperty("server.port", "8090");
        System.setProperty("spring.application.name", "lb-gateway");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(LoadBalancerGateway.class, args);
    }

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("lb_route", r -> r.path("/test/**")
                        .filters(f -> f.rewritePath("/test/(?<segment>.*)", "/${segment}"))
                        .uri("lb://user-service"))
                .build();
    }
}

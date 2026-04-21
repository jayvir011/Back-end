package com.javapractical.program6.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {

    public static void main(String[] args) {
        System.setProperty("server.port", "8080");
        System.setProperty("spring.application.name", "gateway-service");
        System.setProperty("eureka.client.serviceUrl.defaultZone", "http://localhost:8761/eureka/");
        
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // Server-Side Discovery: Routing through Gateway using logical names
                .route("user_route", r -> r.path("/user/**")
                        .filters(f -> f.rewritePath("/user/(?<segment>.*)", "/${segment}"))
                        .uri("lb://user-service"))
                .route("order_route", r -> r.path("/order/**")
                        .filters(f -> f.rewritePath("/order/(?<segment>.*)", "/${segment}"))
                        .uri("lb://order-service"))
                .build();
    }
}

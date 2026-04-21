package com.javapractical.program3.orderservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Order {
    private int orderId;
    private String product;
    private int userId;
    private Object userDetails;
}

@RestController
@RequestMapping("/orders")
class OrderController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable int id) {
        Order order = new Order(501, "Smartwatch", 1, null);
        
        // Dynamic host for Docker support
        String host = System.getenv("USER_SERVICE_HOST");
        if (host == null) host = "localhost";
        
        String url = "http://" + host + ":8081/users/" + order.getUserId();
        Object user = restTemplate.getForObject(url, Object.class);
        
        order.setUserDetails(user);
        return order;
    }
}

@SpringBootApplication
public class OrderServiceApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        SpringApplication.run(OrderServiceApplication.class, args);
    }
}

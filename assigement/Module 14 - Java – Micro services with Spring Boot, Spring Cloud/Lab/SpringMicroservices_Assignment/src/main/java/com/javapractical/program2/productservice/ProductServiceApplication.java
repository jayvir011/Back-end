package com.javapractical.program2.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product {
    private int id;
    private String name;
    private int userId;
    private Object userDetails;
}

@RestController
@RequestMapping("/products")
class ProductController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        // Sample data
        Product product = new Product(101, "Laptop", 1, null);
        
        // Communication: Calling UserService on port 8081
        String userServiceUrl = "http://localhost:8081/users/" + product.getUserId();
        Object user = restTemplate.getForObject(userServiceUrl, Object.class);
        
        product.setUserDetails(user);
        return product;
    }
}

@SpringBootApplication
public class ProductServiceApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "8082");
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}

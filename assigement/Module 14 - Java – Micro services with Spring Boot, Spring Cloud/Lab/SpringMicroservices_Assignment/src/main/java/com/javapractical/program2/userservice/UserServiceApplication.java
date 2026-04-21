package com.javapractical.program2.userservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {
    private int id;
    private String name;
}

@RestController
@RequestMapping("/users")
class UserController {
    private List<User> users = new ArrayList<>();

    public UserController() {
        users.add(new User(1, "Alice"));
        users.add(new User(2, "Bob"));
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().orElse(null);
    }
}

@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) {
        System.setProperty("server.port", "8081");
        SpringApplication.run(UserServiceApplication.class, args);
    }
}

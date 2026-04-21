package com.example.program2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = Arrays.asList(
            new User("Jayvir", "jayvir@example.com"),
            new User("Rahul", "rahul@example.com"),
            new User("Sneha", "sneha@example.com")
        );
        model.addAttribute("users", users);
        return "program2/users";
    }
}

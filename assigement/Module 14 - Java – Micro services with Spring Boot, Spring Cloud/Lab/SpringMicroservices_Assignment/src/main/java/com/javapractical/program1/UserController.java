package com.javapractical.program1;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        if (user.isValid()) {
            users.add(user);
            return "User added successfully!";
        }
        return "Invalid User data!";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        for (User user : users) {
            if (user.getId() == id) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return "User updated successfully!";
            }
        }
        return "User not found!";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(user -> user.getId() == id);
        return "User deleted successfully!";
    }
}

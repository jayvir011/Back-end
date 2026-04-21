package com.example.program7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping("/login")
    public String login() { return "program7/login"; }

    @GetMapping("/admin")
    public String admin() { return "program7/admin"; }

    @GetMapping("/user")
    public String user() { return "program7/user"; }
}

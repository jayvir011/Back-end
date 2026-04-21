package com.example.program8;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class DashboardController {

    @GetMapping("/")
    public String index() {
        return "Welcome to OAuth2 Demo. <a href='/login'>Login with Google</a>";
    }

    @GetMapping("/userinfo")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
}

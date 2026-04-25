package com.campusbot.controller;

import com.campusbot.agent.OrchestratorAgent;
import com.campusbot.model.ChatRequest;
import com.campusbot.model.ChatResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChatController {

    private final OrchestratorAgent orchestratorAgent;

    @PostMapping("/chat")
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest request) {
        String response = orchestratorAgent.handle(request.getMessage());
        return ResponseEntity.ok(new ChatResponse(response));
    }
}

package com.campusbot.agent;

import com.campusbot.service.GeminiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ResponseGenerationAgent implements Agent {

    private final GeminiService geminiService;

    @Override
    public String getName() {
        return "ResponseGenerationAgent";
    }

    @Override
    public String handle(String query) {
        // This agent accepts a combination of User Query + Raw Data and generates a
        // polite response
        // Expected format of 'query' arg here: "USER_QUERY::RAW_DATA"

        String[] parts = query.split("::", 2);
        String userQuery = parts[0];
        String rawData = parts.length > 1 ? parts[1] : "No info found";

        String prompt = "You are a helpful Campus Bot. \n" +
                "User asked: \"" + userQuery + "\"\n" +
                "Core Information provided by system: \"" + rawData + "\"\n\n" +
                "Draft a polite, professional, and helpful response for the student using the Core Information. " +
                "Do not hallucinate info not present in Core Information.";

        return geminiService.generateContent(prompt);
    }
}

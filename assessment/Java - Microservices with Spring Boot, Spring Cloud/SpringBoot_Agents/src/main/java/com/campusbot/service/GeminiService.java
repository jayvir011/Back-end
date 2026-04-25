package com.campusbot.service;

import com.campusbot.config.GeminiConfig;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GeminiService {

    private final GeminiConfig geminiConfig;
    private final RestTemplate restTemplate;

    public String generateContent(String prompt) {
        String url = geminiConfig.getApiUrl() + "?key=" + geminiConfig.getApiKey();

        GeminiRequest request = new GeminiRequest();
        request.setContents(Collections.singletonList(new GeminiRunContent(
                Collections.singletonList(new GeminiPart(prompt)))));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<GeminiRequest> entity = new HttpEntity<>(request, headers);

        int maxRetries = 3;
        long waitTime = 2000; // 2 seconds

        for (int attempt = 0; attempt < maxRetries; attempt++) {
            try {
                ResponseEntity<GeminiResponse> response = restTemplate.postForEntity(url, entity, GeminiResponse.class);
                GeminiResponse body = response.getBody();
                if (body != null && body.getCandidates() != null && !body.getCandidates().isEmpty()) {
                    return body.getCandidates().get(0).getContent().getParts().get(0).getText();
                }
                return "No response from AI.";
            } catch (HttpServerErrorException.ServiceUnavailable | HttpClientErrorException.TooManyRequests e) {
                System.out.println("Gemini API is temporarily unavailable/rate-limited. Retrying... Attempt " + (attempt + 1) + " of " + maxRetries);
                if (attempt == maxRetries - 1) {
                    e.printStackTrace();
                    return "Error calling Gemini API: " + e.getMessage();
                }
                try {
                    Thread.sleep(waitTime);
                    waitTime *= 2; // Exponential backoff
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    return "Error: Retry interrupted.";
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "Error calling Gemini API: " + e.getMessage();
            }
        }
        return "No response from AI.";
    }

    // DTOs for Gemini API
    @Data
    static class GeminiRequest {
        private List<GeminiRunContent> contents;
    }

    @Data
    @AllArgsConstructor
    static class GeminiRunContent {
        private List<GeminiPart> parts;

        // No-args constructor for Jackson
        public GeminiRunContent() {
        }
    }

    @Data
    @AllArgsConstructor
    static class GeminiPart {
        private String text;

        // No-args constructor
        public GeminiPart() {
        }
    }

    @Data
    static class GeminiResponse {
        private List<GeminiCandidate> candidates;
    }

    @Data
    static class GeminiCandidate {
        private GeminiRunContent content;
    }

    // Helper interface for Lombok constructor generation fix if needed,
    // but static inner classes often need default constructors for JSON mapping.
}

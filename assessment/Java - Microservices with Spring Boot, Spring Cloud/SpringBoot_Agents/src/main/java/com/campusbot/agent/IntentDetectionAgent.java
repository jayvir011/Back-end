package com.campusbot.agent;

import com.campusbot.service.GeminiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IntentDetectionAgent implements Agent {

    private final GeminiService geminiService;

    @Override
    public String getName() {
        return "IntentDetectionAgent";
    }

    @Override
    public String handle(String query) {
        String prompt = "You are an Intent Detection Agent for a University Campus Bot. \n" +
                "Classify the following user query into one of these categories: \n" +
                "- ADMISSION\n" +
                "- ACADEMIC\n" +
                "- EXAM\n" +
                "- FEES\n" +
                "- PLACEMENT\n" +
                "- GENERAL\n\n" +
                "User Query: \"" + query + "\"\n" +
                "Respond ONLY with the category name. Do not add any punctuation or extra text.";

        String response = geminiService.generateContent(prompt).trim().toUpperCase();

        // Fallback or cleanup if AI is chatty
        if (response.contains("ADMISSION"))
            return "ADMISSION";
        if (response.contains("ACADEMIC"))
            return "ACADEMIC";
        if (response.contains("EXAM"))
            return "EXAM";
        if (response.contains("FEES"))
            return "FEES";
        if (response.contains("PLACEMENT"))
            return "PLACEMENT";

        return "GENERAL";
    }
}

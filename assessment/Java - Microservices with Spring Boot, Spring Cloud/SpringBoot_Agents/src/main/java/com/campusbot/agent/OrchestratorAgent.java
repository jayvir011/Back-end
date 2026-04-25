package com.campusbot.agent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrchestratorAgent implements Agent {

    private final IntentDetectionAgent intentDetectionAgent;
    private final AdmissionAgent admissionAgent;
    private final AcademicAgent academicAgent;
    private final ExamAgent examAgent;
    private final FeesAgent feesAgent;
    private final PlacementAgent placementAgent;
    private final ResponseGenerationAgent responseGenerationAgent;

    @Override
    public String getName() {
        return "OrchestratorAgent";
    }

    @Override
    public String handle(String userQuery) {
        // 1. Detect Intent
        String intent = intentDetectionAgent.handle(userQuery);
        System.out.println("DEBUG: Detected Intent: " + intent);

        // 2. Route to specific agent to get raw data
        String rawData;
        switch (intent) {
            case "ADMISSION":
                rawData = admissionAgent.handle(userQuery);
                break;
            case "ACADEMIC":
                rawData = academicAgent.handle(userQuery);
                break;
            case "EXAM":
                rawData = examAgent.handle(userQuery);
                break;
            case "FEES":
                rawData = feesAgent.handle(userQuery);
                break;
            case "PLACEMENT":
                rawData = placementAgent.handle(userQuery);
                break;
            default:
                rawData = "I am not sure about that. I can help with Admissions, Academics, Exams, Fees, and Placements.";
                break;
        }

        // 3. Generate Final Response
        return responseGenerationAgent.handle(userQuery + "::" + rawData);
    }
}

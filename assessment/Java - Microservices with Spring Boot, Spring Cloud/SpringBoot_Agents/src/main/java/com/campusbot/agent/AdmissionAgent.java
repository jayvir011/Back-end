package com.campusbot.agent;

import org.springframework.stereotype.Component;

@Component
public class AdmissionAgent implements Agent {
    @Override
    public String getName() {
        return "AdmissionAgent";
    }

    @Override
    public String handle(String query) {
        // In a real app, this would query a database. here we use mock data.
        return "Admission Info: Applications for 2024 are open for B.Tech and MBA. " +
                "Eligibility: 75% in 12th grade for B.Tech. " +
                "Last date to apply is 30th June. " +
                "Visit www.university.edu/admissions for more details.";
    }
}

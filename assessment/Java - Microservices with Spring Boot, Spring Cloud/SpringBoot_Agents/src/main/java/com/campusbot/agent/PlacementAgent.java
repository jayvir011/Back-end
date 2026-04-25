package com.campusbot.agent;

import org.springframework.stereotype.Component;

@Component
public class PlacementAgent implements Agent {
    @Override
    public String getName() {
        return "PlacementAgent";
    }

    @Override
    public String handle(String query) {
        return "Placement Cell: Top recruiters this year include Google, Microsoft, and Amazon. " +
                "Average package: $12,000. Highest package: $45,000. " +
                "Internship drive starts next month.";
    }
}

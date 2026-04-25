package com.campusbot.agent;

import org.springframework.stereotype.Component;

@Component
public class FeesAgent implements Agent {
    @Override
    public String getName() {
        return "FeesAgent";
    }

    @Override
    public String handle(String query) {
        return "Finance Dept: Annual tuition fee for B.Tech is $2000. " +
                "Last date for fee payment without penalty is August 15th. " +
                "Scholarships available for merit students (>90% marks).";
    }
}

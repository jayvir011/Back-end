package com.campusbot.agent;

import org.springframework.stereotype.Component;

@Component
public class ExamAgent implements Agent {
    @Override
    public String getName() {
        return "ExamAgent";
    }

    @Override
    public String handle(String query) {
        return "Exam Section: Mid-term exams are scheduled from Oct 10th to Oct 15th. " +
                "Results for last semester have been declared. Check the portal for details. " +
                "Passing criteria is 40% in theory.";
    }
}

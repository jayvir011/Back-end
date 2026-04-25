package com.campusbot.agent;

import org.springframework.stereotype.Component;

@Component
public class AcademicAgent implements Agent {
    @Override
    public String getName() {
        return "AcademicAgent";
    }

    @Override
    public String handle(String query) {
        return "Academic Info: We offer B.Tech (CS, IT, Mech, EC), MBA, and BBA. " +
                "Odd semester classes start from August 1st. " +
                "Timetable is available on the student portal.";
    }
}

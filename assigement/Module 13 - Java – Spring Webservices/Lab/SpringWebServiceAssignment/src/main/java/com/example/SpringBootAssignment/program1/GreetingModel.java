package com.example.SpringBootAssignment.program1;

public class GreetingModel {
    private String message;

    public GreetingModel() {
        this.message = "Hello, World!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

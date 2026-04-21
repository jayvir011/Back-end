package com.example.SpringBootAssignment.program4;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.SpringBootAssignment.program4.MyService.performTask(..))")
    public void logBefore() {
        System.out.println("LOG: Method execution started at " + System.currentTimeMillis());
    }

    @After("execution(* com.example.SpringBootAssignment.program4.MyService.performTask(..))")
    public void logAfter() {
        System.out.println("LOG: Method execution finished at " + System.currentTimeMillis());
    }
}

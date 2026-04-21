package com.example.program6;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.program6.MyService.*(..))")
    public void logBefore() {
        System.out.println("LoggingAspect: @Before method execution");
    }

    @After("execution(* com.example.program6.MyService.*(..))")
    public void logAfter() {
        System.out.println("LoggingAspect: @After method execution");
    }

    @Around("execution(* com.example.program6.MyService.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggingAspect: @Around method - starting");
        Object result = joinPoint.proceed();
        System.out.println("LoggingAspect: @Around method - finished");
        return result;
    }
}

package com.example.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggerAspect {

    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint)throws  Throwable{
        logger.info(joinPoint.getSignature().toString() + "method execution started");
        Instant start = Instant.now();
        joinPoint.proceed(); // telling the spring to continue
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the method is: " + timeElapsed + " milli second");
        logger.info(joinPoint.getSignature().toString() + "method execution ended");
    }

    @AfterThrowing(value = "execution(* com.example.services.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        logger.log(Level.SEVERE, "An exception thrown with the help of " +
                    "@AfterThrowing which happened due to : " + ex.getMessage());
    }

    @AfterReturning(value = "execution(* com.example.services.*.*(..))", returning = "returningValue")
    public void logStatus(JoinPoint joinPoint, Object returningValue) {
        logger.log(Level.INFO, joinPoint.getSignature() +  "method successfully processed with the status"
                + returningValue.toString());
    }
}

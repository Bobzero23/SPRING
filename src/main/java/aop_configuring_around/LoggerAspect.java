package aop_configuring_around;

/*This is the pojo bean class where you put all of your logic operations*/

/*imports*/
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
/*bean class*/
public class LoggerAspect {

    /*initializing the logger object with getLogger method*/
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    /*this is one of the AOP advices, but I really don't know what I wrote inside it hhhh*/
    @Around("execution(* aop_configuring_around.*.*(..))")
    /*creating a method because we want to move all the logger to this Aspect class*/
    /*this method is used to control the flow of actual method invocation*/
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        /*from here these are the before requirements*/
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();
        /*here we are telling the spring that we are done, so it proceed wit the after requirements*/
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute method is: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end");
    }


}

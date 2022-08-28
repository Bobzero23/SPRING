package aop_configuring_around;

/*This is the pojo bean class where you put all of your logic operations*/

/*imports*/
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
/*bean class*/
public class LoggerAspect {

    /*creating the logger object with getLogger method*/
    private Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    /*creating a method because we want to move all the logger to this Aspect class*/
    /*this method is used to control the flow of actual method invocation*/
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString() + " method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        logger.info("Time took to execute method is: " + timeElapsed);
        logger.info(joinPoint.getSignature().toString() + " method execution end");
    }


}

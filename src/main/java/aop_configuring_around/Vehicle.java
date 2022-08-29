package aop_configuring_around;

/*imports*/
import bean13_assignment.Speakers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
/*pojo bean class for vehicle*/
public class Vehicle {

    /*initialing object of the Logger with get logger method*/
    private Logger logger = Logger.getLogger(Vehicle.class.getName());

    @Autowired
    private Speakers speakers;
}

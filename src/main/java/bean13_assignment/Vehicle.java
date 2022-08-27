package bean13_assignment;

/*imports*/
import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
/*pojo class for vehicle*/
public class Vehicle {

    /*creating a field for vehicle*/
    private String name;

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name){
        this.name = name;
    }

    @Override
    /*to string method*/
    public String toString(){
        return  name;
    }
}

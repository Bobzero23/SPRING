package bean6_post_constructor;

/*import*/
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/*pojo class*/
@Component
public class Vehicle {

    /*creating a field*/
    private String name;

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name) {
        this.name = name;
    }

    /*using postConstructor*/
    @PostConstruct
    public void initialize(){
        this.name = "Mercedes";
    }
}

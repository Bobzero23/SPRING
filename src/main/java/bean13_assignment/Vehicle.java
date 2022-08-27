package bean13_assignment;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*pojo class for vehicle*/
public class Vehicle {

    /*creating a field for vehicle and service*/
    private String name;
    private Service service;

    /*constructor*/
//    @Autowired
//    Vehicle(@Qualifier("service1") Service service){
//        System.out.println("vehicle bean has been created");
//        this.service = service;
//    }

    public Vehicle() {

    }

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

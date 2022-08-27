package bean13_assignment;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/*pojo class for person*/
public class Person {

    /*creating a field for person and vehicle*/
    private String name = "Bobzero";
    private Vehicle vehicle;

    /*I am using @autowired on constructor,*/
    /*and also I am using qualifier here just in case*/
    @Autowired
    Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    /*getter for person*/
    public String getName(){
        return name;
    }

    /*setter for person*/
    public void setName(String name){
        this.name = name;
    }

    /*getter for vehicle*/
    public Vehicle getVehicle(){
        return vehicle;
    }

    /*setter for vehicle*/
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }
}

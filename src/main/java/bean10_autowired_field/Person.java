package bean10_autowired_field;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*Pojo*/
@Component
public class Person {

    /*initializing a field*/
    private String name = "TheProblem";

    @Autowired
    /*dependency injection using autowired annotation*/
    private Vehicle vehicle;

    /*getter for name*/
    public String getName(){
        return name;
    }

    /*setter for name*/

    public void setName(String name) {
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

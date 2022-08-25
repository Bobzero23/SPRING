package bean11_autowired_constructor;

/*Demonstration on how to use @autowired on constructor*/

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/*pojo class*/
public class Person {

    /*field of the class*/
    private String name = "Bobzero";

    /*field of Vehicle class*/
    private Vehicle vehicle;

    @Autowired
    /*using @autowired on constructor*/
    Person(Vehicle vehicle){
        System.out.println("Person bean is created");
        this.vehicle = vehicle;
    }

    /*getter for the person*/
    public String getName() {
        return name;
    }

    /*setter for the person*/
    public void setName(String name) {
        this.name = name;
    }

    /*getter for the vehicle*/
    public Vehicle getVehicle(){
        return vehicle;
    }

    /*setter for the vehicle*/
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

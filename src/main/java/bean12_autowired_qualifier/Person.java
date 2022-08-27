package bean12_autowired_qualifier;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
/*pojo class for person*/
public class Person {

    /*person field*/
    private String name = "Bobzero";

    /*declaring vehicle field*/
    private Vehicle vehicle;

    @Autowired
    /*constructor*/
    public Person(Vehicle vehicle){
        System.out.println("Person bean has been created");
        this.vehicle = vehicle;
    }

    /*getter for person*/
    public String getName() {
        return name;
    }

    /*setter for person*/
    public void setName(String name) {
        this.name = name;
    }

    /*getter for vehicle*/
    public Vehicle getVehicle(){
        return vehicle;
    }

}

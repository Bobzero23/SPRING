package bean12_autowired_qualifier;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*pojo class for person*/
public class Person {

    /*person field*/
    private String name = "Bobzero";

    /*declaring vehicle field*/
    private Vehicle vehicle;

    @Autowired
    /*constructor*/
    Person(@Qualifier("vehicle1") Vehicle vehicle){
        System.out.println("Person been is created");
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

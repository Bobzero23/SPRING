package bean10_autowired;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*Pojo class*/
public class Vehicle {

    /*initializing a field*/
    private String name = "Bentley";

    /*constructor*/
    public Vehicle(){
        System.out.println("Vehicle bean is created");
    }

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

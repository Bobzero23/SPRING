package bean13_assignment;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "vehicleBean")
/*pojo class for vehicle*/
public class Vehicle {

    /*creating a field for vehicle and service*/
    private String name = "Ferrari";
    private final Service service;

    /*constructor*/
    @Autowired
    public Vehicle(Service service){
        this.service = service;
    }

    /*getter*/
    public String getName(){
        return name;
    }

    /*setter*/
    public void setName(String name){
        this.name = name;
    }

    /*getter for the service*/
    public Service getService() {
        return service;
    }

    @Override
    /*to string method*/
    public String toString(){
        return  name;
    }
}

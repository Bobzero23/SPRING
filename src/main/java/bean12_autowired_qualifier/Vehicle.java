package bean12_autowired_qualifier;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*pojo class for vehicle*/
public class Vehicle {

    /*vehicle field*/
    private  String name;

    /*getter*/
    public String getName() {
        return name;
    }

    /*setter*/
    public void setName(String name) {
        this.name = name;
    }

    @Override
    /*to string method*/
    public String toString(){
        return name;
    }
}

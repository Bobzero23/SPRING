package bean11_autowired_constructor;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*pojo class*/
public class Vehicle {

    /*field*/
    private String name = "Ferrari";

    /*setter*/
    public void setName(String name) {
        this.name = name;
    }

    /*getter*/
    public String getName() {
        return name;
    }

    /*to string method*/
    @Override
    public String toString() {
        return name;
    }
}


package bean13_assignment;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*pojo class for service*/
public class Service {

    /*creating field*/
    private String name = "Super Service";

    /*getter for service*/
    public String getName() {
        return name;
    }

    /*setter for service*/
    public void setName(String name) {
        this.name = name;
    }

    /*to string method*/
    @Override
    public String toString() {
        return name;
    }
}

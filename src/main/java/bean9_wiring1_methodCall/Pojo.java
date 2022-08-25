package bean9_wiring1_methodCall;

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*This is a Pojo class*/
@Configuration
public class Pojo {

    @Bean
    /*creating a Vehicle bean called Ferrari*/
    Vehicle vehicle (){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Bentley");
        return vehicle;
    }

    @Bean
    /*creating a Person bean and wiring to the Ferrari vehicle of Vehicle bean*/
    Person person(){
        Person person = new Person();
        person.setName("Bobzero");
        person.setVehicle(vehicle());
        return person;
    }

}

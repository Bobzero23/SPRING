package bean9_wiring1_methodCall;

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjConfig {

    @Bean
    /*creating a Vehicle bean called Ferrari*/
    Vehicle vehicle (){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Bentley");
        return vehicle;
    }

    @Bean
    /*creating a Person bean and wiring to the Bentley vehicle of Vehicle bean*/
    Person person(){
        Person person = new Person();
        person.setName("Bobzero");
        person.setVehicle(vehicle()); // HERE IS WHERE THE WIRING HAPPENS
        return person;
    }

}

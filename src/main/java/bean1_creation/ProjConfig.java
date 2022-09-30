package bean1_creation;

/*must imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjConfig {

    /*creating a bean method to return a name of the vehicle*/
    @Bean
    Vehicle vehicle(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    String hello(){
        return "Hello world";
    }

    @Bean
    Integer number(){
        return 23;
    }

}

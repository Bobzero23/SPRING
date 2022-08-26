package bean12_autowired_qualifier;

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean12_autowired_qualifier")
public class ProjConfig {

    @Bean
    /*bean for vehicle1*/
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    /*bean for vehicle1*/
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Lamborghini");
        return veh;
    }

    @Bean
    /*bean for vehicle1*/
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Bentley");
        return veh;
    }
}

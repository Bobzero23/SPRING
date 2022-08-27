package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean13_assignment")
public class ProjConfig {

    /*****************CREATING BEANS FOR VEHICLES*****************/
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Bentley");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Lamborghini");
        return veh;
    }

    /***************CREATING BEANS FOR SERVICE****************/

    @Bean
    Service service1 (){
        var ser = new Service();
        ser.setName("This is service one");
        return ser;
    }

    @Bean
    Service service2(){
        var ser = new Service();
        ser.setName("This is service two");
        return  ser;
    }
}

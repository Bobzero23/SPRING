package bean2_NoUnique_exception;

/*This is the class which will have all the beans in it*/

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjConfig {


    /*creating a bean method with type of the Vehicle class to return the name of the vehicle*/
    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }


    /*creating another bean method with a different name but from same class type to return another name*/
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Lambo");
        return veh;
    }


    /*creating another bean method with a different name but from same class type to return another name*/
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Bugatti");
        return veh;
    }

}

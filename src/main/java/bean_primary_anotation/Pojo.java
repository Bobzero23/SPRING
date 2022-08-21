package bean_primary_anotation;

/*this is the bean class where we create our beans*/

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Pojo {

    /*CREATING THREE BEANS WITH THE SAME NAME WITH ONE PRIMARY ANNOTATION*/

    @Bean
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Lambo");
        return veh;
    }
    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Bugatti");
        return veh;
    }
    @Primary
    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}

package bean3;

/*This is the bean class*/

/*imports*/
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Pojo {

    /*customizing a bean name using name = "" */
    @Bean(name = "Cheap vehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

    /*customizing a bean name using value = "" */
    @Bean(value = "Mid vehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    /*customizing a bean name by just giving the String "" */
    @Bean("Expensive vehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}

package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*pojo class for Sonny speakers to implement speakers*/
public class SonnySpeakers implements Speakers{
    @Override
    @Primary
    public String makeSound() {
        return "We got Sonny on the track..";
    }
}

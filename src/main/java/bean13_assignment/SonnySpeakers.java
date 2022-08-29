package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
/*pojo class for Sonny speakers to implement speakers*/
public class SonnySpeakers implements Speakers{
    @Override
    public String makeSound(Song song) {
        return "We got Sonny on the track..";
    }
}

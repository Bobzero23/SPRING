package bean13_assignment;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*pojo class for Bose speakers to implement speakers*/
public class BoseSpeakers implements Speakers{
    @Override
    public String makeSound(Song song) {
        return "We got Bose on the track";
    }
}

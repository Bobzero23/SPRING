package bean13_assignment;

/*pojo class for Bose speakers to implement speakers*/
public class BoseSpeakers implements Speakers{
    @Override
    public String makeSound() {
        return "We got Bose on the track";
    }
}

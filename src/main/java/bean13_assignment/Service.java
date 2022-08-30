package bean13_assignment;

/*imports*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/*pojo class for service*/
public class Service {

    /*creating fields for service, speakers and tyres*/
    private String name = "Super VehicleService";
    private Tyres tyres;
    private Speakers speakers;
    private Song song;

    @Autowired
    /*constructor*/
    public Service(Speakers speakers, Tyres tyres){
        this.speakers = speakers;
        this.tyres = tyres;
    }

    /*method for the speaker to play music*/
    public void playMusic(){
        String music = speakers.makeSound(song);
        System.out.println(music);
    }

    /*method for the tyres to rotate*/
    public void moveTyres(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    /*getter for service*/
    public String getName() {
        return name;
    }

    /*setter for service*/
    public void setName(String name) {
        this.name = name;
    }

    /*to string method*/
    @Override
    public String toString() {
        return name;
    }
}

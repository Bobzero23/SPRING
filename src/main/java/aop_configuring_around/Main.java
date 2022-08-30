package aop_configuring_around;

/*imports*/
import bean13_assignment.Song;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*getting the proxy bean of the service class*/
        var vehicleService = context.getBean(VehicleService.class);

        /*displaying the data type of the VehicleService class*/
        System.out.println("The data type of the VehicleService class is : " + vehicleService.getClass());

        /*creating object of the song class*/
        Song song = new Song();

        /*setting the title of the song*/
        song.setTitle("Blank Space");

        /*setting the singer name*/
        song .setSingerName("Tylor Swift");

        /*setting our stared vehicle boolean value to true*/
        boolean vehicleStarted = true;

        /*creating variables for the methods*/
        String moveVehicleStatus = vehicleService.moveVehicle(vehicleStarted);
        String playMusicStatus = vehicleService.playMusic(vehicleStarted, song);
        String applyBrakeStatus = vehicleService.applyBrake(vehicleStarted);


    }

}

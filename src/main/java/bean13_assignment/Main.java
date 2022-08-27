package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*getting the bean of the person*/
        Person person = context.getBean(Person.class);

        /*Now using the car according to our desire*/
        person.getVehicle().getService().playMusic();





    }

}

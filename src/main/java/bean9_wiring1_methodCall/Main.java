package bean9_wiring1_methodCall;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating the IoC Container object*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*getting the bean of person using IoC object*/
        Person person = context.getBean(Person.class);

        /*getting the bean of Vehicle using IoC object*/
        Vehicle vehicle = context.getBean(Vehicle.class);

        /*displaying the name of the person in the IoC*/
        System.out.println("The Person bean in IoC is: " + person.getName());

        /*displaying the name of the vehicle in the IoC*/
        System.out.println("The Vehicle bean in IoC is: " + vehicle.getName());

        /*displaying the name of the car of the person in the IoC*/
        System.out.println("The vehicle bean of the person is: " + person.getVehicle());
    }

}

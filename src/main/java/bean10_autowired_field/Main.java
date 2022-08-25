package bean10_autowired_field;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*getting the bean of the Vehicle*/
        Vehicle vehicle = context.getBean(Vehicle.class);

        /*getting the bean of the Person*/
        Person person = context.getBean(Person.class);

        /*displaying the bean in IoC for the vehicle*/
        System.out.println("The IoC bean for the vehicle is: " + vehicle.getName());

        /*displaying the bean in IoC for the Person*/
        System.out.println("The IoC bean for the person is: " + person.getName());

        /*displaying the bean in IoC for the vehicle of the person*/
        System.out.println("The Ioc bean of the person for the vehicle is: " + person.getVehicle());
    }
}

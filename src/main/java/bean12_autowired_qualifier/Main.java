package bean12_autowired_qualifier;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of IoC*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*getting the bean of the person in the IoC*/
        Person person = context.getBean(Person.class);

        /*getting the bean of the vehicle in the IoC*/
        Vehicle vehicle = context.getBean("vehicle3", Vehicle.class);

        /*displaying the bean of the vehicle3*/
        System.out.println("The bean of the vehicle3 is: " + vehicle.getName());

        /*displaying the bean of the person*/
        System.out.println("The person bean is: " + person.getName());

        /*displaying the bean of the vehicle*/
        System.out.println("The vehicle bean is: " + vehicle.getName());

        /*displaying the bean of the vehicle of the person*/
        System.out.println("The bean vehicle of the person " + person.getVehicle());


    }
}

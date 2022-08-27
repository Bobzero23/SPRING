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

        /*getting the bean of the vehicle3*/
        Vehicle vehicle = context.getBean("vehicle3", Vehicle.class);

        /*displaying the bean of the person*/
        System.out.println("The bean for person is: " + person.getName());

        /*displaying the bean of vehicle3*/
        System.out.println("The bean of the vehicle3 is: " + vehicle.getName());

        /*displaying the vehicle bean of the person*/
        System.out.println("The vehicle bean of the person is: " + person.getVehicle());

        /*getting the bean of the service*/
        Service service = context.getBean("service1",Service.class);

        /*displaying the bean of the service*/
        System.out.println("The bean of the service is: " + service.getName());
    }

}

package bean8_with_xml;

/*imports*/
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the IoC Container using classpath..*/
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is: " + vehicle.getName());

    }
}

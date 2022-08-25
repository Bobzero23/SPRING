package bean6_post_constructor;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the bean class*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*creating object of the component class and getting the bean*/
        Vehicle vehicle = context.getBean(Vehicle.class);

        /*displaying the bean*/
        System.out.println("The vehicle in the bean is: " + vehicle.getName());

    }
}

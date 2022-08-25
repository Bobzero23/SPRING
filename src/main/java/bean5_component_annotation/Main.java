package bean5_component_annotation;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the bean class*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*creating the object of the Vehicle class*/
        Vehicle vehicle = context.getBean(Vehicle.class);

        /*displaying the name of the bean*/
        System.out.println("The bean name is: " + vehicle.getName() + ", because we cant name the beans object here");

        /*calling the method inside the Vehicle class*/
        vehicle.method();

    }
}

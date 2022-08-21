package bean_with_names;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the bean class*/
        var context = new AnnotationConfigApplicationContext(Pojo.class);

        /*creating object the object of Vehicle and getting the bean with name and displaying it*/
        Vehicle veh1 = context.getBean("Cheap vehicle", Vehicle.class);
        System.out.println("The cheap car is: " + veh1.getName());

        /*creating object the object of Vehicle and getting the bean with value and displaying it*/
        Vehicle veh2 = context.getBean("Mid vehicle", Vehicle.class);
        System.out.println("The Mid car is: " + veh2.getName());

        /*creating object the object of Vehicle and getting the bean with just string and displaying it*/
        Vehicle veh3 = context.getBean("Expensive vehicle", Vehicle.class);
        System.out.println("The Expensive car is: " + veh3.getName());

    }
}

package bean_primary_anotation;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the bean class*/
        var context = new AnnotationConfigApplicationContext(Pojo.class);

        /*creating object of Vehicle class and getting a bean with no parameter*/
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("The primary bean vehicle is: " +veh.getName());
    }
}

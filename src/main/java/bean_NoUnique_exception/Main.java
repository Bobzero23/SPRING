package bean_NoUnique_exception;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the Pojo class using annotation config as usual*/
        var context = new AnnotationConfigApplicationContext(Pojo.class);

        /*getting the bean the wrong because there multiple beans with the same name*/
        /*We have to create the object of teh Vehicle class because that is the class where the method type came from*/
        //Vehicle veh = context.getBean(Vehicle.class);

        /*getting the bean the right way because now we are passing two parameters*/
        Vehicle veh = context.getBean("vehicle2", Vehicle.class);

        /*displaying the bean*/
        System.out.println("The name of the vehicle is: " + veh.getName());
    }
}

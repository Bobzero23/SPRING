package bean1_creation;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the class which is not POJO*/
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Bugatti");
        System.out.println("The name from NON-POJO class: " + vehicle.getName());

        /*now creating object of POJO class and initiating the class*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*creating object to fetch the Bean*/
        Vehicle veh = context.getBean(Vehicle.class);

        /*fetching the name using the object we created*/
        System.out.println("The name of the car from the bean is: " + veh.getName());

        /*Since the other beans are from the POJO itself we don't have to add any casting
        * we can simply call them using the object of the POJO itself that we created*/

        /* creating object of the String class*/
        String hello = context.getBean(String.class);
        System.out.println("The string bean says: " + hello);

        /*creating object of the Integer class*/
        Integer number = context.getBean(Integer.class);
        System.out.println("What does MJ wear: " + number);




    }
}

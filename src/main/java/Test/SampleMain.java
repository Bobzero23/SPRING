package Test;

/*This is a main class where we do all of our of business logic, but the main point here is to use REGISTER*/

/*imports*/
import bean12_autowired_qualifier.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

/*Main class*/
public class SampleMain {

    /*main method*/
    public static void main(String[] args) {

        /*creating the object of the IoC*/
        var context = new AnnotationConfigApplicationContext(SampleProjConfig.class);

        /*setting the names using supplier object*/
        Supplier<Vehicle> BMWSupplier = () -> {
            Vehicle vehicle1 = new Vehicle();
            vehicle1.setName("BMW");
            return vehicle1;
        };

        Supplier<Vehicle> AUDISupplier = () -> {
            Vehicle vehicle2 = new Vehicle();
            vehicle2.setName("AUDI");
            return vehicle2;
        };

        /*Creating the Random class object*/
        Random random = new Random();

        /*instantiating the random variable*/
        int random_number = random.nextInt(10);

        /*displaying the random number*/
        System.out.println("The random number created is: " + random_number);

        /*generating the bean accordingly*/
        /*handling the exceptions*/
        try {
            if (random_number % 2 == 0){
                context.registerBean("BMW", Vehicle.class, BMWSupplier);
            }else {
                context.registerBean("AUDI", Vehicle.class, AUDISupplier);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        /*Nullifying the beans*/
        Vehicle AudiVehicle = null;
        Vehicle BMWVehicle = null;

        /*getting the BMW bean*/
        try {
            BMWVehicle = context.getBean("BMW", Vehicle.class);
        }catch (Exception e){
            System.out.println(e);
        }

        /*getting the AUDI bean*/
        try {
            AudiVehicle = context.getBean("AUDI", Vehicle.class);
        }catch (Exception e){
            System.out.println(e);
        }

        /*checking which bean is created*/
        if (null != AudiVehicle){
            System.out.println("The Audi bean is created...");
        }else {
            System.out.println("The BMW bean is created..");
        }















    }
}

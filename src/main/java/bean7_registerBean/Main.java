package bean7_registerBean;

/*imports*/
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*creating object of the Vehicle class*/
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Audi");

        /*creating a Supplier object, so we can display the object of the vehicle above*/
        Supplier<Vehicle> AudiSupplier = () -> vehicle1;

        /*creating a supplier object and put everything in its body*/
        /*we have to make the return type since we write the code ourselves*/
        Supplier<Vehicle> BMWSupplier = () -> {
            Vehicle vehicle2 = new Vehicle();
            vehicle2.setName("BMW");
            return vehicle2;
        };

        /*creating object of the Random class*/
        /*This class we create a random number between 0 - 10*/
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("The random number generated is: " + randomNumber);

        /*creating a condition to register a bean accordingly*/
        if (randomNumber % 2 == 0){
            context.registerBean("BMW", Vehicle.class, BMWSupplier);
        }else {
            context.registerBean("Audi", Vehicle.class, AudiSupplier);
        }

        /*Now getting the bean and Nullification*/
        Vehicle AudiVehicle = null;
        Vehicle BMWVehicle = null;

        /*for Audi*/
        try{
           AudiVehicle =  context.getBean("Audi", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while trying to create a bean of Audi Vehicle");
        }

        /*for BMW*/
        try {
            BMWVehicle = context.getBean("BMW", Vehicle.class);
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("Error while trying to create a bean for BMW vehicle");
        }

        /*Confirmation messages*/
        if(null != AudiVehicle){
            System.out.println("The bean for Audi vehicle is created.");
        }else {
            System.out.println("The bean for BMW vehicle is created.");
        }
    }
}

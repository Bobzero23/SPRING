package aop_configuring_around;

/*imports*/
import bean13_assignment.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        /*getting the proxy bean of the service class*/
        var service = context.getBean(Service.class);

        /*displaying the data type of the VehicleService class*/
        System.out.println("The data type of the VehicleService class is : " + service.getName());


    }

}

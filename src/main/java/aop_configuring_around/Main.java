package aop_configuring_around;

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

        /*displaying the proxy bean of the service class*/
        System.out.println("The proxy bean of the service class is : " + service.getName());


    }

}

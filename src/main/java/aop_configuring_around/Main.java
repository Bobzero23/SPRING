package aop_configuring_around;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of the IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    }

}

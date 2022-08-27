package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*main class*/
public class Main {

    /*main method*/
    public static void main(String[] args) {

        /*creating object of IoC Container*/
        var context = new AnnotationConfigApplicationContext(ProjConfig.class);

        /*getting the bean of the person*/
        Person person = context.getBean(Person.class);

        /*displaying the bean of the person*/
        System.out.println("The bean of the person is: " + person.getName());

        /*getting the person bean to the array to see what is going on behind the scene on debugging*/




    }

}

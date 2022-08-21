package bean5_component_annotation;

/*This is the bean class where we do all of our configuration*/

/*imports*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "bean5_component_annotation")
/*as you can see I used the component annotation and mentioned the packages*/
public class Pojo {
}

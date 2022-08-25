package bean5_component_annotation;

/*imports*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "bean5_component_annotation")
/*as you can see I used the component annotation and mentioned the packages*/
public class ProjConfig {
}

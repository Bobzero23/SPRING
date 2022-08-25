package bean7_registerBean;

/*imports*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*As you can see I mentioned the component scan annotation willingly though it is not
* going to find any component because I didn't want to use it, but I used configuration annotation to specify the pojo*/
@Configuration
@ComponentScan(basePackages = "bean7_registerBean")
public class ProjConfig {
}

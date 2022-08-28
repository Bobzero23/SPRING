package aop_configuring_around;

/*imports*/
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aop_configuring_around")
@EnableAspectJAutoProxy
public class ProjectConfig {
}

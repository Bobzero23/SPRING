package bean13_assignment;

/*imports*/
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
/*pojo class for Michelin tyres to implement tyres*/
public class MichelinTyres implements Tyres{

    @Override
    public String rotate(){
        return "Michelin tyres ready to go";
    }

    @Override
    public String stop() {
        return "The vehicle stopped with the help of Michelin tyres";
    }
}

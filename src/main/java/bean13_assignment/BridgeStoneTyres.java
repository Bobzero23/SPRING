package bean13_assignment;

/*imports*/
import org.springframework.stereotype.Component;

@Component
/*pojo class for BridgeStone tyres to implement tyres*/
public class BridgeStoneTyres implements Tyres{

    @Override
    public String rotate(){
        return "BridgeStone tyres ready to go";
    }

    @Override
    public String stop() {
        return "The vehicle stopped with the help of BridgeStone tyres";
    }


}

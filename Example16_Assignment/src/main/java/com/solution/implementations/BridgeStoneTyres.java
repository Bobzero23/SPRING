package com.solution.implementations;

import com.solution.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate() {
        return "Using the BridgeStone Tyres";
    }
}

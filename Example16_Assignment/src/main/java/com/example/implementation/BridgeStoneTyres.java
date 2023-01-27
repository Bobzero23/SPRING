package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStoneTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Rotating BridgesStone tyres");
    }
}

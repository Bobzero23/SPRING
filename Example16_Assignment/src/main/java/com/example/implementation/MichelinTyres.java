package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public void rotate() {
        System.out.println("Rotating Michelin Tyres");
    }
}

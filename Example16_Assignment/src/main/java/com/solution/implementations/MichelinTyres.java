package com.solution.implementations;

import com.solution.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class MichelinTyres implements Tyres {
    @Override
    public String rotate() {
        return "Using the Michelin Tyres";
    }
}

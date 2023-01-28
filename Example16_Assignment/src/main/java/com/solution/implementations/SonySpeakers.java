package com.solution.implementations;

import com.solution.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound() {
        return "Playing music with Sony Speakers";
    }
}

package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public void makeSound() {
        System.out.println("Sound of the Sony speakers..");
    }
}

package com.example.implementations;

import com.example.interfaces.Speakers;
import com.example.model.Song;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(Song song) {
        return "Playing " + song.getTitle() + " by " + song.getSingerName() + " using SonySpeakers";
    }
}

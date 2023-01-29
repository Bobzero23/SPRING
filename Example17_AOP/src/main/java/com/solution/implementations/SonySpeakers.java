package com.solution.implementations;

import com.solution.interfaces.Speakers;
import com.solution.model.Song;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    @Override
    public String makeSound(Song song) {
        return "Playing " + song.getTitle() + " by " + song.getSingerName() + " using SonySpeakers";
    }
}

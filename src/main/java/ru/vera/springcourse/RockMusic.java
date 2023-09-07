package ru.vera.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {


    List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Wind cries Mary");
        rockMusicList.add("The second rock music");
        rockMusicList.add("The third rock music");
    }

    int randomRockMusic = new Random().nextInt(rockMusicList.size());

    @Override
    public String getSong() {
        return rockMusicList.get(randomRockMusic);
    }
}

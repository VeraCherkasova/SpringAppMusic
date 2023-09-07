package ru.vera.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Do initialization");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Do destruction");
    }

    List<String> listClassicalMusic = Arrays.asList ("Hungarian Rhapsody","The second classical music","The third classical music");

    int randomClassicalMusic = new Random().nextInt(listClassicalMusic.size());

    @Override
    public String getSong() {
        return listClassicalMusic.get(randomClassicalMusic);
    }


}

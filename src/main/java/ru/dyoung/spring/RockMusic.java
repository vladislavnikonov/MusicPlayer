package ru.dyoung.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    @PostConstruct
    public void doMyInit() {
        songs.add("Hungarian");
        songs.add("Symphony");
        songs.add("Night");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}

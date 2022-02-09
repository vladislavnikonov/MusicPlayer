package ru.dyoung.spring;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    List<String> songs = new ArrayList<>();

    @PostConstruct
    public void doMyInit() {
        songs.add("Eminem");
        songs.add("Max");
        songs.add("Oxy");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}

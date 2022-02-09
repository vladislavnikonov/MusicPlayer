package ru.dyoung.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    @PostConstruct
    public void doMyInit() {
            songs.add("Rhapsody");
            songs.add("Minor");
            songs.add("Mountain");
        }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Bye");
    }


    @Override
    public List<String> getSongs() {
        return songs;
    }
}

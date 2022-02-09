package ru.dyoung.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private final List<Music> listMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    //IoC - инверсия управления

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case (0):
                return listMusic.get(0).getSongs().get(random.nextInt(3));
            case (1):
                return listMusic.get(1).getSongs().get(random.nextInt(3));
            default:
                return listMusic.get(2).getSongs().get(random.nextInt(3));
        }
    }
}

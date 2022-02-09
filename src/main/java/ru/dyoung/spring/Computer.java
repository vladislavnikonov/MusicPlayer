package ru.dyoung.spring;

public class Computer {
    private final MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " +
                "playing " + musicPlayer.playMusic() + " using " + musicPlayer.getName() + " on " + musicPlayer.getVolume();
    }
}

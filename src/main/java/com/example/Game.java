package com.example;

public class Game extends Media {

    private String Studio;

    public Game(String title, String studio) {
        super(title);
        Studio = studio;
    }

    @Override
    public String play() {
        return String.format("Now playing: %s by %s", title, Studio);
    }

    public String getRunningTime() {
        return null;

        }


}

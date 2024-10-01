package com.example;

public class DVD extends Media {

    private String director;
    private int duration;

    public DVD(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
    }



    @Override
    public String play() {
        return String.format("Now playing %s by %s", title, director);
    }

    public String getRunningTime() {
        return String.format("Movie runtime: %s minutes", duration);

        }


}

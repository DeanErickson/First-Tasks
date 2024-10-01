package com.example;

public abstract class Media {

    String title;

    public Media(String title) {
        this.title = title;

    }

    public abstract String getRunningTime();

    public abstract String play();

}


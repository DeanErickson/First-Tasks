package com.example;

public abstract class Player<T extends Media> {

    protected T loadedMedia;

    public String play() {
        if (this.loadedMedia == null) {
            throw new IllegalStateException("No disc");

        }
        return this.loadedMedia.play();
    }

    public String getRunningTime() {
        if (this.loadedMedia == null) {
            throw new IllegalStateException("No disc");

        }
        return this.loadedMedia.getRunningTime();
    }


    public void load(T disc) {
        this.loadedMedia = disc;

    }

    public void eject() {
        this.loadedMedia = null;

    }
}

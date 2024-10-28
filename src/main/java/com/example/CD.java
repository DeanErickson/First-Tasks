package com.example;

import java.util.List;

public class CD extends Media {

    private final List<Track> tracks;

    public CD(String title, List<Track> tracks) {
        super(title);
        this.tracks = tracks;

    }

    public String getSongTitles(int index) {
        return tracks.get(index).trackName;
    }

    @Override
    public String play() {
        return String.format("Now playing %s from %s", getSongTitles(0), title);

    }

    public String getRunningTime() {
        int totalDuration = 0;
        for (Track track : tracks) {
            totalDuration += track.duration;

        }
        return String.format("Album runtime: " + totalDuration + " minutes");
   }
}


package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer();
        DVDPlayer dvdPlayer = new DVDPlayer();
        GamePlayer gamePlayer = new GamePlayer();

        // input album

        CD MasterOfPuppets = new CD("Master Of Puppets", List.of(new Track("Battery",5), new Track("Master Of Puppets (Title Track)", 8), new Track(" Welcome Home (Sanitarium)",6)));

        // input movie

        DVD Ghostbusters = new DVD("Ghostbusters (1984)", "Ivan Reitman", 105);

        // input Game

        Game Pokemon = new Game("Pokemon", "Nintendo");

        // CD Player

        System.out.println("\nCD Player");
        cdPlayer.load(MasterOfPuppets);
        System.out.println(cdPlayer.play());
        System.out.println(cdPlayer.getRunningTime());
        cdPlayer.eject();

        // DVD player

        System.out.println("\nDVD Player");
        dvdPlayer.load(Ghostbusters);
        System.out.println(dvdPlayer.play());
        System.out.println(dvdPlayer.getRunningTime());
        dvdPlayer.eject();

        // DVD player playing CD's

        System.out.println("\nMedia Player");
        dvdPlayer.load(MasterOfPuppets);
        System.out.println(dvdPlayer.play());
        System.out.println(dvdPlayer.getRunningTime());
        dvdPlayer.eject();

        // Playing Game

        System.out.println("\nGame Player");
        gamePlayer.load(Pokemon);
        System.out.println(gamePlayer.play());
        gamePlayer.eject();



    }

}

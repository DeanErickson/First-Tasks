package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CDTest {

    private CDPlayer cdPlayer;

    CD testAlbum = new CD("Test Album", List.of(new Track("Track one",5), new Track("Track Two", 3), new Track("Track Three", 4)));


    @BeforeEach
    public void setUp() {
        cdPlayer = new CDPlayer();
    }

    @Test
    public void load() {
        cdPlayer.load(testAlbum);
        assertNotNull(cdPlayer.loadedMedia);
    }

    @Test
    public void eject() {
        cdPlayer.eject();
        assertNull(cdPlayer.loadedMedia);

    }


}
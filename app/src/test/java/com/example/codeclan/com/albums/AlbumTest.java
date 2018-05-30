package com.example.codeclan.com.albums;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlbumTest {

    Album album;

    @Before
    public void before() {
        album= new Album("Linkin Park", "Hybrid Theory", 2001);
    }

    @Test
    public void getArtistTest() {
        assertEquals("Linkin Park", album.getArtist());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Hybrid Theory", album.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)2001, album.getYear());

    }
}

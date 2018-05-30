package com.example.codeclan.com.albums;

import java.util.ArrayList;

public class Album {

    private String artist;
    private String title;
    private Integer year;

    public Album(String artist, String title, Integer year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }


}

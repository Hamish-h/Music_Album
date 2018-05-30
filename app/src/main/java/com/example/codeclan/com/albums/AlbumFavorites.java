package com.example.codeclan.com.albums;

import java.util.ArrayList;

public class AlbumFavorites {

    private ArrayList<Album> list;

    public AlbumFavorites() {
        list = new ArrayList<Album>();
        list.add(new Album("Linkin Park", "Hybrid Theory", 2001));
        list.add(new Album("Eminem", "The Eminem Show", 2002));
        list.add(new Album("Usher", "Confessions", 2004));
        list.add(new Album("Adele", "Twenty One", 2011));
        list.add(new Album("Drake", "Views", 2016));
        list.add(new Album("Elton John", "The Lion King", 1994));
        list.add(new Album("Spice Girls", "Spice", 1997));
        list.add(new Album("Lil Wayne", "Tha Carter III", 2008));
        list.add(new Album("Pink Floyd", "The Wall", 1980));
        list.add(new Album("Fleetwood Mac", "Rumours", 1977));
        list.add(new Album("Billy Joel", "52nd Street", 1979));
        list.add(new Album("George Michael", "Faith", 1988));
        list.add(new Album("Ed Sheeran", "Percent", 2017));
        list.add(new Album("Reo Speedwagon", "Hi Fidelity", 1981));
        list.add(new Album("War", "The World is a Ghetto", 1973));
    }

    public ArrayList<Album> getList() {
        return new ArrayList<Album>(list);
    }

}


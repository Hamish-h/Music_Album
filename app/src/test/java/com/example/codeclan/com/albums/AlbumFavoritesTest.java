package com.example.codeclan.com.albums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlbumFavoritesTest {

    @Test
    public void getListTest() {
        AlbumFavorites albumFavorites = new AlbumFavorites();
        assertEquals(15, albumFavorites.getList().size());
    }
}

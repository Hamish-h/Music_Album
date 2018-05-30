package com.example.codeclan.com.albums;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumFavoritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_favorites);

        AlbumFavorites albumFavorites = new AlbumFavorites();
        ArrayList<Album> list = albumFavorites.getList();
//
//        AlbumFavoritesAdapter albumAdapter = new AlbumFavoritesAdaptor(this, list);
//
//        Album currentAlbum = getItem(position);
//        TextView artist = listItemView.findViewById(R.id.artist);
//        artist.setText(currentAlbum.getArtist().toString());
//
//         TextView title = listItemView.findViewById(R.id.title);
//        title.setText(currentAlbum.getTitle().toString());
//
//        TextView year = listItemView.findViewById(R.id.year);
//        year.setText(currentAlbum.getYear().toString());
//
//        listItemView.setTag(currentAlbum);
//
//        return listItemView;

    }
}
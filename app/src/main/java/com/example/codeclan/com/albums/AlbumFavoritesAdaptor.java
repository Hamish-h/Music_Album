package com.example.codeclan.com.albums;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class AlbumFavoritesAdaptor extends ArrayAdapter<Album> {

    public AlbumFavoritesAdaptor(Context context, ArrayList<Album> album) {
        super(context, 0, album);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

    if (listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
    }

}
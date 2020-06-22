package com.kaen.filmhub_j.adapters;

import android.widget.ImageView;

import com.kaen.filmhub_j.models.Movie;

public interface MovieItemClickListener {
    void onMovieClick(Movie movie, ImageView movieImageView);

}

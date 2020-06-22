package com.kaen.filmhub_j.adapters;

import android.media.Image;
import android.widget.ImageView;

import com.kaen.filmhub_j.models.Series;

public interface SeriesItemClickListener {
    void onSeriesClick(Series series, ImageView seriesImageView);
}

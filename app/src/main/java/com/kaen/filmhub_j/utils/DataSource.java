package com.kaen.filmhub_j.utils;

import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Movie;
import com.kaen.filmhub_j.models.Series;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    //adding movies data
    public static List<Movie> getBestMovies(){
        //creating a list of movies and add an arrayList of names and covers to it.
        List<Movie> lstMovies=new ArrayList<>();
        //adding title, movies image
        lstMovies.add(new Movie("Sierra Burgess Is a Loser", R.drawable.slide1));
        lstMovies.add(new Movie("john wick", R.drawable.slide2));
        lstMovies.add(new Movie("bad boys -for life", R.drawable.slide1));
        lstMovies.add(new Movie("bad boys", R.drawable.slide1));
        lstMovies.add(new Movie("john wick", R.drawable.slide2));
        lstMovies.add(new Movie("bad boys -for life", R.drawable.slide1));
        lstMovies.add(new Movie("bad boys", R.drawable.slide1));
        lstMovies.add(new Movie("john wick", R.drawable.slide2));
        lstMovies.add(new Movie("bad boys -for life", R.drawable.slide1));
        return lstMovies;
    }
    //adding series data
    public static List<Series> getBestSeries(){
        //creating a list of movies and add an arrayList of names and covers to it.
        List<Series> lstSeries=new ArrayList<>();
        //adding title, movies image
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        lstSeries.add(new Series("bad boys", R.drawable.slide1,R.drawable.johnwichcover));
        lstSeries.add(new Series("john wick", R.drawable.slide2));
        return lstSeries;
    }
}

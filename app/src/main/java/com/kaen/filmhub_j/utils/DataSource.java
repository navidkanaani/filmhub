package com.kaen.filmhub_j.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Movie;
import com.kaen.filmhub_j.models.Series;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSource {

    //adding movies data
    public static List<Movie> getBestMovies(){
        //creating a list of movies and add an arrayList of names and covers to it.
        List<Movie> lstMovies=new ArrayList<>();

        //adding data
        lstMovies.add(new Movie("Sierra Burgess Is a Loser", "A wrong-number text sparks a virtual romance between a smart but unpopular teen and a sweet jock who thinks he's talking to a gorgeous cheerleader.","2018",
                "71%","Shannon Purser, Kristine Froseth, RJ Cyler, Noah Centineo, Loretta Devine, Giorgia Whigham, Alice Lee, Lea Thompson, Alan Ruck, Mary Pat Gleason, Chrissy Metz",
                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2bc9c1297888548cf914a1ee11b534f83.mp4","https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2.jpg"));
        lstMovies.add(new Movie("Sierra Burgess Is a Loser", "A wrong-number text sparks a virtual romance between a smart but unpopular teen and a sweet jock who thinks he's talking to a gorgeous cheerleader.","2018",
                "71%","Shannon Purser, Kristine Froseth, RJ Cyler, Noah Centineo, Loretta Devine, Giorgia Whigham, Alice Lee, Lea Thompson, Alan Ruck, Mary Pat Gleason, Chrissy Metz",
                "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2bc9c1297888548cf914a1ee11b534f83.mp4","https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2.jpg"));


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

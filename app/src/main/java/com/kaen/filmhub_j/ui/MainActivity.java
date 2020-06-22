package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.app.SearchableInfo;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.kaen.filmhub_j.adapters.SeriesAdapter;
import com.kaen.filmhub_j.adapters.SeriesItemClickListener;
import com.kaen.filmhub_j.models.Movie;
import com.kaen.filmhub_j.adapters.MovieAdapter;
import com.kaen.filmhub_j.adapters.MovieItemClickListener;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Series;
import com.kaen.filmhub_j.models.Slide;
import com.kaen.filmhub_j.adapters.SliderPagerAdapter;
import com.kaen.filmhub_j.utils.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements MovieItemClickListener, SeriesItemClickListener {

    private List<Slide> lstSlides;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView moviesRv,seriesRv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("FilmHub");

        inViews();
        inSlider();
        inBestMovies();
        inBestSeries();

    }

    private void inBestSeries(){
        //configuring best series adapter
        SeriesAdapter seriesAdapter=new SeriesAdapter(this,DataSource.getBestSeries(),this);
        seriesRv.setAdapter(seriesAdapter);
        seriesRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void inBestMovies() {
        //configuring best movies adapter
        MovieAdapter movieAdapter=new MovieAdapter(this, DataSource.getBestMovies(),this);
        moviesRv.setAdapter(movieAdapter);
        moviesRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    private void inSlider() {
        lstSlides = new ArrayList<>(); // list of slides
        //adding slide item
        lstSlides.add(new Slide(R.drawable.slide1, "Bad boys - For life"));
        lstSlides.add(new Slide(R.drawable.slide2, "John wick 3"));
        //configuring slider adapter
        SliderPagerAdapter adapter = new SliderPagerAdapter(this, lstSlides);
        sliderpager.setAdapter(adapter);

        //setup timer for sliding automatically
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(), 4000, 6000);
        //setup slider indicator
        indicator.setupWithViewPager(sliderpager, true);
    }

    private void inViews() {
        sliderpager = findViewById(R.id.slide_pager); // viewPager for slider
        indicator = findViewById(R.id.indicator); // tabLayout for slider indicator
        moviesRv=findViewById(R.id.moviesRv); // recyclerView for showing the movies list
        seriesRv=findViewById(R.id.seriesRv); //recycler for series list
    }

    //onClick for movies
    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        //when we tap on movies images its send us to MovieDetailActivity
        Intent intent=new Intent(this,MovieDetailActivity.class);
        //send title, thumbnail, cover for detail activity
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("imgUrl",movie.getThumbnail());
        intent.putExtra("cover",movie.getCover());
        intent.putExtra("url",movie.getStreamLink());

        // animation setup
        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,movieImageView,"animation");
        startActivity(intent,options.toBundle());
    }

    @Override
    public void onSeriesClick(Series series, ImageView seriesImageView) {
        Intent intent=new Intent(this,SeriesDetailActivity.class);
        intent.putExtra("title",series.getTitle());
        intent.putExtra("imgUrl",series.getThumbnail());
        intent.putExtra("cover",series.getCover());

        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,seriesImageView,"animation");
        startActivity(intent,options.toBundle());
    }

    //timer class for slider
    class SliderTimer extends TimerTask {

        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (sliderpager.getCurrentItem() < lstSlides.size() - 1) {
                        sliderpager.setCurrentItem(sliderpager.getCurrentItem() + 1);
                    } else {
                        sliderpager.setCurrentItem(0);
                    }
                }
            });

        }
    }

}

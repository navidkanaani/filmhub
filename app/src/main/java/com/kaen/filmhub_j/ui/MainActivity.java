package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.kaen.filmhub_j.models.Movie;
import com.kaen.filmhub_j.adapters.MovieAdapter;
import com.kaen.filmhub_j.adapters.MovieItemClickListener;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Slide;
import com.kaen.filmhub_j.adapters.SliderPagerAdapter;
import com.kaen.filmhub_j.utils.DataSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements MovieItemClickListener, View.OnClickListener {

    private List<Slide> lstSlides;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView moviesRv, seriesRv;
    private FloatingActionButton playBtnSlider;
    private String sTitle, sImg, sUrl;
    private Context mContext;

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


    private void inBestSeries() {

        //configuring best movies adapter
        MovieAdapter movieAdapter = new MovieAdapter(this, DataSource.getBestSeries(), this);
        seriesRv.setAdapter(movieAdapter);
        seriesRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void inBestMovies() {
        //configuring best movies adapter
        MovieAdapter movieAdapter = new MovieAdapter(this, DataSource.getBestMovies(), this);
        moviesRv.setAdapter(movieAdapter);
        moviesRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void inSlider() {
        //add data for slider
        lstSlides = new ArrayList<>(); // list of slides
        //adding slide item
        lstSlides.add(new Slide("https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/2.jpg", "Sierra Burgess Is a Loser", "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2bc9c1297888548cf914a1ee11b534f83.mp4"));
        lstSlides.add(new Slide("https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/476.jpg", "22 July", "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/4768ab9fc8065cd4ea79772933bac6d1b9a.mp4"));
        lstSlides.add(new Slide("https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/1312.jpg", "Black Water", "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/13127238b23442984402821a87344f228af6.mp4"));
        lstSlides.add(new Slide("https://wordup-video.s3-eu-west-1.amazonaws.com/MovieBanners/245.jpg", "Under an Arctic Sky", "https://wordup-video.s3-eu-west-1.amazonaws.com/Movies/2454c26280bf3084d96a0a7febed68b80a5.mp4"));
        //configuring slider adapter
        SliderPagerAdapter adapter = new SliderPagerAdapter(this, lstSlides);
        sliderpager.setAdapter(adapter);
        //setup timer for sliding automatically
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(), 4000, 6000);
        //setup slider indicator
        indicator.setupWithViewPager(sliderpager, true);
        Log.e("onPlaye btn: ", "called");
        //onclick for slider playBtn
        int sIndex= sliderpager.getCurrentItem();
        Slide currentSlide =lstSlides.get(sIndex);
        sUrl=currentSlide.getUrl();
        playBtnSlider.setOnClickListener(this::onClick);
    }

    private void inViews() {
        sliderpager = findViewById(R.id.slide_pager); // viewPager for slider
        indicator = findViewById(R.id.indicator); // tabLayout for slider indicator
        moviesRv = findViewById(R.id.moviesRv); // recyclerView for showing the movies list
        seriesRv = findViewById(R.id.seriesRv); //recycler for series list
        playBtnSlider = (FloatingActionButton) findViewById(R.id.playBtnSlider);//slider play btn in mainActivity
    }

    //onClick for movies
    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        //when we tap on movies images its send us to MovieDetailActivity
        Intent intent = new Intent(this, MovieDetailActivity.class);
        //send title, thumbnail, cover for detail activity
        intent.putExtra("title", movie.getName());
        intent.putExtra("imgUrl", movie.getTitleBanerUrl());
        intent.putExtra("cover", movie.getTitleBanerUrl());
        //sending url to movie detail activity
        intent.putExtra("videoUrl", movie.getVideoUrl());
        //send description
        intent.putExtra("description", movie.getDescription());
        //send year
        intent.putExtra("year", movie.getProductionYear());
        //send cast
        intent.putExtra("stars", movie.getStars());
        intent.putExtra("rank",movie.getAverageRanking());

        // animation setup
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, movieImageView, "animation");
        startActivity(intent, options.toBundle());
    }

    public void onSeriesClick(Movie movie, ImageView movieImageView) {
        Intent intent = new Intent(this, MovieDetailActivity.class);
        //send title, thumbnail, cover for detail activity
        intent.putExtra("title", movie.getName());
        intent.putExtra("imgUrl", movie.getTitleBanerUrl());
        intent.putExtra("cover", movie.getTitleBanerUrl());
        //sending url to movie detail activity
        intent.putExtra("videoUrl", movie.getVideoUrl());
        //send description
        intent.putExtra("description", movie.getDescription());
        //send year
        intent.putExtra("year", movie.getProductionYear());
        //send cast
        intent.putExtra("stars", movie.getStars());
        intent.putExtra("rank",movie.getAverageRanking());

        // animation setup
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, movieImageView, "animation");
        startActivity(intent, options.toBundle());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.playBtnSlider:
                changeActivity();
                break;
            default:
                Log.e("Hey Hey: ", "there is an error for your slider.");
        }
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

    void changeActivity() {
        Intent intent = new Intent(this, VideoPlayerActivity.class);
        Log.e("Play btn:", "Tapped!!!!");
        intent.putExtra("videoUrl", sUrl);
        startActivity(intent);
    }

}

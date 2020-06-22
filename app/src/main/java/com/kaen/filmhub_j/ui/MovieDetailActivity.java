package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.adapters.CastAdapter;
import com.kaen.filmhub_j.adapters.PlaybtnClickListener;
import com.kaen.filmhub_j.models.Cast;
import com.kaen.filmhub_j.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDetailActivity extends AppCompatActivity implements PlaybtnClickListener {

    private ImageView movieThumbnailImg, movieCoverImg;
    private TextView tv_title, tv_description;
    private FloatingActionButton playBtn;
    private RecyclerView castRv;
    private CastAdapter castAdapter;
    private String mUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        // this is for show the movie details objects
        inViews();
        //cast func
        setupCast();
    }

    void inViews() {
        // getting data
        castRv = findViewById(R.id.castRv); //cast recycler
        playBtn = findViewById(R.id.playBtn); //play button
        String movieTitle = getIntent().getExtras().getString("title"); //getting movie title
        int imgResourceId = getIntent().getExtras().getInt("imgUrl"); //getting movie's poster
        int mCover = getIntent().getExtras().getInt("cover"); //getting movie's cover
        mUrl=getIntent().getExtras().getString("url");// getting movie's url
        movieThumbnailImg = findViewById(R.id.movie_detail_img); // movie's thumbnail imageView
        Glide.with(this).load(imgResourceId).into(movieThumbnailImg); // loading movie thumbnail with glid libraay
        movieThumbnailImg.setImageResource(imgResourceId); // setting image resource for thumbnail imageView
        movieCoverImg = findViewById(R.id.movie_detail_cover); // movie's cover imageView
        Glide.with(this).load(mCover).into(movieCoverImg); // loading movie cover with glid library
        tv_title = findViewById(R.id.movie_detail_title); // movie's title in detail page textView
        tv_title.setText(movieTitle); // setting the text view value
        getSupportActionBar().setTitle(movieTitle); // setting the action bar text based on movie's name
        tv_description = findViewById(R.id.movie_detail_desc); // description textView
//        playBtn.setOnClickListener(onPlaybtnClick(mUrl));
        //animation
        movieCoverImg.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation)); // based on scale_animation in anim folder for movie's cover
        playBtn.setAnimation(AnimationUtils.loadAnimation(this, R.anim.scale_animation)); // based on scale_animation in anim folder for play button
    }

    void setupCast() {

        //cast list
        List<Cast> mdata = new ArrayList<>(); // create a list of Cast obj and add a ArrayList to it.
        // setting cast list values for testing
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        mdata.add(new Cast("test1"));
        // configuration customize adapter for our cast list
        castAdapter = new CastAdapter(this, mdata);
        castRv.setAdapter(castAdapter);
        castRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }


    @Override
    public void onPlaybtnClick(String mUrl) {
        Intent intent = new Intent(this, VideoPlayerActivity.class);
        intent.putExtra("url",mUrl);
        startActivity(intent);
    }


}


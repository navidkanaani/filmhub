package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.adapters.CastAdapter;
import com.kaen.filmhub_j.models.Cast;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MovieDetailActivity extends AppCompatActivity {

    private ImageView movieThumbnailImg, movieCoverImg;
    private TextView tv_title, tv_description,pYear;
    private FloatingActionButton playBtn;
    private RecyclerView castRv;
    private CastAdapter castAdapter;
    private String mUrl,year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        // this is for show the movie details objects
        inViews();
        //cast func
        setupCast();
        onPlaybtnClick();
    }

    void inViews() {
        // getting data
        castRv = findViewById(R.id.castRv); //cast recycler
        playBtn = findViewById(R.id.playBtn); //play button
        pYear=findViewById(R.id.yearTextView);//year textview
        //getting movie title
        String movieTitle = getIntent().getExtras().getString("title");
        String movieDesc=getIntent().getExtras().getString("description");
        //getting movie's poster
        String imgResource = getIntent().getExtras().getString("imgUrl");
        //download movie thumbanil and show it
        new DownloadImageTask((ImageView) findViewById(R.id.movie_detail_img))
                .execute(imgResource);
        //getting movie's cover
        String mCover = getIntent().getExtras().getString("imgUrl");
        new DownloadImageTask((ImageView) findViewById(R.id.movie_detail_cover))
                .execute(mCover);
        //get video url
        mUrl=getIntent().getExtras().getString("videoUrl");
        //get production year
        year=getIntent().getExtras().getString("year");
        pYear.setText(year);


        tv_title = findViewById(R.id.movie_detail_title); // movie's title in detail page textView
        tv_title.setText(movieTitle); // setting the text view value
        getSupportActionBar().setTitle(movieTitle); // setting the action bar text based on movie's name
        tv_description = findViewById(R.id.movie_detail_desc); // description textView
        tv_description.setText(movieDesc);


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

    void changeActivity(){
        Intent intent=new Intent(this,VideoPlayerActivity.class);
        Log.e("Play btn:","Tapped!!!!");
        intent.putExtra("videoUrl",mUrl);
        startActivity(intent);
    }
    //onPlay btn func
    void onPlaybtnClick(){
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeActivity();
            }
        });
    }


    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }



}


package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.kaen.filmhub_j.R;

public class VideoPlayerActivity extends AppCompatActivity {

    private PlayerView playerView;
    private SimpleExoPlayer simpleExoPlayer;
    private static String video_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setFullScreen();
        hideActionBar();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_player);

        video_url=getIntent().getExtras().getString("videoUrl");
        inExoPlayer(video_url);
    }

    private void hideActionBar() {
        getSupportActionBar().hide();
    }
    private void setFullScreen() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    void inExoPlayer(String url) {
        playerView = findViewById(R.id.movie_player);//player view in activity
        simpleExoPlayer = ExoPlayerFactory.newSimpleInstance(this);//defining exo player object
        playerView.setPlayer(simpleExoPlayer);//set exo for player view
        DataSource.Factory dataFactory = new DefaultDataSourceFactory(this, Util.getUserAgent(this, "Film Hub"));
        MediaSource videoSource = new ExtractorMediaSource.Factory(dataFactory).createMediaSource(Uri.parse(url));
        simpleExoPlayer.prepare(videoSource);
        simpleExoPlayer.setPlayWhenReady(true);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        simpleExoPlayer.release();
    }
}
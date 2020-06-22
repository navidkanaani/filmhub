package com.kaen.filmhub_j.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.adapters.CastAdapter;
import com.kaen.filmhub_j.adapters.SeriesAdapter;
import com.kaen.filmhub_j.adapters.SeriesItemClickListener;
import com.kaen.filmhub_j.models.Cast;
import com.kaen.filmhub_j.models.Series;
import com.kaen.filmhub_j.utils.DataSource;

import java.util.ArrayList;
import java.util.List;

public class SeriesDetailActivity extends AppCompatActivity implements SeriesItemClickListener {

    private ImageView sThumbnail, sCover;
    private TextView sTitle, sDescription;
    private FloatingActionButton play_btn;
    private RecyclerView castRv,episodesRv;
    private CastAdapter castAdapter;
    private SeriesAdapter seriesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series_detail);

        inViews();
        castSetup();
        episodesSetup();
    }


    void inViews() {
        episodesRv=findViewById(R.id.episodesRv);
        castRv=findViewById(R.id.sCastRv);
        play_btn = findViewById(R.id.playBtn);
        String seriesTitle = getIntent().getExtras().getString("title");
        int imgResourceId = getIntent().getExtras().getInt("imgUrl");
        int sCoverId = getIntent().getExtras().getInt("cover");
        //loading and setting thumbnail image
        sThumbnail = findViewById(R.id.series_detail_img);
        Glide.with(this).load(imgResourceId).into(sThumbnail);
        sThumbnail.setImageResource(imgResourceId);
        //loading and setting cover image
        sCover = findViewById(R.id.series_detail_cover);
        Glide.with(this).load(sCoverId).into(sCover);
        sCover.setImageResource(sCoverId);
        //setting title
        sTitle = findViewById(R.id.series_detail_title);
        sTitle.setText(seriesTitle);
        //setting action bar text
        getSupportActionBar().setTitle(seriesTitle);
        //setting description
        sDescription = findViewById(R.id.series_detail_desc);
//        sDescription.setText();

        sCover.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));
        play_btn.setAnimation(AnimationUtils.loadAnimation(this,R.anim.scale_animation));

    }
    void castSetup(){
        List<Cast> sCastList=new ArrayList<>();
        sCastList.add(new Cast("sample"));
        sCastList.add(new Cast("sample"));
        sCastList.add(new Cast("sample"));
        sCastList.add(new Cast("sample"));
        sCastList.add(new Cast("sample"));

        castAdapter=new CastAdapter(this,sCastList);
        castRv.setAdapter(castAdapter);
        castRv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

    }
    void episodesSetup(){
        seriesAdapter=new SeriesAdapter(this, DataSource.getBestSeries(), this);
        episodesRv.setAdapter(seriesAdapter);
        episodesRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }

    @Override
    public void onSeriesClick(Series series, ImageView seriesImageView) {
        Intent intent=new Intent(this,SeriesDetailActivity.class);
        intent.putExtra("title",series.getTitle());
        intent.putExtra("imgUrl",series.getThumbnail());
        intent.putExtra("cover",series.getCover());

        ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(SeriesDetailActivity.this,seriesImageView,"animation");
        startActivity(intent,options.toBundle());
    }
}
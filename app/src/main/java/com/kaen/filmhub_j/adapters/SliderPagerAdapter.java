package com.kaen.filmhub_j.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Slide;

import java.util.List;

public class SliderPagerAdapter extends PagerAdapter {

    //slider adapter for showing them

    private Context mContext;
    private List<Slide> mList;

    public SliderPagerAdapter(Context mContext, List<Slide> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //adding layout inflater and connect our slider layout to it.
        LayoutInflater inflater=(LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slideLayout= inflater.inflate(R.layout.slider_item,null);
        //adding text and image slider
        ImageView slideImg= slideLayout.findViewById(R.id.slide_img);
        TextView slideText= slideLayout.findViewById(R.id.slide_title);
        slideImg.setImageResource(mList.get(position).getImage());
        slideText.setText(mList.get(position).getTitle());

        container.addView(slideLayout);
        return slideLayout;


    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

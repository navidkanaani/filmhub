package com.kaen.filmhub_j.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Series;
import com.kaen.filmhub_j.ui.MainActivity;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.MyViewHolder> {

    //series adapter for showing them

    Context context;
    List<Series> sData;
    SeriesItemClickListener seriesItemClickListener;

    public SeriesAdapter(Context context, List<Series> sData, SeriesItemClickListener listener) {
        this.context = context;
        this.sData = sData;
        seriesItemClickListener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.series_items, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.SeriesTitle.setText(sData.get(position).getTitle());
        holder.ImgSeries.setImageResource(sData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return sData.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView SeriesTitle;
        private ImageView ImgSeries;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            SeriesTitle = itemView.findViewById(R.id.series_title);
            ImgSeries = itemView.findViewById(R.id.series_img);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    seriesItemClickListener.onSeriesClick(sData.get(getAdapterPosition()), ImgSeries);
                }
            });
        }
    }
}

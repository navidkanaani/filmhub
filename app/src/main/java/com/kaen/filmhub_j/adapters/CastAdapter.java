package com.kaen.filmhub_j.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kaen.filmhub_j.R;
import com.kaen.filmhub_j.models.Cast;

import java.util.List;

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.CastViewHolder> {

    //cast adapter for showing them

    Context mContext;
    List<Cast> mData;

    public CastAdapter(Context mContext, List<Cast> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CastViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.cast_list_items,parent,false);
        return new CastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CastViewHolder holder, int position) {
        Glide.with(mContext).load(mData.get(position).getName().toString());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public class CastViewHolder extends RecyclerView.ViewHolder{
        RecyclerView cast;

        public CastViewHolder(@NonNull View itemView) {
            super(itemView);
//            cast=itemView.findViewById(R.id.castRv);
        }
    }
}

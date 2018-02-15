package com.hfad.iak_satriya.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hfad.iak_satriya.Holder.RecyclerViewHolders;
import com.hfad.iak_satriya.ItemObject;
import com.hfad.iak_satriya.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satriya on 07/02/18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders> {
    public List<ItemObject.Results> itemList;
    public Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject.Results>itemList){
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
            View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist, null);
            RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        Picasso.with(context).load(
                "https://image.tmdb.org/t/p/w185" + itemList.get(position).poster_path)
                .placeholder(R.drawable.movie_icon)
                .into(holder.img);

            holder.original_title.setText(itemList.get(position).original_title);
            holder.overview = itemList.get(position).overview;
            holder.thn = itemList.get(position).release_date;
            holder.backdrop = "https://image.tmdb.org/t/p/w780" + itemList.get(position).backdrop_path;
            holder.vote = itemList.get(position).vote_average;
            holder.id_film = itemList.get(position).id;
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


}
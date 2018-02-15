package com.hfad.iak_satriya.Holder;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.iak_satriya.DetailActivity;
import com.hfad.iak_satriya.R;

/**
 * Created by satriya on 14/02/18.
 */

public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView original_title;
    public String overview;

    public String backdrop;
    public String thn;
    public ImageView img;
    public String vote;
    public String id_film;

    public RecyclerViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        img = (ImageView) itemView.findViewById(R.id.list_avatar);
        original_title = (TextView)itemView.findViewById(R.id.list_title);
        img.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(view.getContext(), DetailActivity.class);
        i.putExtra("judul", original_title.getText().toString());
        i.putExtra("deskripsi", overview);
        i.putExtra("tahun", thn);
        i.putExtra("latar", backdrop);
        i.putExtra("vote", vote);
        i.putExtra("id", id_film);

        view.getContext().startActivity(i);
    }

}

package com.hfad.iak_satriya;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

/**
 * Created by satriya on 07/02/18.
 */

public class DetailActivity extends AppCompatActivity {
    private TextView txtJudul;
    private TextView txtDeskripsi;
    private ImageView imgMovie;
    private TextView txtVote;
    public TextView txtTahun;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtJudul = (TextView) findViewById(R.id.txtJudul);
        txtDeskripsi = (TextView) findViewById(R.id.txtDeskripsi);
        imgMovie = (ImageView) findViewById(R.id.imgMovie);
        txtTahun = (TextView) findViewById(R.id.txtTahun);
        imgMovie.setScaleType(ImageView.ScaleType.CENTER_CROP);
        txtVote = (TextView) findViewById(R.id.txtVote);

        final String latar = getIntent().getStringExtra("latar");
        final String judul = getIntent().getStringExtra("judul");
        String deskripsi = getIntent().getStringExtra("deskripsi");
        String thn = getIntent().getStringExtra("tahun");
        String vote = getIntent().getStringExtra("vote");
        String id_film = getIntent().getStringExtra("id");

        Picasso.with(this).load(latar).placeholder(R.drawable.movie_icon).into(imgMovie);

        txtJudul.setText(judul);
        txtDeskripsi.setText(deskripsi);
        txtTahun.setText("Release date : " + thn);
        txtVote.setText("Rating : " + vote + " / 10");

        ImageButton shareBtn = (ImageButton) findViewById(R.id.share_button);
        shareBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBody = "https://www.themoviedb.org/discover/movie" ;
                intent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                intent.putExtra(Intent.EXTRA_TEXT,shareBody);

                startActivity(Intent.createChooser(intent,"Share Using"));
            }
        });


    }

}

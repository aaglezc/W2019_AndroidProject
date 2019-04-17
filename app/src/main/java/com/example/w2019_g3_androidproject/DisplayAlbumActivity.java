package com.example.w2019_g3_androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayAlbumActivity extends AppCompatActivity {


    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_album);

      //  imageView = findViewById(R.id.album_display);

      //  imageView.setImageResource(getIntent().getIntExtra("image_id",00));
    }
}

package com.example.w2019_g3_androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.w2019_g3_androidproject.Models.Product;

public class DisplayAlbumActivity extends AppCompatActivity {


    ImageView imageView;
    TextView albumTitle;
    TextView albumAuthor;
    TextView albumYear;
    TextView albumPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_album);

        imageView = findViewById(R.id.albumCover);
        albumTitle = findViewById(R.id.albumTitle);
        albumAuthor = findViewById(R.id.albumAuthor);
        albumYear = findViewById(R.id.albumYear);
        albumPrice = findViewById(R.id.albumPrice);

        Product p = (Product) getIntent().getSerializableExtra("product");


        imageView.setImageResource(getIntent().getIntExtra("image_id",00));
        albumTitle.setText("Title : " + p.get_productName());
        albumAuthor.setText("Author : " + p.get_author());
        albumYear.setText("Year : " + p.get_year().toString());
        albumPrice.setText("Price : $" + p.get_price().toString());



    }
}

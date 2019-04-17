package com.example.w2019_g3_androidproject;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.ImageViewHolder> {
    @NonNull

    private int[] images;


    private Context context;      // For the click event


    //public RecyclerAdapter(int[] images)
    public AlbumsAdapter(int[] images, Context context)       //for click event
    {
        this.images = images;

        this.context = context;         // For the click event
    }



    @Override
    //public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.albums_layout,viewGroup,false);
        //ImageViewHolder imageViewHolder = new ImageViewHolder(view);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view,context,images);    //for the click event

        return imageViewHolder;
    }

    @Override
    //public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i)
    public void onBindViewHolder(ImageViewHolder viewHolder, int i) {

        int imgID = images[i];


        //Aqui configurar des dela clase productos@@!

        viewHolder.album.setImageResource(imgID);
        viewHolder.albumTitle.setText("Image :" + i);



    }

    @Override
    public int getItemCount() {

        return images.length;
    }



    //------holder

    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView album;
        TextView albumTitle;
        //TextView albumYear;


        Context context;         // for the click event
        int[] images;            // for the click event

        //public ImageViewHolder(@NonNull View itemView, Context context)
        public ImageViewHolder(@NonNull View itemView, Context context, int[] images)      //for click event
        {
            super(itemView);

            album = itemView.findViewById(R.id.album);
            albumTitle = itemView.findViewById(R.id.albumTitle);


            itemView.setOnClickListener(this);     //Added for Click event
            this.context = context;               // for the click event
            this.images = images;                 // for the click event

        }


        @Override
        public void onClick(View view)
        {
            Intent intent = new Intent(context,DisplayAlbumActivity.class);
            intent.putExtra("image_id",images[getAdapterPosition()]);

            context.startActivity(intent);

        }
    }

}

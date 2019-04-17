package com.example.w2019_g3_androidproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private int[] images = {
            R.drawable.elvis2nd,
            R.drawable.gunr3,
            R.drawable.johndenver,
            R.drawable.ledz2,
            R.drawable.mm,
            R.drawable.muse2,
            R.drawable.rods,
    };

    private RecyclerView.LayoutManager layoutManager;



    //first create class
    private AlbumsAdapter adapter;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this,2);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new AlbumsAdapter(images,this);
        //adapter = new Albums_RecyclerAdapter(images,this);       // for click event

        recyclerView.setAdapter(adapter);



        //Aqui configurar des dela clase productos@@!



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.main,menu);

        return true;//super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String msg = "";
        switch (item.getItemId())
        {
            case R.id.mnuHome:
                msg = "Favorite";
                showDialog();
                break;
            case R.id.mnuContact:
                msg = "Location";
                break;
            case R.id.mnuAbout:
                msg = "First";
               // showDialog();
                break;
            case R.id.mnuLogout:
                msg = "Logout";
                break;
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    private void showDialog()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                this);

        // set title
        alertDialogBuilder.setTitle("Your Title");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });


        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }

}

package com.jerry.nyscpics;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;

public class PhotoPages extends AppCompatActivity {



    Toolbar toolbar;
   // CollapsingToolbarLayout collapsingToolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_pages);


        TextView corperName = findViewById(R.id.corperNameView);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);

        String mName = getIntent().getStringExtra("ourName");

        Bundle jerryPic = getIntent().getExtras();
        byte []bytearray = jerryPic.getByteArray("myPic");
        Bitmap bmp = BitmapFactory.decodeByteArray(bytearray,0,bytearray.length);

        ImageView imageView = findViewById(R.id.myimageView);
        imageView.setImageBitmap(bmp);

        corperName.setText(mName);
        overridePendingTransition(R.transition.slin_in_left,R.transition.slide_out_right);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.play:
                Intent flipperIntent = new Intent(PhotoPages.this, ImageFlipper.class);

                startActivity(flipperIntent);
        }
        return true;
    }
}

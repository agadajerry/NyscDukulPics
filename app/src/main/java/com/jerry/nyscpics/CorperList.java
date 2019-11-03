package com.jerry.nyscpics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class CorperList extends AppCompatActivity {

    RecyclerView recyclerView;
    public static ArrayList<Corps> corper = MainActivity.corperList ;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corper_list);
        recyclerView = findViewById(R.id.relCyclerV);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager lineManger = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lineManger);

        initialiseAdapter();

    }


    private void initialiseAdapter(){
        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(corper);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {


                String names = corper.get(position).getName();
                    Bitmap bmp = BitmapFactory.decodeResource(getResources(),corper.get(position).getLogoId());
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    bmp.compress(Bitmap.CompressFormat.PNG,100, stream);
                    byte[] byteArray = stream.toByteArray();

                    Intent jerryIntent = new Intent(CorperList.this, PhotoPages.class);
                    jerryIntent.putExtra("ourName", names);
                    jerryIntent.putExtra("myPic",byteArray);
                    startActivity(jerryIntent);

            }
        });


    }


}

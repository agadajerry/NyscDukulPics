package com.jerry.nyscpics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;

public class ImageFlipper extends AppCompatActivity {

    ArrayList<Corps> viewCorperPic = CorperList.corper;
    private ViewFlipper viewFlipper;
    private float initialPoint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_flipper);
        viewFlipper = findViewById(R.id.viewFlipper);



        //******************************************************************************************
        for(int i=0; i<viewCorperPic.size();i++){
            ImageView imageView = new ImageView(ImageFlipper.this);
            imageView.setImageResource(viewCorperPic.get(i).getLogoId());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            viewFlipper.addView(imageView);
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:
                initialPoint =event.getX();
                break;
            case MotionEvent.ACTION_UP:
                float finalX =event.getX();
                if(initialPoint>finalX){
                    if(viewFlipper.getDisplayedChild()==viewCorperPic.size())
                        break;
                    viewFlipper.showNext();
                }else{
                    if(viewFlipper.getDisplayedChild()==0)
                        break;
                    viewFlipper.showPrevious();
                }
                break;
        }
        return false;
    }
}

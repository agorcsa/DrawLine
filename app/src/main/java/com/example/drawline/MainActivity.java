package com.example.drawline;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ImageView imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8;

    View horizontalLine;

    ArrayList<Integer> imageArray = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0));

    int sphereDropped = 0;

    int tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView0 = findViewById(R.id.image_0);
        imageView1 = findViewById(R.id.image_1);
        imageView2 = findViewById(R.id.image_2);
        imageView3 = findViewById(R.id.image_3);
        imageView4 = findViewById(R.id.image_4);
        imageView5 = findViewById(R.id.image_5);
        imageView6 = findViewById(R.id.image_6);
        imageView7 = findViewById(R.id.image_7);
        imageView8 = findViewById(R.id.image_8);

        horizontalLine = findViewById(R.id.horizontal_line);
    }

    public void dropIn(View view) {

        ImageView sphere = (ImageView) view;

        sphere.setTranslationY(-1000f);

        sphere.animate().translationYBy(1000f).setDuration(300);

        sphere.setImageResource(R.drawable.red_sphere);

        sphereDropped = 1;

        view.setClickable(false);

        tag = Integer.parseInt((String) sphere.getTag());

        imageArray.set(tag,sphereDropped);

        drawLine(sphere);
    }

    public void drawLine(View view) {

       if (imageArray.get(0) == 1 && imageArray.get(1) == 1 && imageArray.get(2) == 1) {
           Toast.makeText(getApplicationContext(), "Draw a line on row 1", Toast.LENGTH_SHORT).show();
           horizontalLine.setVisibility(View.VISIBLE);
        }

       else if(imageArray.get(2) == 1 && imageArray.get(4) == 1 && imageArray.get(6) == 1) {
           Toast.makeText(getApplicationContext(), "Draw a line on diagonal from left to the right", Toast.LENGTH_SHORT).show();
           horizontalLine.setRotation(135);
           horizontalLine.setVisibility(View.VISIBLE);
       }
    }

    public void setWinningLineRotation(float rotation){
        if (imageArray.get(0) == 1 && imageArray.get(1) == 1 && imageArray.get(2) == 1) {
            horizontalLine.setRotation(rotation);
            horizontalLine.setVisibility(View.VISIBLE);
        }
    }
}

package com.example.ches21st;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.util.Random;

public class Che21st2 extends AppCompatActivity {
Drawable [] pics = { R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10,
                R.drawable.pic11, R.drawable.pic12, R.drawable.pic13, R.drawable.pic14, R.drawable.pic15, R.drawable.pic16, R.drawable.pic17, R.drawable.pic18, R.drawable.pic19, R.drawable.pic20,
                R.drawable.pic21, R.drawable.pic22, R.drawable.pic23, R.drawable.pic24, R.drawable.pic25, R.drawable.pic26, R.drawable.pic27, R.drawable.pic28, R.drawable.pic29, R.drawable.pic30,
                R.drawable.pic31, R.drawable.pic32, R.drawable.pic33, R.drawable.pic34, R.drawable.pic35, R.drawable.pic36, R.drawable.pic37, R.drawable.pic38, R.drawable.pic39, R.drawable.pic40,
                R.drawable.pic41, R.drawable.pic42, R.drawable.pic43, R.drawable.pic44, R.drawable.pic45, R.drawable.pic46, R.drawable.pic47, R.drawable.pic48, R.drawable.pic49, R.drawable.pic50,
                R.drawable.pic51, R.drawable.pic52, R.drawable.pic53, R.drawable.pic54, R.drawable.pic55, R.drawable.pic56, R.drawable.pic57, R.drawable.pic58, R.drawable.pic59, R.drawable.pic60,
                R.drawable.pic61, R.drawable.pic62, R.drawable.pic63, R.drawable.pic64, R.drawable.pic65, R.drawable.pic66, R.drawable.pic67, R.drawable.pic68, R.drawable.pic69, R.drawable.pic70,
                R.drawable.pic71, R.drawable.pic72, R.drawable.pic73, R.drawable.pic74, R.drawable.pic75, R.drawable.pic76, R.drawable.pic77, R.drawable.pic78, R.drawable.pic79, R.drawable.pic80};

    ImageView picsview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_che21st2);
        picsview = findViewById(R.id.pictures);
        Random rand = new Random();
        int n = rand.nextInt(80);
        Log.i("generated number", Integer.toString(n));
        picsview.setImageDrawable(pics[n]);
    }
}

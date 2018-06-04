package com.example.smart_00.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery1;
    ImageView ivPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("갤러리 실습");
        //id 찾기
        gallery1 = (Gallery) findViewById(R.id.gallery1);
        MyGalleryAdapter galadater = new MyGalleryAdapter(this);
        gallery1.setAdapter(galadater);
        ivPoster = (ImageView)findViewById(R.id.ivPoster);
    }
}

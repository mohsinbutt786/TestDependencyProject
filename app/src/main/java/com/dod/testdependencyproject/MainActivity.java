package com.dod.testdependencyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.test.libraryfirst.LoadWithGlide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadWithGlide loadWithGlide = new LoadWithGlide();
        Log.d("GetHitHere", loadWithGlide.LoadImageWithPlaceHolder(""));
    }
}
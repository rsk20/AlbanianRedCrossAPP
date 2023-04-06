package com.resia.albanianredcross

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window


import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar()!!.hide();
        setContentView(R.layout.activity_main)


    }

    /*val viewPager: ViewPager2 = findViewById(R.id.ViewPager2)*/



}
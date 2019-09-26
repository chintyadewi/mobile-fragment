package com.example.praktikumfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.praktikumfragment.activities.DynamicActivity;
import com.example.praktikumfragment.activities.StaticActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickStaticFragment(View view) {
        Intent i=new Intent(MainActivity.this, StaticActivity.class);
        startActivity(i);
    }

    public void handlerClickDynamicFragment(View view) {
        Intent i=new Intent(MainActivity.this, DynamicActivity.class);
        startActivity(i);
    }

    public void handlerClickPraktikumFragment(View view) {
    }
}

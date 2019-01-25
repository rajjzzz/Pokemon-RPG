package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class Win extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        //allows the popup to appear as a popup rather than a fullscreen (changed dimensions)
        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.6),(int)(height*.2));
    }

    //takes user back to main home screen
    public void tohome (View view){
        Intent i = new Intent(this,Intro.class);
        startActivity(i);
    }

    //takes user to stadium select screen, can choose which level to play next
    public void tostadiumselect (View view){
        Intent i = new Intent(this,StadiumSelect.class);
        startActivity(i);
    }
}

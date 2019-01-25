package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

public class Lose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.6),(int)(height*.3));
    }

    //takes user back to arena 1, where they can restart their journey to defeat all the pokemon trainers
    public void backtoscreen (View view){
        Intent i = new Intent(this,Game1.class);
        startActivity(i);

    }

    //takes user back to stadium select screen, where they can select which level to play next
    public void tostadiumselect (View view){
        Intent i = new Intent(this,StadiumSelect.class);
        startActivity(i);
    }

    //takes user back to main home screen
    public void tohome (View view){
        Intent i = new Intent(this,Intro.class);
        startActivity(i);
    }
}

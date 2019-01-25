package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    //takes user to the first arena (First gameplay screen)
    public void toGame1 (View view){
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }

    //takes user to stadium select screen where they can select which level to play
    public void tostadiumselect (View view){
        Intent i = new Intent(this, StadiumSelect.class);
        startActivity(i);
    }

    //takes user to instructions screen
    public void toinstructions (View view){
        Intent i = new Intent(this, Instructions.class);
        startActivity(i);
    }
}



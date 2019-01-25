package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
    }

    //method for when pokeball icon is clicked at the ending, takes user back to the main screen
    public void tohome (View view){
        Intent i = new Intent(this,Intro.class);
        startActivity(i);
    }
}

package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StadiumSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium_select);
    }

    //takes user to first gameplay screen, first arena
    public void toGame1 (View view){
        Intent i = new Intent(this, Game1.class);
        startActivity(i);
    }

    //takes user to 2nd arena, 2nd gameplay screen
    public void toGame2 (View view){
        Intent i = new Intent(this, Game2.class);
        startActivity(i);
    }

    //takes user to 3rd arena, 3rd gameplay screen
    public void toGame3 (View view){
        Intent i = new Intent(this, Game3.class);
        startActivity(i);
    }
}

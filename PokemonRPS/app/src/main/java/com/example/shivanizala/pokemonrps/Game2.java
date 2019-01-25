package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }

    int yourscore = 0;
    int compscore = 0;

    //method for when the pikachu icon is clicked in the 2nd arena, dictates what will happen if pikachu is selected by user
    public void pika (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.gengarbaby);
            a.setText("You lose!");
            b.setText("Pikachu is weak against Gengar.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.squirtlebaby);
            a.setText("You win!");
            b.setText("Pikachu is strong against Squirtle.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.jigglypuffbaby);
            a.setText("You win!");
            b.setText("Pikachu is strong against Jigglypuff.");
            yourscore++;
            y.setText(yourscore+"");
        }

        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();
        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();
        }
    }

    //method for when the bulbasaur icon is clicked in 2nd arena, dictates what will happen if bulbasaur is selected by user
    public void bulba (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.gengarbaby);
            a.setText("You lose!");
            b.setText("Bulbasaur is weak against Gengar.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.squirtlebaby);
            a.setText("You win!");
            b.setText("Bulbasaur is strong against Squirtle.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.jigglypuffbaby);
            a.setText("You lose!");
            b.setText("Bulbasaur is weak against Jigglypuff.");
            compscore++;
            c.setText(compscore+"");
        }

        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();
        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();
        }
    }

    //method for when the charmander icon is clicked in 2nd arena, dictates what will happen if charmander is selected by user
    public void charmander (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.gengarbaby);
            a.setText("You win! ");
            b.setText("Charmander is strong against Gengar.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.squirtlebaby);
            a.setText("You lose!");
            b.setText("Charmander is weak against Squirtle.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.jigglypuffbaby);
            a.setText("You win!");
            b.setText("Charmander is strong against Jigglypuff.");
            yourscore++;
            y.setText(yourscore+"");
        }

        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();
        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();
        }
    }
}

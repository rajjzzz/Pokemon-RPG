package com.example.shivanizala.pokemonrps;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
    }

    int yourscore = 0;
    int compscore = 0;

    //method for when the pikachu icon is clicked in arena 3, dictates what will happen if pikachu is selected by user
    public void pika (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.aggron);
            a.setText("You lose!");
            b.setText("Pikachu is weak against Aggron.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.raichu);
            a.setText("You lose!");
            b.setText("Pikachu is weak against Raichu.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.blastoise);
            a.setText("You lose!");
            b.setText("Pikachu is weak against Blastoise.");
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

    //method for when the bulbasaur icon is clicked in arena 3, dictates what will happen if bulbasaur is selected by user
    public void bulba (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.blastoise);
            a.setText("You lose!");
            b.setText("Bulbasaur is weak against Blastoise.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.aggron);
            a.setText("You win!");
            b.setText("Bulbasaur is strong against Aggron.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.raichu);
            a.setText("You lose!");
            b.setText("Bulbasaur is weak against Raichu.");
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

    //method for when the charmander icon is clicked, dictates what will happen if charmander is selected by user
    public void charmander (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.aggron);
            a.setText("You win! ");
            b.setText("Charmander is strong against Aggron.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.raichu);
            a.setText("You lose!");
            b.setText("Charmander is weak against Raichu.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.blastoise);
            a.setText("You win!");
            b.setText("Charmander is strong against Blastoise.");
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

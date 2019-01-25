package com.example.shivanizala.pokemonrps;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class Game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
    }

    //initializes initial values of each score as 0, they are increased by 1 everytime user or computer wins
    int yourscore = 0;
    int compscore = 0;

    //method for when the pikachu icon is clicked, dictates what will happen if pikachu is selected by user
    public void pika (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);//random number is the way the AI is configurated

        //dictates if user will win or not based on selection of a random number
        if (num == 1) {
            i.setImageResource(R.drawable.bulbasaurbaby);
            a.setText("You lose!");
            b.setText("Pikachu is weak against Bulbasaur.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.pikachubaby);
            a.setText("Try again!");
            b.setText("Pikachu will not attack Pikachu.");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.charmanderbaby);
            a.setText("You win!");
            b.setText("Pikachu is strong against Charmander.");
            yourscore++;
            y.setText(yourscore+"");
        }

        //if score of either computer or user reaches greater than 5, then the game is over. You have either won or lost.
        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            //makes toast appear on the screen
            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();

            //disables the image so that they can't click on it once the game is over
            ImageView f = (ImageView) findViewById(R.id.pika);
            f.setEnabled(false);

        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();

            ImageView f = (ImageView) findViewById(R.id.pika);
            f.setEnabled(false);
        }
    }

    //method for when the bulbasaur icon is clicked, dictates what will happen if bulbasaur is selected by user
    public void bulba (View view)
    {
        TextView c = (TextView)findViewById(R.id.score2);
        TextView y = (TextView)findViewById(R.id.score1);
        TextView a = (TextView) findViewById(R.id.winner1);
        TextView b = (TextView) findViewById(R.id.winner2);
        ImageView i = (ImageView) findViewById(R.id.poke);
        int num = (int) (Math.random() * 4);
        if (num == 1) {
            i.setImageResource(R.drawable.bulbasaurbaby);
            a.setText("Try again!");
            b.setText("Bulbasaur will not attack Bulbasaur.");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.pikachubaby);
            a.setText("You win!");
            b.setText("Bulbasaur is strong against Pikachu.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.charmanderbaby);
            a.setText("You lose!");
            b.setText("Bulbasaur is weak against Charmander.");
            compscore++;
            c.setText(compscore+"");
        }

        //same code as above: if score reaches greater than 5, user has either won or lost and the game ends
        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();

            ImageView f = (ImageView) findViewById(R.id.bulba);
            f.setEnabled(false);
        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();

            ImageView f = (ImageView) findViewById(R.id.bulba);
            f.setEnabled(false);
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
        //same code as above
        if (num == 1) {
            i.setImageResource(R.drawable.bulbasaurbaby);
            a.setText("You win! ");
            b.setText("Charmander is strong against Bulbasaur.");
            yourscore++;
            y.setText(yourscore+"");
        }
        else if (num == 2) {
            i.setImageResource(R.drawable.pikachubaby);
            a.setText("You lose!");
            b.setText("Charmander is weak against Pikachu.");
            compscore++;
            c.setText(compscore+"");
        }
        else if (num == 3) {
            i.setImageResource(R.drawable.charmanderbaby);
            a.setText("Try again!");
            b.setText("Charmander will not attack Charmander.");
        }

        if(yourscore>5){
            Intent z = new Intent(this,Win.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Congratulations! You Win!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.GREEN);
            toast.show();

            ImageView f = (ImageView) findViewById(R.id.charmander);
            f.setEnabled(false);
        }

        if (compscore>5){
            Intent z = new Intent(this,Lose.class);
            startActivity(z);

            Toast toast = Toast.makeText(getApplicationContext(), "Oh no! You lost!",
                    Toast.LENGTH_SHORT);

            TextView toastMessage = (TextView) toast.getView().findViewById(android.R.id.message);
            toastMessage.setTextColor(Color.RED);
            toast.show();

            ImageView f = (ImageView) findViewById(R.id.charmander);
            f.setEnabled(false);
        }
    }
}

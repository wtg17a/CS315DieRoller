package com.example.dieroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    private ImageView imageViewDice;
    private TextView textViewOutcome;
    private Random rng = new Random();
    private MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                rollDice();
            }
        });
        textViewOutcome = findViewById(R.id.text_view_outcome);

        mp = MediaPlayer.create(this, R.raw.dice_roll);

        /*FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void OnClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, StatsActivity.class);
                startActivity(intent);
            }
        });*/
    }

    private void rollDice()
    {
        mp.start();
        int randomNumber = rng.nextInt(20) + 1;

        switch(randomNumber)
        {
            case 1:
                imageViewDice.setImageResource(R.drawable.d20_01);
                textViewOutcome.setText(R.string.outcome_1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.d20_02);
                textViewOutcome.setText(R.string.outcome_2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.d20_03);
                textViewOutcome.setText(R.string.outcome_3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.d20_04);
                textViewOutcome.setText(R.string.outcome_4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.d20_05);
                textViewOutcome.setText(R.string.outcome_5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.d20_06);
                textViewOutcome.setText(R.string.outcome_6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.d20_07);
                textViewOutcome.setText(R.string.outcome_7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.d20_08);
                textViewOutcome.setText(R.string.outcome_8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.d20_09);
                textViewOutcome.setText(R.string.outcome_9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.d20_10);
                textViewOutcome.setText(R.string.outcome_10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.d20_11);
                textViewOutcome.setText(R.string.outcome_11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.d20_12);
                textViewOutcome.setText(R.string.outcome_12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.d20_13);
                textViewOutcome.setText(R.string.outcome_13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.d20_14);
                textViewOutcome.setText(R.string.outcome_14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.d20_15);
                textViewOutcome.setText(R.string.outcome_15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.d20_16);
                textViewOutcome.setText(R.string.outcome_16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.d20_17);
                textViewOutcome.setText(R.string.outcome_17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.d20_18);
                textViewOutcome.setText(R.string.outcome_18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.d20_19);
                textViewOutcome.setText(R.string.outcome_19);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.d20_20);
                textViewOutcome.setText(R.string.outcome_20);
                break;

        }
    }
}

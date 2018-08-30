package com.example.root.click;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    Button music_game_bt, hardcore_game_bt, one_minute_game_bt, free_game_bt, exit_bt;

    Intent music_game_intent, hardcore_game_intent, one_minute_game_intent, free_game_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        music_game_bt = findViewById(R.id.music_game_bt);
        music_game_bt.setOnClickListener(this);
        music_game_intent = new Intent(this, MusicGame.class);

        hardcore_game_bt = findViewById(R.id.hardcore_game_bt);
        hardcore_game_bt.setOnClickListener(this);
        hardcore_game_intent = new Intent(this, HardcoreGame.class);

        one_minute_game_bt = findViewById(R.id.one_minute_game_bt);
        one_minute_game_bt.setOnClickListener(this);
        one_minute_game_intent = new Intent(this, OneMinuteGame.class);

        free_game_bt = findViewById(R.id.free_game_bt);
        free_game_bt.setOnClickListener(this);
        free_game_intent = new Intent(this, FreeGame.class);

        exit_bt = findViewById(R.id.exit_bt);
        exit_bt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.music_game_bt:
                startActivity(music_game_intent);
                break;

            case R.id.hardcore_game_bt:
                startActivity(hardcore_game_intent);
                break;

            case R.id.one_minute_game_bt:
                startActivity(one_minute_game_intent);
                break;

            case R.id.free_game_bt:
                startActivity(free_game_intent);
                break;

            case R.id.exit_bt:
                finish();
                break;

            default:
                break;
        }
    }
}

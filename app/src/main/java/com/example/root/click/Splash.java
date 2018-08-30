package com.example.root.click;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    private Intent mainIntent;

    private ImageView searSplash, clickSplash;

    Animation startAlpha, stopAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        startAlpha = AnimationUtils.loadAnimation(this, R.anim.start_alpha);
        stopAlpha = AnimationUtils.loadAnimation(this, R.anim.stop_alpha);

        searSplash = findViewById(R.id.searSplash);
        searSplash.setVisibility(View.INVISIBLE);
        searSplash.startAnimation(startAlpha);

        clickSplash = findViewById(R.id.clickSplash);
        clickSplash.setVisibility(View.INVISIBLE);

        mainIntent = new Intent(this, MainMenu.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                searSplash.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        searSplash.startAnimation(stopAlpha);
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                searSplash.setVisibility(View.INVISIBLE);
                                clickSplash.startAnimation(startAlpha);
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        clickSplash.setVisibility(View.VISIBLE);
                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {
                                                clickSplash.startAnimation(stopAlpha);
                                                new Handler().postDelayed(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        clickSplash.setVisibility(View.INVISIBLE);
                                                        startActivity(mainIntent);
                                                        finish();
                                                    }
                                                }, 800);
                                            }
                                        }, 1000);
                                    }
                                }, 800);
                            }
                        }, 800);
                    }
                }, 1000);
            }
        }, 800);
    }
}

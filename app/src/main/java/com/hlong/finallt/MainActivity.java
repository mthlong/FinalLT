package com.hlong.finallt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN = 5000;

    // Variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView intro, ver, load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animation
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        //Hook
        image = findViewById(R.id.imageView);
        intro = findViewById(R.id.textView);
        ver = findViewById(R.id.textView2);
        load = findViewById(R.id.textView3);

        image.setAnimation(topAnim);
        intro.setAnimation(bottomAnim);
        ver.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Navbottom.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN);

    }
    //Animation
}
package project.event.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ActivitySplashScreen extends AppCompatActivity {

    int SPLASH_TIME = 1000;
    ImageView LogoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        LogoImageView = findViewById(R.id.LogoImageView);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        LogoImageView.startAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(ActivitySplashScreen.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);


                finish();

            }
        }, SPLASH_TIME);

    }
}
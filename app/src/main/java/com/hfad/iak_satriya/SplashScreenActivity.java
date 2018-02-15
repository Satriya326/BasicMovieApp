package com.hfad.iak_satriya;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by satriya on 07/02/18.
 */

public class SplashScreenActivity extends AppCompatActivity{
    int SPLASH_TIME_OUT = 20000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent =  new Intent(SplashScreenActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        }, SPLASH_TIME_OUT);

        final Intent intent = new Intent (this, MainActivity.class);

        Thread launch = new Thread(){
            public void run(){
                try {
                    sleep(2500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        launch.start();
    }
}

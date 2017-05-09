package jp.winschool.mole2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int hitcount = 0;
    private MyView canvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        canvas = new MyView(getApplicationContext(), null);

        final Handler hnd = new Handler();
        final Runnable r = new Runnable() {
            @Override
            public void run() {

                hnd.postDelayed(this, 5000);
                canvas.invalidate();
                System.out.println("Loop");
            }
        };
        hnd.postDelayed(r, 1000);
/*
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                canvas.invalidate();
                System.out.println("Timer");
            }
        }, 5000); */

    }
}

package com.anshumantripathi.mathquizapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LauncherActivity extends AppCompatActivity {

    Boolean doublePressToExit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Home Activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!isTablet(this)){
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }

        final Button addButton = (Button) findViewById(R.id.add);
        final Button subButton = (Button) findViewById(R.id.sub);
        final Button mulButton = (Button) findViewById(R.id.mul);
        final Button exitButton = (Button) findViewById(R.id.exit);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);
        myToolbar.setBackground(new ColorDrawable(Color.LTGRAY));
        myToolbar.setContentInsetsAbsolute(0,0);
        myToolbar.setLogo(R.mipmap.ic_launcher);


        //Start Addition Quiz
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, QuizActivity.class);
                intent.putExtra("operation", "add");
                startActivity(intent);

            }
        });

        //Start Subtraction Quiz
        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, QuizActivity.class);
                intent.putExtra("operation", "sub");
                startActivity(intent);
            }
        });

        //Start Multiplication Quiz
        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, QuizActivity.class);
                intent.putExtra("operation", "mul");
                startActivity(intent);
            }
        });

        //Exit button redirects to Android Home
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(startMain);
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (doublePressToExit) {
            Intent startMain = new Intent(Intent.ACTION_MAIN);
            startMain.addCategory(Intent.CATEGORY_HOME);
            startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(startMain);
        }

        this.doublePressToExit = true;

        final Toast toast = Toast.makeText(LauncherActivity.this, "Press BACK again to exit", Toast.LENGTH_SHORT);
        toast.show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doublePressToExit = false;
                toast.cancel();
            }
        }, 2000);

    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }

}
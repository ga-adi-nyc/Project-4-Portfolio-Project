package com.example.jamesrondina.cardcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button practiceButton;
    Button tutorialButton;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tutorialButton = (Button) findViewById(R.id.tutorialButton);
        practiceButton = (Button) findViewById(R.id.practiceButton);
        playButton = (Button) findViewById(R.id.playButton);

        View.OnClickListener listener = new View.OnClickListener() {

            Intent intent;

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.tutorialButton:
                        intent = new Intent(MainActivity.this, TutorialActivity.class);
                        break;
                    case R.id.practiceButton:
                        intent = new Intent(MainActivity.this, PracticeActivity.class);
                        break;
                    case R.id.playButton:
                        intent = new Intent(MainActivity.this, BlackJackActivity.class);
                        break;
                }
                startActivity(intent);
            }
        };

        tutorialButton.setOnClickListener(listener);
        practiceButton.setOnClickListener(listener);
        playButton.setOnClickListener(listener);

    }
}

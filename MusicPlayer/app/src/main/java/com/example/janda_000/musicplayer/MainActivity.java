package com.example.janda_000.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView home = (TextView) findViewById(R.id.home_button);
        TextView search = (TextView) findViewById(R.id.search_button);
        TextView browse = (TextView) findViewById(R.id.browse_button);
        TextView library = (TextView) findViewById(R.id.library_button);
        TextView recommended = (TextView) findViewById(R.id.recommended_button);
        TextView playing = (TextView) findViewById(R.id.playing_button);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeIntent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent browseIntent = new Intent(MainActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        recommended.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent recommendedIntent = new Intent(MainActivity.this, RecommendedActivity.class);
                startActivity(recommendedIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}

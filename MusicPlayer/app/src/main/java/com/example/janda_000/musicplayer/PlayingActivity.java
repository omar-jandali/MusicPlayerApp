package com.example.janda_000.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        TextView home = (TextView) findViewById(R.id.home_button);
        TextView search = (TextView) findViewById(R.id.search_button);
        TextView browse = (TextView) findViewById(R.id.browse_button);
        TextView library = (TextView) findViewById(R.id.library_button);
        TextView recommended = (TextView) findViewById(R.id.recommended_button);
        TextView playing = (TextView) findViewById(R.id.playing_button);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeIntent = new Intent(PlayingActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(PlayingActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent browseIntent = new Intent(PlayingActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent libraryIntent = new Intent(PlayingActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        recommended.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent recommendedIntent = new Intent(PlayingActivity.this, RecommendedActivity.class);
                startActivity(recommendedIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playingIntent = new Intent(PlayingActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}

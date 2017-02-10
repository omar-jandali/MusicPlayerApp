package com.example.janda_000.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        TextView home = (TextView) findViewById(R.id.home_button);
        TextView search = (TextView) findViewById(R.id.search_button);
        TextView browse = (TextView) findViewById(R.id.browse_button);
        TextView library = (TextView) findViewById(R.id.library_button);
        TextView recommended = (TextView) findViewById(R.id.recommended_button);
        TextView playing = (TextView) findViewById(R.id.playing_button);

        home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchIntent = new Intent(SearchActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        browse.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent browseIntent = new Intent(SearchActivity.this, BrowseActivity.class);
                startActivity(browseIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        recommended.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent recommendedIntent = new Intent(SearchActivity.this, RecommendedActivity.class);
                startActivity(recommendedIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent playingIntent = new Intent(SearchActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}

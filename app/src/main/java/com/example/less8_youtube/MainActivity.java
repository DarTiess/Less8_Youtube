package com.example.less8_youtube;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends YouTubeBaseActivity implements OnInitializedListener {

    public static final String API_KEY = "AIzaSyDur9aLkCSNnYA2E4Exxp5Wpeg993zNiZU";

    //https://www.youtube.com/watch?v=<VIDEO_ID>
    public static final String VIDEO_ID_0 = "DW1mgb6thE0";
    public static final String VIDEO_ID_1 = "DW1mgb6thE0";
    public static final String VIDEO_ID_2 = "5gih1qURdCo";
    public static final String VIDEO_ID_3 = "RdaEfx3Q2NE";
    public static final String VIDEO_ID_4 = "Y56NIsVliWU";
    String[] videoIds = {"6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY", "6JYIGclVQdw", "LvetJ9U_tVY"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_player_view_0);
        youTubePlayerView.initialize(API_KEY, this);


        ListView recyclerView = findViewById(R.id.list_view);


        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, videoIds);


        recyclerView.setAdapter(adapter);


        // YouTubePlayerView youTubePlayerView1 = (YouTubePlayerView) findViewById(R.id.youtube_player_view_1);
        //  youTubePlayerView1.initialize(API_KEY, this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult result) {
        Toast.makeText(this, "Failed to initialize.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (null == player) return;


        if (!wasRestored) {
            player.cueVideo(VIDEO_ID_0);

        }
    }


    @Override
   /* public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.main_menu, menu);

        menu.setHeaderTitle("Select a color for TextView text.");
    }*/

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //TextView headerView=(TextView)findViewById(R.id.header);
        Intent intent;
        switch (id) {
            case R.id.settings:

                return true;

            case R.id.Enter:

                return true;

            case R.id.term:

                return true;

            case R.id.comments:

                return true;

            case R.id.help:

                return true;

            case R.id.fullVersion:

                return true;

            case R.id.Cancel:

                return true;


        }
        return super.onOptionsItemSelected(item);
    }



    public void onClick(View view) {



                Intent intent = new Intent(this, YouTubePlayerFragmentActivity.class);
                startActivity(intent);




    }
    }

package com.hfad.dishiandfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class BirthdayActivity extends AppCompatActivity {

    ImageView imageView ;

    public void lovedOnes(View view){
        Intent intent = new Intent(getApplicationContext(),LovedOnes.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);
        imageView.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.d);

        VideoView videoView = (VideoView)findViewById(R.id.videoView);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.happynewyear);

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();

    }
}

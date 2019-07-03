package com.hfad.dishiandfriends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void happy(View view){

        Toast.makeText(getApplicationContext(),"HAPPY BIRTHDAY LOVELY GIRL",Toast.LENGTH_LONG).show();

        Intent intent = new Intent(MainActivity.this,BirthdayActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

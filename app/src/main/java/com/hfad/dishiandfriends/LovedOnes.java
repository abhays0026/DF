package com.hfad.dishiandfriends;

import android.content.Intent;
import android.support.annotation.ArrayRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LovedOnes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loved_ones);

        ListView lovedOnes = (ListView)findViewById(R.id.lovedOnes);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("ABHAY");
        arrayList.add("RASAM");
        arrayList.add("UMANG");
        arrayList.add("RUPINDER");
        arrayList.add("TWINKLE");
        arrayList.add("MANISHA");
        arrayList.add("DIKSHA");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        lovedOnes.setAdapter(itemsAdapter);

        lovedOnes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(getApplicationContext(),Abhay.class);
                    startActivity(intent);
                }

                else {

                    Intent intent = new Intent(getApplicationContext(), Friends.class);
                    intent.putExtra("name", position);

                    startActivity(intent);
                }

            }
        });

    }
}

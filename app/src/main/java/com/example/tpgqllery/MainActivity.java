package com.example.tpgqllery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Gallery;

import java.nio.channels.GatheringByteChannel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery g = this.findViewById(R.id.listgallery);
        g.setAdapter(new ImageAdapter(this));
    }
}
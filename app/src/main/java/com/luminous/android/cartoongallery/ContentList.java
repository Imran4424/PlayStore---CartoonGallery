package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ContentList extends AppCompatActivity {
    public static int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);
    }
}
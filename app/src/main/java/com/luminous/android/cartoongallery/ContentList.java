package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class ContentList extends AppCompatActivity {
    public static int position;
    List<List<String>> cartoonLists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);

        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.bhoot)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.thakumar_jhuli)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tuntuni)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.rupkotha)));

        
    }
}
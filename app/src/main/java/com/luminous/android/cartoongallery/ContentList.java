package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Debug;
import android.text.LoginFilter;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContentList extends AppCompatActivity {
    public static int position;
    List<List<String>> cartoonLists = new ArrayList<List<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_list);

//        List<String> bhootList = Arrays.asList(getResources().getStringArray(R.array.bhoot));
//        cartoonLists.add(bhootList);

        try {
            Log.d("0", "Before list added");
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.bhoot)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.thakumar_jhuli)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tuntuni)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.rupkotha)));

            Log.d("1", "list added successfully");

            final RecyclerView contentListRecyclerView = (RecyclerView) findViewById(R.id.contentListRecyclerView);
            contentListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

            final ContentListRecyclerAdapter contentListRecyclerAdapter = new ContentListRecyclerAdapter(this, cartoonLists.get(position));
            contentListRecyclerView.setAdapter(contentListRecyclerAdapter);
        } catch (NullPointerException e) {
            Log.e("error","msg" + e);
        }
    }
}
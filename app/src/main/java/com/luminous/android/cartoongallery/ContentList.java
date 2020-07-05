package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        List<String> bhootList = Arrays.asList(getResources().getStringArray(R.array.bhoot));
//        cartoonLists.add(bhootList);

//        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.bhoot)));
//        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.thakumar_jhuli)));
//        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tuntuni)));
//        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.rupkotha)));

//        final RecyclerView contentListRecyclerView = (RecyclerView) findViewById(R.id.contentListRecyclerView);
//        contentListRecyclerView.setLayoutManager(new LinearLayoutManager(this));

//        final ContentListRecyclerAdapter contentListRecyclerAdapter = new ContentListRecyclerAdapter(this, cartoonLists.get(position));
//        contentListRecyclerView.setAdapter(contentListRecyclerAdapter);
    }
}
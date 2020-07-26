package com.luminous.android.cartoongallery;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        if(!MainActivity.interstitialAd.isLoaded()) {
            MainActivity.loadInterstitialAd();
        }

//        List<String> bhootList = Arrays.asList(getResources().getStringArray(R.array.bhoot));
//        cartoonLists.add(bhootList);

        try {
            Log.d("0", "Before list added");
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.bhoot)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.thakumar_jhuli)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tuntuni)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.oggy)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.talking_tom)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.doreamon)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.mr_bean)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tom_jerry)));
            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.looney_tunes)));
//            cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.nul_boltu)));
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
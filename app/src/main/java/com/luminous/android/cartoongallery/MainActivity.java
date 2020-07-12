package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.ads.MobileAds;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Integer> categoryImageResources;
    private Integer[] categoryImageArray = new Integer[] { R.drawable.bhoot,
            R.drawable.thakumar_jhuli,
            R.drawable.tuntuni,
            R.drawable.rupkotha};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this);

        categoryImageResources = Arrays.asList(categoryImageArray);

        final RecyclerView categoryRecyclerView = (RecyclerView) findViewById(R.id.categoryRecyclerView);
        categoryRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        final CategoryRecyclerAdapter categoryRecyclerAdapter = new CategoryRecyclerAdapter(this, categoryImageResources);
        categoryRecyclerView.setAdapter(categoryRecyclerAdapter);
    }
}
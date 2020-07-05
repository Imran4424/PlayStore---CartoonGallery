package com.luminous.android.cartoongallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<List<String>> cartoonLists;
    private List<Integer> categoryImageResources;
    private Integer[] categoryImageArray = new Integer[] { R.drawable.bhoot,
            R.drawable.thakumar_jhuli,
            R.drawable.tuntuni,
            R.drawable.rupkotha};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryImageResources = Arrays.asList(categoryImageArray);

//        List<String> bhootList = Arrays.asList(getResources().getStringArray(R.array.bhoot));
//        cartoonLists.add(bhootList);

        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.bhoot)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.thakumar_jhuli)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.tuntuni)));
        cartoonLists.add(Arrays.asList(getResources().getStringArray(R.array.rupkotha)));

    }
}
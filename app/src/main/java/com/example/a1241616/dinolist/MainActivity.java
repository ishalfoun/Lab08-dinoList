package com.example.a1241616.dinolist;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] dinoNames;
    private int[] dinoImgs;
    private String[] dinoInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dinoNames = getResources().getStringArray(R.array.dinoList);
        dinoImgs = new int[]{R.drawable.abrosaurus, R.drawable.achelousaurus,
                R.drawable.afrovenator, R.drawable.allosaurus, R.drawable.apatosaurusdrawing};
        dinoInfos = getResources().getStringArray(R.array.dinoListInfo);
        ListView list = (ListView) findViewById(R.id.listView);
    }



}

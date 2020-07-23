package com.cos.instagramex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main_Activity";
    private Context mContext = MainActivity.this;
    private ListView listView;
    private SingleAdapter adapter;

    private List<String> mid = Arrays.asList(
            "히어로즈", "24시", "로스트룸", "빅뱅이론", "프렌즈", "덱스터", "글리",
            "히어로즈", "24시", "로스트룸", "빅뱅이론", "프렌즈", "덱스터", "글리",
            "히어로즈", "24시", "로스트룸", "빅뱅이론", "프렌즈", "덱스터", "글리"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);
        adapter = new SingleAdapter();
        //adapter.addItems(mid);
        listView.setAdapter(adapter);

    }
}
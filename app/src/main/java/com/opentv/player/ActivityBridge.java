package com.opentv.player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import java.util.Set;

public class ActivityBridge extends AppCompatActivity {
    private static final String TAG = "ActivityBridge";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
    }

    @Override
    protected void  onStart(){
        super.onStart();
        aaa();
    }

    void aaa(){

        Intent intent = getIntent();
        Uri data = intent.getData();  //
        String action = intent.getAction();
        String scheme = intent.getScheme();
        Set<String> categories = intent.getCategories();
        Log.e(TAG, "data==========="+data);
        Log.e(TAG, "action==========="+action);
        Log.e(TAG, "categories==========="+categories);
        Log.e(TAG, "DataString==========="+intent.getDataString());
        Log.e(TAG, "==============================");
        Log.e(TAG, "scheme==========="+scheme);
        Log.e(TAG, "id ==========="+data.getQueryParameterNames());
        Log.e(TAG, "host==========="+data.getHost());
        Log.e(TAG, "path==========="+data.getPath());
        Log.e(TAG, "port==========="+data.getPort());


    }
}
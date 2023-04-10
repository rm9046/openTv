package com.opentv.player;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.opentv.player.databinding.ActivityMainBinding;

import java.util.Set;

public class ActivityMain extends AppCompatActivity {
    private static final String TAG = "ActivityMain";

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


    }

    @Override
    protected void onStart() {
        super.onStart();
        aaa();
    }

    void aaa() {

        Intent intent = getIntent();
        Uri data = intent.getData();  //
        String action = intent.getAction();
        String scheme = intent.getScheme();
        Set<String> categories = intent.getCategories();
        Log.e(TAG, "data===========" + data);
        Log.e(TAG, "action===========" + action);
        Log.e(TAG, "categories===========" + categories);
        Log.e(TAG, "DataString===========" + intent.getDataString());
        Log.e(TAG, "==============================");
        Log.e(TAG, "scheme===========" + scheme);
        Log.e(TAG, "id ===========" + data.getQueryParameterNames());
        Log.e(TAG, "host===========" + data.getHost());
        Log.e(TAG, "path===========" + data.getPath());
        Log.e(TAG, "port===========" + data.getPort());

        String host = data.getHost().trim();


    }

}
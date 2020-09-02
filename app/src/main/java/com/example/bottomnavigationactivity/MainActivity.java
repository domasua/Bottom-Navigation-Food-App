package com.example.bottomnavigationactivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.bottomnavigationactivity.databinding.ActivityMainBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_map, R.id.navigation_search, R.id.navigation_orders,
                R.id.navigation_discovery, R.id.navigation_profile)
                .build();
        final NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        binding.navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.navigation_map:
                        navController.navigate(R.id.navigation_map);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.navigation_search:
                        navController.navigate(R.id.navigation_search);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.navigation_orders:
                        navController.navigate(R.id.navigation_orders);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.navigation_discovery:
                        navController.navigate(R.id.navigation_discovery);
                        break;
                }
                switch (item.getItemId()){
                    case R.id.navigation_profile:
                        navController.navigate(R.id.navigation_profile);
                        break;
                }

                return true;
            }
        });

    }
    @Override
    protected void onDestroy() { // to avoid memory leaks.
        super.onDestroy();
        binding = null;
    }

}

package com.example.recycleview173;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainFragment extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private BottomNavigationView.OnNavigationItemSelectedListener navigation = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected( MenuItem item) {
            Fragment f = null;
            switch (item.getItemId()){
                case R.id.menu_home:
                    f = new FragmentDinas();
                    break;
                case R.id.menu_phone:
                    f = new FragmentDial();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container_fragmen,f).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.navigasi_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigation);
    }
}


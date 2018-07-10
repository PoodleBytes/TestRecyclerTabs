package com.example.john.testrecyclertabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_frags);

        ViewPager viewPager = findViewById(R.id.view_pager);

        FragmentHelper adapter = new FragmentHelper(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabMenu = findViewById(R.id.sliding_tabs);

        tabMenu.setupWithViewPager(viewPager,true);
    }
}

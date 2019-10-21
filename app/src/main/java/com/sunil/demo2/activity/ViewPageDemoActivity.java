package com.sunil.demo2.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.sunil.demo2.R;
import com.sunil.demo2.adapter.ViewPagerAdapter;
import com.sunil.demo2.fragment.FirstFragment;
import com.sunil.demo2.fragment.SecondFragment;
import com.sunil.demo2.fragment.ThreeFragment;

public class ViewPageDemoActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_demo);
        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.viewpager);
        setupViewPager();

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.sam(new FirstFragment(), "ONE");
        adapter.sam(new SecondFragment(), "TWO");
        adapter.sam(new ThreeFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }

}


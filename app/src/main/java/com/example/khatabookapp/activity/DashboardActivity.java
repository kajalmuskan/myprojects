package com.example.khatabookapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.khatabookapp.R;
import com.example.khatabookapp.adapter.ViewPagerAdapter;
import com.example.khatabookapp.fragment.CustomerProfileFragment;
import com.example.khatabookapp.fragment.CustomerReportFragment;
import com.example.khatabookapp.fragment.CustomersFragment;
import com.google.android.material.tabs.TabLayout;

public class DashboardActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  ViewPagerAdapter adapter;
    private int[]tabIcons={
            R.drawable.ic_group_black_24dp,
            R.drawable.ic_insert_chart_black_24dp,
            R.drawable.ic_home_black_24dp,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tabLayout=findViewById(R.id.dashboard_tabs);
        viewPager=findViewById(R.id.dashboard_view_pager);
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);

    }
    private void setupViewPager() {
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.sam(new CustomersFragment(),"Customers", tabIcons[0]);
        adapter.sam(new CustomerReportFragment(),"Reports",tabIcons[1]);
        adapter.sam(new CustomerProfileFragment(),"Profile",tabIcons[2]);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


//        highLightCurrentTab(0);
//        viewPager.set
    }

}

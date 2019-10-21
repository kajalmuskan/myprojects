package com.sunil.demo2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.sunil.demo2.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRecyclerView, btnViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();

    }

    private void initComponent() {
        btnRecyclerView = findViewById(R.id.btnRecyclerView);
        btnViewPager = findViewById(R.id.btnViewPager);
        btnRecyclerView.setOnClickListener(this);
        btnViewPager.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        switch (v.getId()){
            case R.id.btnRecyclerView:
                startActivity(new Intent(this, RecyclerDemoActivity.class));
                break;
            case R.id.btnViewPager:
                startActivity(new Intent(this, ViewPageDemoActivity.class));
                break;
        }
    }
}

package com.example.khatabookapp.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.khatabookapp.R;

public class SignupBusinessActivity extends AppCompatActivity {
    Window window;
    EditText etBusiness;
    Button btnNext;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_business);
        etBusiness=findViewById(R.id.et_business);
        btnNext=findViewById(R.id.btn_business_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String business=etBusiness.getText().toString().trim();
                Intent i =new Intent(SignupBusinessActivity.this, CustomerDashboardActivity.class);
                startActivity(i);



            }
        });
    }
}

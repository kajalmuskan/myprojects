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

import com.example.khatabookapp.OtpAcitivity;
import com.example.khatabookapp.R;

public class SignupNumberActivity extends AppCompatActivity {
EditText etNumber;
Button btnNext;
    Window window;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_number);
        etNumber=findViewById(R.id.et_number);
        btnNext=findViewById(R.id.btn_number_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number=etNumber.getText().toString().trim();
                Intent i =new Intent(SignupNumberActivity.this, OtpAcitivity.class);
        startActivity(i);
        finish();
        }
        });
        }
        }

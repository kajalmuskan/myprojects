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

public class SignupNameActivity extends AppCompatActivity {
    EditText etName;
    Window window;
    Button btnNext;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_name);
        etName=findViewById(R.id.et_name);

        btnNext=findViewById(R.id.btn_name_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=etName.getText().toString().trim();
                Intent i =new Intent(SignupNameActivity.this, SignupBusinessActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}

package com.example.khatabookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.khatabookapp.activity.SignupNameActivity;

public class OtpAcitivity extends AppCompatActivity {
    EditText etOtp;
    Button  btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_acitivity);
        etOtp = findViewById(R.id.et_otp);


        btnSubmit = findViewById(R.id.btn_otp_submit);

        //Clear otp and re resend again
//        btnResend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                et1.getText().clear();
//                et2.getText().clear();
//                et3.getText().clear();
//                et4.getText().clear();
//                et1.requestFocus();
//            }
//        });
        //submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String otp1 = etOtp.getText().toString();
//                String otp2 = et2.getText().toString();
//                String otp3 = et3.getText().toString();
//                String otp4 = et4.getText().toString();
//                if (otp1.isEmpty() || otp2.isEmpty() || otp3.isEmpty() || otp4.isEmpty()) {
//                    Toast.makeText(OtpAcitivity.this, "Enter Valid OTP", Toast.LENGTH_SHORT).show();
//
//
//                } else
            //   {
                    Intent submit = new Intent(OtpAcitivity.this, SignupNameActivity.class);
                    startActivity(submit);
                    finish();
              //  }

            }
        });
//        et1.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.length() == 1) {
//                    et2.requestFocus();
//                } else if (editable.length() == 0) {
//                    et1.clearFocus();
//                }
//            }
//        });
//        et2.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.length() == 1) {
//                    et3.requestFocus();
//                } else if (editable.length() == 0) {
//                    et2.clearFocus();
//                }
//            }
//        });
//        et3.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.length() == 1) {
//                    et4.requestFocus();
//                } else if (editable.length() == 0) {
//                    et3.clearFocus();
//                }
//            }
//        });
//        et4.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.length() == 1) {
//                    et4.requestFocus();
//                } else if (editable.length() == 0) {
//                    et4.clearFocus();
//                }
//            }
//        });
//

    }
}

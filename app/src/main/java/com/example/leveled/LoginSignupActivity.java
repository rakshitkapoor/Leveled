package com.example.leveled;

import static android.os.Build.VERSION_CODES.LOLLIPOP;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;



public class LoginSignupActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dashboard);
    }

    public void Onlogin(View view){
        // we will handle the click on the button here

        Intent intent =new Intent(LoginSignupActivity.this,LoginActivity.class);
        startActivity(intent);
    }


}
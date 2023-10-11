package com.example.crypta.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.crypta.R;

public class IntroActivity extends AppCompatActivity {
    private ImageView goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_intro);
        initview();
        setVariable();
    }
    private void initview(){
        goBtn=findViewById(R.id.goBtn);
    }
    private void setVariable(){

        goBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this,LoginActivity.class)));
    }
}
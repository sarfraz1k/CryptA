package com.example.crypta.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.crypta.R;

public class LoginActivity extends AppCompatActivity {
private EditText userEdt,passEdt;
private Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        initView();
        setVariable();
    }
    private void initView(){
        userEdt=findViewById(R.id.editTextTextPersonName);
        passEdt=findViewById(R.id.editTextTextPassword);
        loginBtn=findViewById(R.id.loginBtn);
    }
    private void setVariable(){
        loginBtn.setOnClickListener(v -> {
            if (userEdt.getText().toString().isEmpty()||passEdt.getText().toString().isEmpty()){
                Toast.makeText(LoginActivity.this,"Please fill the login form",Toast.LENGTH_SHORT).show();
            }else if (userEdt.getText().toString().equals("admin")&& passEdt.getText().toString().equals("admin")){
                startActivity(new Intent(LoginActivity.this,MainActivity.class));
            }
        });
    }
}
package com.masai.codingpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mETEmailId;
    private EditText mETPassword;
    private Button mBtnLogin;
    private String emailValidation ="[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmailValid()&&isPasswordValid()){
                    Intent intent =new Intent(MainActivity.this,HomeScreen.class);
                    startActivity(intent);
                }
            }
        });
    }

    private void initView() {
        mETEmailId =findViewById(R.id.etEmail);
        mETPassword=findViewById(R.id.etPassword);
        mBtnLogin =findViewById(R.id.btnLogin);
    }
    private boolean isEmailValid(){
        if(mETEmailId.getText().toString().length()>1&&mETEmailId.getText().toString().matches(emailValidation)){
            return true;
        }
        else{
            mETEmailId.setError("InValid Email");
            return false;
        }
    }
    private boolean isPasswordValid(){
        if(mETPassword.getText().toString().length()>=6){
            return  true;
        }else{
            mETPassword.setError(" Password is very short");
            return false;
        }
    }
}
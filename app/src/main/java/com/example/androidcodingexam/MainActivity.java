package com.example.androidcodingexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.androidcodingexam.AsyncTasks.AsyncTaskLogin;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout usernameLayout = findViewById(R.id.usernameTextLayout);
        TextInputLayout passwordLayout = findViewById(R.id.passwordTextLayout);

        MaterialButton materialButton = findViewById(R.id.loginBtn);

            materialButton.setOnClickListener(v -> {
            if(!usernameLayout.getEditText().getText().toString().isEmpty() && !passwordLayout.getEditText().getText().toString().isEmpty()){
                String username= usernameLayout.getEditText().getText().toString();
                String password= passwordLayout.getEditText().getText().toString();
                new AsyncTaskLogin(v).execute(username,password);
            }
        });



    }
}
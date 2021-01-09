package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Register extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        Button registerBtn = (Button) findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText getFirst = (EditText) findViewById(R.id.firstNameEnter);
                EditText getLast = (EditText) findViewById(R.id.lastNameEnter);
                EditText getPass = (EditText) findViewById(R.id.passwordEnter);
                EditText getPhone = (EditText) findViewById(R.id.phoneEnter);
                String firstName = getFirst.getText().toString();
                String lastName = getLast.getText().toString();
                String password = getPass.getText().toString();
                String phone = getPhone.getText().toString();
                Info.setName(firstName+lastName);
                Info.setPassword(password);
                TextView checkView = (TextView) findViewById(R.id.checkViewRegister);
                checkView.setText("Register Success");

            }
        });

    }
}
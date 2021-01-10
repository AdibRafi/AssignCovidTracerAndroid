package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

/**
 * This class if for displaying Login
 */
public class Login extends AppCompatActivity {

    /**
     * Displaying Login
     * @param savedInstanceState Login window
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button loginBtn = (Button) findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * Getting the info from the user to use for Sign in
             * @param v The Button Log in
             */
            public void onClick(View v) {

                TextView checkView = (TextView)findViewById(R.id.checkViewLogin);
                EditText getUsername = (EditText) findViewById(R.id.usernameEnter);
                EditText getPass = (EditText) findViewById(R.id.loginPassEnter);
                String userName = getUsername.getText().toString();
                String password = getPass.getText().toString();

                if (userName.equals(Info.getName()) && password.equals(Info.getPassword())){
                    checkView.setText("Login Successful");
                    startActivity(new Intent(Login.this,LoginSuccess.class));
                }
                else {
                    checkView.setText("Login Unsuccessful");
                }
            }
        });
    }
}
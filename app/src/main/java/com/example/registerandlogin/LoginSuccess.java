package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * This class will be shown if the log in is successful
 */
public class LoginSuccess extends AppCompatActivity {
    /**
     * Displaying LoginSuccess
     * @param savedInstanceState LoginSuccess Window
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);
    }
}
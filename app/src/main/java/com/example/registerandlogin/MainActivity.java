package com.example.registerandlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This Class is to display the start of the program
 */
public class MainActivity extends AppCompatActivity {
    /**
     * Displaying the start of the program
     * @param savedInstanceState the start of the program window
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yesBtn = (Button) findViewById(R.id.yesBtn);
        Button noBtn = (Button) findViewById(R.id.noBtn);

        yesBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * Getting into Login Window
             * @param v Login window
             */
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Login.class));
            }
        });

        noBtn.setOnClickListener(new View.OnClickListener() {
            /**
             * Getting into Register Window
             * @param v Register Window
             */
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Register.class));
            }
        });
    }
}
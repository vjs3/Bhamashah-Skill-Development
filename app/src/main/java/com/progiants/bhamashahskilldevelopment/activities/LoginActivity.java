package com.progiants.bhamashahskilldevelopment.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.progiants.bhamashahskilldevelopment.R;

/**
 * Created by Vishwajeet on 21/3/17.
 */

public class LoginActivity extends AppCompatActivity {

    EditText bhamashahAckId;
    Button loginButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bhamashahAckId = (EditText) findViewById(R.id.et_bhamashah_ack_id);
        loginButton = (Button) findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


    }
}

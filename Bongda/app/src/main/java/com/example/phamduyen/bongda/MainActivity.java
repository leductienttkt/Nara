package com.example.phamduyen.bongda;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edName, edPass;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        edName = (EditText)findViewById(R.id.userText);
        edPass = (EditText)findViewById(R.id.passText);
        loginBtn = (Button)findViewById(R.id.login_action);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edName.getText().toString();
                String pass = edPass.getText().toString();

                if("phuong".equals(name)&& "123".equals(pass)){
                    Intent in = new Intent(MainActivity.this,ListMatchActivity.class);
                    startActivity(in);
                }

            }
        });





    }

  }

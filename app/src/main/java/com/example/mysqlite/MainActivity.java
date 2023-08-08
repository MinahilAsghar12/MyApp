package com.example.mysqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button BtnF;
    Database db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etPassword = findViewById(R.id.etPassword);
        etUsername = findViewById(R.id.etUsername);
        BtnF = findViewById(R.id.BtnF);
        db = new Database(MainActivity.this);
        BtnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String Username = etUsername.getText().toString();
               String Password =etPassword.getText().toString();

               db.saveData(db,Username,Password);

            }
        });

    }
}
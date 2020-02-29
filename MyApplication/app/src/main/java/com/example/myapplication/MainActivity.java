package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextAccountNo, editTextCode, editTextpassword;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextAccountNo = findViewById(R.id.activityMain_editText_accountNo);
        editTextCode = findViewById(R.id.activityMain_editText_code);
        editTextpassword = findViewById(R.id.activityMain_editText_password);
        buttonLogin = findViewById(R.id.activity_main_button_signIn);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextAccountNo.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Account  cannot be empty", Toast.LENGTH_SHORT).show();
                } else if (editTextCode.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Code  cannot be empty", Toast.LENGTH_SHORT).show();

                } else if (editTextpassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Password  cannot be empty", Toast.LENGTH_SHORT).show();

                } else {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}

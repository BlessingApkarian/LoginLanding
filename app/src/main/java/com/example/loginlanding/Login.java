package com.example.loginlanding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    // to pass the username around
    final static String UNAME = "USERNAME";

    // create the variables of the attributes made in the .xml
    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!validateUsername(username.getText().toString())){
                    username.setError("Incorrect");
                    Toast.makeText(Login.this, "Incorrect Username", Toast.LENGTH_SHORT).show();
                }
                if(!validatePassword(password.getText().toString())){
                    password.setError("Incorrect");
                    Toast.makeText(Login.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                }
                login(username.getText().toString(), password.getText().toString());
            }
        });
    }

    public static Intent getIntent(Context context, String username){
        Intent intent = new Intent(context, Login.class);
        intent.putExtra(UNAME, username);
        return intent;
    }

    public boolean validateUsername(String username){
        // if username and password match, move to landing page
        if(username.equals("admin") || username.equals("Thanos")){
            return true;
        } else {
            return false;
        }
    }

    public boolean validatePassword(String password){
        // if username and password match, move to landing page
        if(password.equals("order66") || password.equals("snap")){
            return true;
        } else {
            return false;
        }
    }

    public void login(String username, String password){
        if(validatePassword(password) && validateUsername(username)){
            Intent intent = Landing.getIntent(getApplicationContext(), username);
            startActivity(intent);
        }
    }
}
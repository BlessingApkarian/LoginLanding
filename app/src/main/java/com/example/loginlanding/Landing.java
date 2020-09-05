package com.example.loginlanding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Landing extends AppCompatActivity {

    final static String UNAME = "USERNAME";
    final static String PWORD = "PASSWORD";

    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        welcome = findViewById(R.id.textViewLanding1);

        Intent intent = getIntent();
        welcome.setText("Welcome " + intent.getStringExtra(UNAME));
    }

    public static Intent getIntent(Context context, String username){
        Intent intent = new Intent(context, Landing.class);
        intent.putExtra(UNAME, username);

        return intent;
    }
}
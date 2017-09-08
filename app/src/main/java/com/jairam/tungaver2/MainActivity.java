package com.jairam.tungaver2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void waterlevel(View view) {

        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);

    }

    public void pastlevel(View view) {

        Intent intent = new Intent(MainActivity.this,ThirdActivity.class);
        startActivity(intent);
    }
}

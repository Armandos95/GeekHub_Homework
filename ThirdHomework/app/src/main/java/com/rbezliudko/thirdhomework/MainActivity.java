package com.rbezliudko.thirdhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonFirstHomework;
    private Button buttonSecondHomework;
    private Button buttonThirdHomework;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFirstHomework = (Button) findViewById(R.id.button_first_homework);
        buttonSecondHomework = (Button) findViewById(R.id.button_second_homework);
        buttonThirdHomework = (Button) findViewById(R.id.button_third_homework);

        final Intent firstIntent = new Intent(MainActivity.this, FirstHomeworkActivity.class);
        final Intent secondIntent = new Intent(MainActivity.this, SecondHomeworkActivity.class);
        final Intent thirdIntent = new Intent(MainActivity.this, ThirdHomeworkActivity.class);

        buttonFirstHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(firstIntent);
            }
        });

        buttonSecondHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(secondIntent);
            }
        });

        buttonThirdHomework.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.startActivity(thirdIntent);
            }
        });
    }
}

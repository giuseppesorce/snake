package com.giuseppesorce.snakedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.giuseppesorce.snake.SnakeMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SnakeMessage.show(findViewById(R.id.activity_main), "Prova");
    }
}

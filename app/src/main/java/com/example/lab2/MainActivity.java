package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.test);
        Chield1 Chield1 = new Chield1("Mops",12);
        Chield2 Chield2 = new Chield2("Booldog",3);
        Chield3 Chield3 = new Chield3("Вoberman",3);
        result.setText("\n"+Chield1.say()+"\n"+Chield1.Hru()+"\n\n"+Chield2.say()+"\n"+Chield2.R()+"\n\n"+Chield3.say()+"\n"+Chield3.Gav());

    }
}
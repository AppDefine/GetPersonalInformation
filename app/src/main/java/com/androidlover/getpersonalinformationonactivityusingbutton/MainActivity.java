package com.androidlover.getpersonalinformationonactivityusingbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btn);
        textView=(TextView)findViewById(R.id.tx);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = "Name : jay";
                String age = "Age : 25years";
                String study = "Study : B.Tech ";
                String hobby = "Hobby : Cricket";


                textView.setText(name+"\n"+age+"\n"+study+"\n"+hobby);
            }
        });
    }
}
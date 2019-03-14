package com.example.forvlados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ShowRand();
    }
    public  static  String TOTAL_COUNT = "total_count";
    public void ShowRand()
    {
        TextView Rand = findViewById(R.id.textView2);
        TextView TitleRand = findViewById(R.id.textView3);
        Integer count = getIntent().getIntExtra(TOTAL_COUNT,0);
        Random rnd = new Random();
        if(count>0) {count = rnd.nextInt(count+1);}
        Rand.setText(count.toString());
    }

}

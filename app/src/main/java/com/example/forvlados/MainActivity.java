package com.example.forvlados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Integer counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ToastMe(View view)
    {
        Toast Message = Toast.makeText(this,"Toast", Toast.LENGTH_SHORT);
         Message.show();
    }
    public void CountMe(View view)
    {
        TextView ShowText = findViewById(R.id.textView);
        counter++;
        ShowText.setText(counter.toString());
    }
    public  static  String TOTAL_COUNT = "total_count";
    public  void  RandMe(View view)
    {
        Intent RandIntent  = new Intent(this,SecondActivity.class);
        //TextView ShowText = findViewById(R.id.textView2);
        RandIntent.putExtra(TOTAL_COUNT,counter);
        startActivity(RandIntent);

    }


}

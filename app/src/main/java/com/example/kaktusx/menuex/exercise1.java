package com.example.kaktusx.menuex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercise1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
    }

    public void onButtonClick(View v) {
        EditText e1 = (EditText)findViewById(R.id.firstNum);
        EditText e2 = (EditText)findViewById(R.id.secondNum);
        TextView t1 = (TextView)findViewById(R.id.resultView);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1+num2;
        t1.setText(Integer.toString(sum));
    }
}

package com.example.kaktusx.menuex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //variables
    String[] exercises = {
            "Exercise 1",
            "Ex2 Layout_A",
            "Ex2 Layout_B",
            "Ex2 Layout_C",
            "Exercise 3",
            //"Exercise 6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, exercises);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                //string of current exercise used for listener
                String exercise = (String) adapterView.getItemAtPosition(position);

                //used in listView to pick the desired exercise from the list
                switch (exercise) {
                    case "Exercise 1":
                        onClickFirstEx(view);
                        break;
                    case "Ex2 Layout_A":
                        onClickSecondEx_A(view);
                        break;
                    case "Ex2 Layout_B":
                        onClickSecondEx_B(view);
                        break;
                    case "Ex2 Layout_C":
                        onClickSecondEx_C(view);
                        break;
                }
            }
        });
    }

    public void onClickFirstEx(View view) {
        Intent startNewActivity = new Intent(this, exercise1.class );
        startActivity(startNewActivity);
    }

    public void onClickSecondEx_A(View view) {
        Intent startNewActivity = new Intent(this, exercise2.class );
        startActivity(startNewActivity);
    }
    public void onClickSecondEx_B(View view) {
        Intent startNewActivity = new Intent(this, exercise2_b.class );
        startActivity(startNewActivity);
    }
    public void onClickSecondEx_C(View view) {
        Intent startNewActivity = new Intent(this, exercise2_c.class );
        startActivity(startNewActivity);
    }
}

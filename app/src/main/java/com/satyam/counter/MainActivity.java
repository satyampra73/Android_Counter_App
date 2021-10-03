package com.satyam.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.et);


    }

    public void tap(View view) {
        String string = et.getText().toString();
        if (string.isEmpty()) {
            Toast.makeText(this, "Please fill any number", Toast.LENGTH_SHORT).show();
        } else {
            int val = Integer.valueOf(string);
            String st = view.getTag().toString();
            if (val>30000) {
                Toast.makeText(this,"please keep it Below 30,000",Toast.LENGTH_SHORT).show();
            } else {
                if (st.equals("Increment")) {
                    val++;
                } else {
                    val--;
                }
                et.setText("" + val);
            }
        }
    }
}
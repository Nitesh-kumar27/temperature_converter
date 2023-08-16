package com.nitish.temperature_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button b1, b2;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.editTextText);
        e2=(EditText) findViewById(R.id.editTextText2);
        b1=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Fahrenheit=e1.getText().toString();
                if(Fahrenheit.isEmpty()){
                    e1.setError("Enter a value");
                }
                else{
                    Float C=((Float.parseFloat(Fahrenheit)-32)*5)/9;
                    t1.setText(C+"°C");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Celsius=e2.getText().toString();
                if(Celsius.isEmpty()){
                    e2.setError("Enter a value");
                }
                else{
                    Float F=((Float.parseFloat(Celsius)*9)/5) +32;
                    t2.setText(F+"°F");
                }
            }
        });

    }
}
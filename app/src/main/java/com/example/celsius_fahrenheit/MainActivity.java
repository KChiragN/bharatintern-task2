package com.example.celsius_fahrenheit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
EditText e1,e2;
TextView t1;
ConstraintLayout cl;
ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        e1=findViewById(R.id.editText1);
        e2=findViewById(R.id.editText2);
        e1.setBackgroundColor(Color.RED);
        e2.setBackgroundColor(Color.RED);
        t1=findViewById(R.id.textView);
        i1=findViewById(R.id.imageView);
        setTitle("Temperature Convertor App");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText("");
                float celsius=Float.parseFloat(e1.getText().toString());
                float fahrenheit= (float) ((9.0/5.0*celsius)+32.0);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                decimalFormat.setMaximumFractionDigits(2);
                String formattedFahrenheit = decimalFormat.format(fahrenheit);
                t1.setText(formattedFahrenheit + "\u00B0F");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                float fahrenheit=Float.parseFloat(e2.getText().toString());
                float celsius= (float) ((fahrenheit-32.0)*5.0/9.0);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                decimalFormat.setMaximumFractionDigits(2);
                String formattedCelsius = decimalFormat.format(celsius);
                t1.setText(formattedCelsius + "\u00B0C");
            }
        });
    }
}
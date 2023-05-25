package com.example.converter_by_diptanu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mbutton ,mbutton2;
        final EditText mET,mET2;
        final TextView mTV,mTV2;

        mbutton= (Button) findViewById(R.id.button);
        mET=(EditText) findViewById(R.id.editText);
        mTV=(TextView) findViewById(R.id.textView);
        mbutton2= (Button) findViewById(R.id.button2);
        mET2=(EditText) findViewById(R.id.editText2);
        mTV2=(TextView) findViewById(R.id.textView2);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert= Double.parseDouble(mET.getText().toString());
                mTV.setText(String.valueOf(convert*100));               //Just put the formula here accordingly!!!
                mTV.setTextColor(Color.RED);
            }
        });

        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double convert2=Double.parseDouble(mET2.getText().toString());
                mTV2.setText(String.valueOf( convert2/100));
                mTV2.setTextColor(Color.RED);

            }
        });
    }
}
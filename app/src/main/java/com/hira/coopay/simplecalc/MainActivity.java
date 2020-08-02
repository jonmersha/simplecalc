package com.hira.coopay.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button add;
    Button subtract;
    Button division;
    Button multiplication;
    Button equalTo;

    int op1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        add = findViewById(R.id.add);

        subtract = findViewById(R.id.subb);
        division = findViewById(R.id.div);
        multiplication = findViewById(R.id.mult);
        equalTo = findViewById(R.id.equal);
    }

    public void inputNumbers(View v){
        int id=v.getId();
        Button button=findViewById(id);
        input.append(button.getText().toString());
    }
    public void add(View v){
     op1= Integer.parseInt(input.getText().toString());
     input.setText("");
    }
    public void equalTo(View v){
        int result= op1+Integer.parseInt(input.getText().toString());
        input.setText(""+result);
    }
}
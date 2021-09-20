    package com.example.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber, secondNumber;
    TextView result;
    FloatingActionButton addButton;
    FloatingActionButton subtractButton;
    FloatingActionButton multiplyButton;
    FloatingActionButton divideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumber     = findViewById(R.id.firstNumber);
        secondNumber    = findViewById(R.id.secondNumber);
        result          = findViewById(R.id.result);
        addButton       = findViewById(R.id.addButton);
        subtractButton  = findViewById(R.id.subtractButton);
        divideButton    = findViewById(R.id.divideButton);
        multiplyButton  = findViewById(R.id.multiplyButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1     = Integer.parseInt(firstNumber.getText().toString());
                int number2     = Integer.parseInt(secondNumber.getText().toString());
                int resultNum   = number1 + number2;
                result.setText(String.valueOf(resultNum));
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1     = Integer.parseInt(firstNumber.getText().toString());
                int number2     = Integer.parseInt(secondNumber.getText().toString());
                int resultNum   = number1 - number2;
                result.setText(String.valueOf(resultNum));
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1     = Integer.parseInt(firstNumber.getText().toString());
                int number2     = Integer.parseInt(secondNumber.getText().toString());
                int resultNum   = number1 * number2;
                result.setText(String.valueOf(resultNum));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1     = Integer.parseInt(firstNumber.getText().toString());
                int number2     = Integer.parseInt(secondNumber.getText().toString());
                if (number2 == 0 ){
                    result.setText("WTF u try'n to do..crash my baby...");
                }else {
                    float resultNum = number1 / number2;
                    result.setText(String.valueOf(resultNum));
                }
            }
        });
    }
}
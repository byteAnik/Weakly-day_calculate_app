package com.example.homework2143;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNumber;
    Button buttonCal;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNumber=findViewById(R.id.edNumber);
        buttonCal=findViewById(R.id.buttonCal);
        tvResult=findViewById(R.id.tvResult);
        buttonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sNum=edNumber.getText().toString();

                if(sNum.length()>0){
                    int number=Integer.parseInt(sNum);
                    if (number==1)tvResult.setText("Sunday");
                    else if (number==2)tvResult.setText("Monday");
                    else if (number==3)tvResult.setText("Tuesday");
                    else if (number==4)tvResult.setText("Wednesday");
                    else if (number==5)tvResult.setText("Thursday");
                    else if (number==6)tvResult.setText("Friday");
                    else if (number==7)tvResult.setText("Saturday");

                    else{
                        tvResult.setText("ধূর মিয়া মজা নেও");
                    }

                }else {
                    edNumber.setError("Please enter a number.");
                }
            }
        });
    }
}
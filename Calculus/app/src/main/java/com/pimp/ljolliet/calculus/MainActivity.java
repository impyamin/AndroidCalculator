package com.pimp.ljolliet.calculus;

import android.database.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Observer;

public class MainActivity extends AppCompatActivity{

    Button addi;
    Button mult;
    Button div;
    Button sub;
    EditText nb1 = null ;
    EditText nb2 = null;
    TextView v =  null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculus);
        addi = (Button) findViewById(R.id.addition);
        addi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
            }
        });
        mult = (Button) findViewById(R.id.multiply);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mult();
            }
        });

        div = (Button) findViewById(R.id.divide);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                div();
            }
        });

        sub = (Button) findViewById(R.id.negate);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sub();
            }
        });
        nb1 = (EditText)(findViewById(R.id.nb1));
        nb2 = (EditText)(findViewById(R.id.nb2));
        v = (TextView)findViewById(R.id.textView);
    }




    public void add()
    {
        float  number1 = Float.parseFloat(nb1.getText().toString());
        float  number2 = Float.parseFloat(nb2.getText().toString());
        float res = number1+number2;
        final TextView newView = v;
        newView.setText(Float.toString(res));
    }

    public void mult(){
        float  number1 = Float.parseFloat(nb1.getText().toString());
        float  number2 = Float.parseFloat(nb2.getText().toString());
        float res = number1*number2;
        final TextView newView = v;
        newView.setText(Float.toString(res));

    }
    public void div(){
        float  number1 = Float.parseFloat(nb1.getText().toString());
        float  number2 = Float.parseFloat(nb2.getText().toString());
        if(number2 != 0)
        {
            float res = number1/number2;
            final TextView newView = v;
            newView.setText(Float.toString(res));

        }
        else{
            final TextView newView = v;
            newView.setText("ERROR UNABLE TO DIVIDE WITH 0 DAFUK ARE U TRYING TO DO MAGGOT");
        }

    }
    public void sub(){
        float  number1 = Float.parseFloat(nb1.getText().toString());
        float  number2 = Float.parseFloat(nb2.getText().toString());
        float res = number1-number2;
        final TextView newView = v;
        newView.setText(Float .toString(res));
    }




}



package com.example.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    randomNum = minimum + (int)(Math.random() * maximum);

    EditText etPrinciple, edTime, etRate;
    Button btResult;
    TextView tvCal;
    Random random=new Random;

    mamta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textOne= (TextView) findViewById(R.id.textView1);
        Button

        Random rn = new Random();
        int n = maximum - minimum + 1;
        int i = rn.nextInt() % n;
        randomNum =  minimum + i;

        etPrinciple = findViewById(R.id.etPrin);
        etRate = findViewById(R.id.etPer);
        edTime = findViewById(R.id.etTime);
        tvCal = findViewById(R.id.tvCal);

        btResult = findViewById(R.id.btRes);
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checker()) {
                    Simple givenpt = new Simple();
                    givenpt.setPrinciple(Integer.parseInt(etPrinciple.getText().toString()));
                    givenpt.setRate(Integer.parseInt(etRate.getText().toString()));
                    givenpt.setTime(Integer.parseInt(edTime.getText().toString()));
                    int result = Clc.Clc(givenpt);
                    tvCal.setText("the res is "+Integer.toString(result));
                }
            }
        });

    }

    private boolean checker() {
        boolean ok = true;
        if (TextUtils.isEmpty(etPrinciple.getText().toString())) {
            etPrinciple.setError("please enter principle");
            ok = false;
        }
        if (TextUtils.isEmpty(etRate.getText().toString())) {
            etRate.setError("please enter rate");
            ok = false;
        }
        if (TextUtils.isEmpty(edTime.getText().toString())) {
            edTime.setError("please enter time");
            ok = false;
        }
  return ok;
    }

}

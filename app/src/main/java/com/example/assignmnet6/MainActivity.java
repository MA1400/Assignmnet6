package com.example.assignmnet6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewName1;
    TextView textViewNumber1;
    TextView textViewName2;
    TextView textViewNumber2;
    TextView textViewName3;
    TextView textViewNumber3;
    Button buttonCall1;
    Button buttonText1;
    Button buttonCall2;
    Button buttonText2;
    Button buttonCall3;
    Button buttonText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewName1 = (TextView) findViewById(R.id.textViewName1);
        textViewNumber1 = (TextView) findViewById(R.id.textViewNumber1);
        textViewName2 = (TextView) findViewById(R.id.textViewName2);
        textViewNumber2 = (TextView) findViewById(R.id.textViewNumber2);
        textViewName3 = (TextView) findViewById(R.id.textViewName3);
        textViewNumber3 = (TextView) findViewById(R.id.textViewNumber3);
        buttonCall1 = (Button) findViewById(R.id.buttonCall1);
        buttonText1 = (Button) findViewById(R.id.buttonText1);
        buttonCall2 = (Button) findViewById(R.id.buttonCall2);
        buttonText2 = (Button) findViewById(R.id.buttonText2);
        buttonCall3 = (Button) findViewById(R.id.buttonCall3);
        buttonText3 = (Button) findViewById(R.id.buttonText3);

        buttonCall1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeACall(textViewName1.getText().toString(),textViewNumber1.getText().toString());
            }
        });
        buttonCall2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeACall(textViewName2.getText().toString(),textViewNumber2.getText().toString());
            }
        });
        buttonCall3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeACall(textViewName3.getText().toString(),textViewNumber3.getText().toString());
            }
        });
        buttonText1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeAText(textViewName1.getText().toString(),textViewNumber1.getText().toString());
            }
        });
        buttonText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeAText(textViewName2.getText().toString(),textViewNumber2.getText().toString());
            }
        });
        buttonText3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeAText(textViewName3.getText().toString(),textViewNumber3.getText().toString());
            }
        });


    }

   public void makeACall(String name, String number) {
       Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("Tel: " + number));
       if (callIntent.resolveActivity(getPackageManager()) != null) {
           startActivity(callIntent);
       }
   }
    public void makeAText(String name, String number) {
        String text = "Hi";
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:2183911863"));
        sendIntent.putExtra("sms_body", text);
        startActivity(sendIntent);

    }
    }



package com.example.mayu.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    protected void onPause() {
        super.onPause();
    }


    public void inc(View View) {
        TextView tv = (TextView) findViewById(R.id.tx2);
        String s = tv.getText().toString();
        int present_value = Integer.parseInt(s);
        present_value++;
        int cost=present_value*20;
        tv.setText(String.valueOf(present_value));
        TextView tv1 = (TextView) findViewById(R.id.txtp);
        tv1.setText(String.valueOf(cost));
    }

    public void send1(View View) {
        TextView tv = (TextView) findViewById(R.id.tx2);
        TextView tv1 = (TextView) findViewById(R.id.txtp);

        String s = tv.getText().toString();
        String s1 = tv1.getText().toString();

        Intent j = new Intent(Intent.ACTION_SENDTO);
        j.setType("text/plain");
        j.setData(Uri.parse("mailto:"));
        j.putExtra(Intent.EXTRA_TEXT, "You have purchased " + s + " Apples and your total bill amount is " + s1);
        j.putExtra(Intent.EXTRA_SUBJECT, "Order Summary");
        Intent choser_j= Intent.createChooser(j,"Please choose the app");
        startActivity(choser_j);

    }


    public void jmpnxt(View View) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void dec(View View) {
        TextView tv = (TextView) findViewById(R.id.tx2);
        String s = tv.getText().toString();
        int present_value = Integer.parseInt(s);
        if (present_value > 0) {
            present_value--;
            int cost=present_value*20;
            tv.setText(String.valueOf(present_value));
            tv.setText(String.valueOf(present_value));
            TextView tv1 = (TextView) findViewById(R.id.txtp);
            tv1.setText(String.valueOf(cost));
        }
    }
}
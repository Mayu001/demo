package com.example.mayu.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList <String> arr1 = new ArrayList<String>();
        arr1.add("First1") ;
        arr1.add("SEcond1") ;
        arr1.add("THird1") ;
        arr1.add("Four1") ;
        arr1.add("Five1") ;
        arr1.add("Six1") ;
        arr1.add("Seven1") ;
        arr1.add("Eight1") ;
        arr1.add("Nine1") ;
        arr1.add("TEn1") ;
        ArrayList <String> arr = new ArrayList<String>();
        arr.add("First") ;
        arr.add("SEcond") ;
        arr.add("THird") ;
        arr.add("Four") ;
        arr.add("Five") ;
        arr.add("Six") ;
        arr.add("Seven") ;
        arr.add("Eight") ;
        arr.add("Nine") ;
        arr.add("TEn") ;
        arr.add("Eleven") ;
        arr.add("Twelve") ;
        arr.add("Thirteen") ;
        arr.add("Fourteen") ;
        arr.add("First") ;
        arr.add("SEcond") ;
        arr.add("THird") ;
        arr.add("Four") ;
        arr.add("Five") ;
        arr.add("Six") ;

        ArrayAdapter<String> adap= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arr);
        ListView view= (ListView)findViewById(R.id.v);
        view.setAdapter(adap);
    }

}

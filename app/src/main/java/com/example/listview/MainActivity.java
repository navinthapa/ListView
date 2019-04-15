package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView listcountries;
public static final String countries[]={
        "NEPAL", "KATHMANDU",
        "INDIA", "NEW DELHI",
        "CHINA", "BEIJING",
        "UK", "LONDON",
        "US", "DC",
        "CANADA", "OTTAWA",

};
private Map<String,String> dictionary;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listcountries =findViewById(R.id.listcountries);

        dictionary= new HashMap<>();
         for (int i=0; i<countries.length;i+=2){
             dictionary.put(countries[i],countries[i=1]);
         }
        ArrayAdapter countryAdapter =new ArrayAdapter<>(
             this,
            android.R.layout.simple_list_item_1,
            new ArrayList<String>(dictionary.keySet())
        );
    listcountries.setAdapter(countryAdapter);

    }
}

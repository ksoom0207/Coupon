package com.example.administrator.coupon;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.graphics.drawable.Drawable;


public class Coupon_main extends AppCompatActivity {
    private String[] Store_List = {"커피에 반하다", "암브로시안", "Dcup","이성근카피"};
    private TextView selected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_main);
        //selected = (TextView) findViewById(R.id.)
//        ListView list = (ListView) findViewById(R.id.list);
        //list.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Store_List));
        //list.setOnItemClickListener(this);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Store_List) ;
        ListView listview = (ListView) findViewById(R.id.list) ;

        final View header = getLayoutInflater().inflate(R.layout.header, null, false);

        listview.addHeaderView(header);

        listview.setAdapter(adapter) ;

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {

                String strText = (String) parent.getItemAtPosition(position);

            }

        });






    }
}

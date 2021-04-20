package com.myapplicationdev.android.problemstatement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivityw extends AppCompatActivity {
        ListView lv;
        TextView tvhol;
        ArrayList<Holiday> al;
        HolidayAdapter aa;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            lv = (ListView) this.findViewById(R.id.lvhol);
            tvhol = (TextView) findViewById(R.id.tvhol);

            Intent intent = getIntent();
            String message = intent.getStringExtra("holiday");
            tvhol.setText(message);

            al = new ArrayList<Holiday>();
            al.add(new Holiday("New Year", false));
            al.add(new Holiday("Labor Day",true));
            aa = new HolidayAdapter(this, R.layout.row, al);
            lv.setAdapter(aa);
        }
}


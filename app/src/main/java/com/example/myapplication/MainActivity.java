package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Hello create");
        TestDev();
    }

    public void TestDev(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Dev分支");
    }
}

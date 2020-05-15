package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Hello 我是陳姿羽");
        //TestMaster();
        //TestDev();
    }
    public void TestMaster(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Master分支");
    }


    public void TestDev(){
        TextView txv = (TextView) findViewById(R.id.txv);
        txv.setText("Dev分支");
    }
}

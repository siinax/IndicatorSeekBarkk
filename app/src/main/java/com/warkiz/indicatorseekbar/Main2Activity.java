package com.warkiz.indicatorseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.warkiz.widget.IndicatorSeekBar;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        IndicatorSeekBar seekBarWithTickText = findViewById(R.id.custom_indicator_by_java);
        //seekBarWithTickText.setIndicatorTextFormat("${TICK_TEXT} --");
        //seekBarWithTickText.setProgress(86);
        seekBarWithTickText.setIndicatorTextFormat("已经推广${PROGRESS}人");
//        seekBarWithTickText.setIndicatorTextFormat("已经推广86人");
//        IndicatorSeekBar fiveSeekbar = findViewById(R.id.five_seekbar);
    }
}
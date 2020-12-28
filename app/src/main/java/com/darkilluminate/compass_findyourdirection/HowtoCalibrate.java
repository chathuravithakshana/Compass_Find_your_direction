package com.darkilluminate.compass_findyourdirection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class HowtoCalibrate extends AppCompatActivity {

    //Calibrate textview
    private TextView txtCalibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_calibrate);

        //scrollable textview
        txtCalibrate = (TextView) findViewById(R.id.txt_calibrate);
        txtCalibrate.setMovementMethod(new ScrollingMovementMethod());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            txtCalibrate.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }
    }
}
package com.example.android.awesomeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Nahid on 04-Sep-15.
 */
public class Mandark extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mandark);

        ImageView img = (ImageView) findViewById(R.id.mandark);
    }
}
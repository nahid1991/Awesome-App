package com.example.android.awesomeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Nahid on 04-Sep-15.
 */
public class Dexter extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dexter);

        ImageView img = (ImageView) findViewById(R.id.dexter);
    }
}

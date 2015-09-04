package com.example.android.awesomeapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nahid on 04-Sep-15.
 */
public class CardViewActivity extends Activity {
    TextView personName;
    TextView personAge;
    ImageView personPhoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_activity);

        personName = (TextView) findViewById(R.id.person_name);
        personAge = (TextView) findViewById(R.id.person_age);
        personPhoto = (ImageView) findViewById(R.id.person_photo);

        personName.setText("Dexter");
        personAge.setText("10 years old");
        personPhoto.setImageResource(R.drawable.dexter);
    }
}

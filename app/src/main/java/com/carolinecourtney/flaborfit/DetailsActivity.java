package com.carolinecourtney.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView exerciseTitle = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exersizeImage = (ImageView)findViewById(R.id.exerciseImage);
    }
}

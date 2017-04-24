package com.carolinecourtney.flaborfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
//        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
//        System.out.println(sharedPref);

        TextView exerciseText = (TextView)findViewById(R.id.exerciseTitle);
        ImageView exersizeImage = (ImageView)findViewById(R.id.exerciseImage);
        LinearLayout mainBG = (LinearLayout)findViewById(R.id.mainBG);

        String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);
        exerciseText.setText(exerciseTitle);

        if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)) {
            exersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.weight));
            mainBG.setBackgroundColor(Color.parseColor("#2ca5f5"));
        } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
            exersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.lotus));
            mainBG.setBackgroundColor(Color.parseColor("#916bcd"));
        } else {
            exersizeImage.setImageDrawable(getResources().getDrawable(R.drawable.heart));
            mainBG.setBackgroundColor(Color.parseColor("#52ad56"));
        }
    }
}

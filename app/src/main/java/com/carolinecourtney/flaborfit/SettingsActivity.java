package com.carolinecourtney.flaborfit;

import android.support.v7.app.AppCompatActivity;
import android.preference.PreferenceActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CheckBox;

public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
//        setContentView(R.layout.activity_settings);
//
//        CheckBox nightModeBox = (CheckBox) findViewById(R.id.nightModeBox);
//
//        nightModeBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                //store isChecked to Preferences
//                System.out.println("checked: " + isChecked + "!");
////                SharedPreferences settings = getSharedPreferences(PREFS,0);
////                System.out.println(settings);
////                SharedPreferences.Editor editor = settings.edit();
////                editor.putBoolean("isChecked", false);
////                System.out.println(settings);
//
//                //PreferenceManager.getDefaultSharedPreferences(PopUpInfoActivity.this).edit().putBoolean("value", isChecked).apply();
//            }
//        });

    }
}

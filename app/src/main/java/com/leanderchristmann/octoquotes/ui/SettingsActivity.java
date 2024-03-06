package com.leanderchristmann.octoquotes.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.leanderchristmann.octoquotes.R;

public class SettingsActivity extends AppCompatActivity {
    //declare all layout elements globally needed
    private RadioButton lightThemeRadioButton, copyWithoutAuthorRadioButton, noShuffleRadioButton;

    //immutable sharedPreferences keys declaractions
    private static final String DARK_MODE_KEY = "darkMode";
    private static final String COPY_SETTINGS_KEY = "copySettings";
    private static final String SHUFFLE_SETTINGS_KEY = "shuffle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getting SharedPreferencesConnection, MODE_PRIVATE so no other Apps can access this apps SharedPreferences
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean(DARK_MODE_KEY, true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is system default (nightmode is only my app default!)
        setContentView(R.layout.activity_settings);

        //initizializing RadioGroups and RadioButtons | structure: 1 Radio Group - 2 Radio Buttons - 1 Radio Group - 2 Buttons - ...
        RadioGroup themeRadioGroup = findViewById(R.id.themeRadioGroup);
        RadioButton darkThemeRadioButton = findViewById(R.id.darkThemeRadioButton);
        lightThemeRadioButton = findViewById(R.id.lightThemeRadioButton);
        RadioGroup copyRadioGroup = findViewById(R.id.copyRadioGroup);
        copyWithoutAuthorRadioButton = findViewById( R.id.copyWithoutAuthorRadioButton);
        RadioButton copyWithAuthorRadioButton = findViewById(R.id.copyWithAuthorRadioButton);
        RadioGroup shuffleRadioGroup = findViewById(R.id.shuffleRadioGroup);
        noShuffleRadioButton = findViewById(R.id.noShuffleRadioButton);
        RadioButton yesShuffleRadioButton =findViewById(R.id.yesShuffleRadioButton);

        //START setting the radio buttons checked, respectively unchecked, according to SharedPreferences Settings
        if (sharedPreferences.getBoolean(DARK_MODE_KEY, true)) {
            lightThemeRadioButton.setChecked(false);
            darkThemeRadioButton.setChecked(true);
        } else {
            lightThemeRadioButton.setChecked(true);
            darkThemeRadioButton.setChecked(false);
        }
        if (sharedPreferences.getString(COPY_SETTINGS_KEY, "withoutAuthor").equals("withoutAuthor")) {
            copyWithoutAuthorRadioButton.setChecked(true);
            copyWithAuthorRadioButton.setChecked(false);
        } else {
            copyWithoutAuthorRadioButton.setChecked(false);
            copyWithAuthorRadioButton.setChecked(true);
        }
        if (!sharedPreferences.getBoolean(SHUFFLE_SETTINGS_KEY, false)) {
            noShuffleRadioButton.setChecked(true);
            yesShuffleRadioButton.setChecked(false);
        } else {
            noShuffleRadioButton.setChecked(false);
            yesShuffleRadioButton.setChecked(true);
        }
        //END setting the radio buttons checked, respectively unchecked, according to SharedPreferences Settings

        //create sharedpreferences editor, bcs in next paragraph we're editing sharedPreferences all the time when a different radioButton gets checked
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        //START onCheckedChangeListeners for both RadioGroups
        themeRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedRadioButton = findViewById(checkedId);
                if (checkedRadioButton == lightThemeRadioButton){
                    editor.putBoolean(DARK_MODE_KEY, false).apply();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    editor.putBoolean(DARK_MODE_KEY, true).apply();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }
            }
        });
        copyRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedRadioButton = findViewById(checkedId);
                if (checkedRadioButton == copyWithoutAuthorRadioButton){
                    editor.putString(COPY_SETTINGS_KEY, "withoutAuthor").apply();
                } else {
                    editor.putString(COPY_SETTINGS_KEY, "withAuthor").apply();
                }
            }
        });
        shuffleRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton checkedRadioButton = findViewById(checkedId);
                if (checkedRadioButton == noShuffleRadioButton){
                    editor.putBoolean(SHUFFLE_SETTINGS_KEY, false).apply();
                } else {
                    editor.putBoolean(SHUFFLE_SETTINGS_KEY, true).apply();
                }
            }
        });
        //END onCheckedChangeListeners for both RadioGroups
    }

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickSettings(View view) {
        finish();
    }
}

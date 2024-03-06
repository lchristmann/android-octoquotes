package com.leanderchristmann.octoquotes.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.leanderchristmann.octoquotes.R;
import com.leanderchristmann.octoquotes.adapters.CategoryAdapter;
import com.leanderchristmann.octoquotes.data.Attitude;
import com.leanderchristmann.octoquotes.data.Coding;
import com.leanderchristmann.octoquotes.data.Faith;
import com.leanderchristmann.octoquotes.data.Happiness;
import com.leanderchristmann.octoquotes.data.Humor;
import com.leanderchristmann.octoquotes.data.Inspiration;
import com.leanderchristmann.octoquotes.data.Love;
import com.leanderchristmann.octoquotes.data.Motivation;
import com.leanderchristmann.octoquotes.data.Nature;
import com.leanderchristmann.octoquotes.data.Purpose;
import com.leanderchristmann.octoquotes.data.Short;
import com.leanderchristmann.octoquotes.data.Sports;
import com.leanderchristmann.octoquotes.data.Success;
import com.leanderchristmann.octoquotes.data.Time;
import com.leanderchristmann.octoquotes.data.Wisdom;

public class CategoryActivity extends AppCompatActivity implements CategoryAdapter.OnQuoteClickListener{

    //CategoryActivity USES CustomAdapter2 USING custom_layout_2 TO FILL the RecyclerView
    private CategoryAdapter categoryAdapter;
    //boolean darkmode to pass on to CustomAdapter2, so he doesnt have to make a SharedPreferences connection himself (here it has to be declared and initialized anyways)
    private boolean darkMode = true;

    private String categoryName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize globally declared sharedPreferences object
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            darkMode = false;
        }
        setContentView(R.layout.activity_category);

        //declare and initialize layout elements
        RecyclerView quotesRecyclerView = findViewById(R.id.quotesRecyclerView);
        TextView variableCategoryTextView = findViewById(R.id.variableCategoryTextView);
        ImageView variableCategoryIconImageView = findViewById(R.id.variableCategoryIconImageView);

        //get the category chosen in MainActivity and already set TitleTextView(variableCategoryTextView) accordingly
        Intent intent = getIntent();
        categoryName = intent.getStringExtra("categoryName");
        variableCategoryTextView.setText(categoryName);

        //set Icon according to categoryName and give CustomAdapter2 the right listIndex TO FILL the ListView
        switch(categoryName){
            case "Attitude":
                variableCategoryIconImageView.setImageResource(R.drawable.x01_attitude_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Attitude.getAttitudeList() , darkMode, this);
                break;
            case "Happiness":
                variableCategoryIconImageView.setImageResource(R.drawable.x02_happiness_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Happiness.getHappinessList() , darkMode, this);
                break;
            case "Humor":
                variableCategoryIconImageView.setImageResource(R.drawable.x03_humor_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Humor.getHumorList() , darkMode, this);
                break;
            case "Inspiration":
                variableCategoryIconImageView.setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Inspiration.getInspirationList() , darkMode, this);
                break;
            case "Love":
                variableCategoryIconImageView.setImageResource(R.drawable.x05_love_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Love.getLoveList() , darkMode,this);
                break;
            case "Motivation":
                variableCategoryIconImageView.setImageResource(R.drawable.x06_motivation_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Motivation.getMotivationList() ,darkMode, this);
                break;
            case "Purpose":
                variableCategoryIconImageView.setImageResource(R.drawable.x07_purpose_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Purpose.getPurposeList() , darkMode, this);
                break;
            case "Success":
                variableCategoryIconImageView.setImageResource(R.drawable.x08_success_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Success.getSuccessList() , darkMode, this);
                break;
            case "Time":
                variableCategoryIconImageView.setImageResource(R.drawable.x09_time_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Time.getTimeList() , darkMode, this);
                break;
            case "Wisdom":
                variableCategoryIconImageView.setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Wisdom.getWisdomList() , darkMode, this);
                break;
            case "Sports":
                variableCategoryIconImageView.setImageResource(R.drawable.x12_sports_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Sports.getSportsList() , darkMode, this);
                break;
            case "Nature":
                variableCategoryIconImageView.setImageResource(R.drawable.x17_nature_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Nature.getNatureList(), darkMode, this);
                break;
            case "Coding":
                variableCategoryIconImageView.setImageResource(R.drawable.x13_coding_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Coding.getCodingList() , darkMode, this);
                break;
            case "Short":
                variableCategoryIconImageView.setImageResource(R.drawable.x14_short_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Short.getShortList() , darkMode, this);
                break;
            case "Faith":
                variableCategoryIconImageView.setImageResource(R.drawable.x15_cross_snow_no_circle);
                categoryAdapter = new CategoryAdapter(Faith.getFaithList(), darkMode, this);
                break;
        }

        //set the customAdapter2 which has just been intitialized and constructed in switch above
        //create a layoutManager (which is needed for RecyclerView!)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(CategoryActivity.this);
        //dividerItemDecoration makes the dividers!
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(quotesRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        quotesRecyclerView.addItemDecoration(dividerItemDecoration);
        //set the layout Manager onto the RecyclerView and set the Adapter
        quotesRecyclerView.setLayoutManager(layoutManager);
        quotesRecyclerView.setAdapter(categoryAdapter);
    }

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickCategory(View view) {
        finish();
    }

    //the onClickMethod for each list item
    @Override
    public void onQuoteClick(int position) {
        Intent intent = new Intent(this, QuoteActivity.class);
        intent.putExtra("categoryName", categoryName);
        intent.putExtra("quotePosition", position);
        startActivity(intent);
    }
}

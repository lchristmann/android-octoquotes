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
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.leanderchristmann.octoquotes.R;
import com.leanderchristmann.octoquotes.adapters.MainAdapter;
import com.leanderchristmann.octoquotes.data.CommonData;

//MainActivity USES CustomAdapter USING custom_layout TO FILL the RecyclerListView
public class MainActivity extends AppCompatActivity implements MainAdapter.OnCategoryClickListener{

    //define constants
    private static final String DARK_MODE_KEY = "darkMode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //look into SharedPreferences to see if user has light or dark theme set & set theme accordingly
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //if theme has never been set (i.e. darkMode boolean doesn't exist in sharedPrefs yet), set darkMode, true (RESULT == darkMode is default in the beginning)
        if (!sharedPreferences.contains(DARK_MODE_KEY))
            sharedPreferences.edit().putBoolean(DARK_MODE_KEY, true).apply();
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean(DARK_MODE_KEY, true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_main);

        RecyclerView categoryRecyclerView = findViewById(R.id.categoryRecyclerView);

        //remaining theme changes are: icons! -> 7 lines below: giving CustomAdapter list based on darkMode boolean

        //IF shuffle on app start is set true in SharedPreferences: {shuffle quotes in onCreate method of MainActivity(=here) (which means on AppStart)}
        if(sharedPreferences.getBoolean("shuffle", false))
            CommonData.shuffleAll();

        //GIVE the three lists needed to fill the above initialized ListView TO customAdapter (who uses custom_layout) and SET him on the ListView
        MainAdapter mainAdapter;
        if(sharedPreferences.getBoolean(DARK_MODE_KEY, true))
            mainAdapter = new MainAdapter(CommonData.categoryIconsSnow, CommonData.categoryNames, CommonData.categorySizes, this);
        else
            mainAdapter = new MainAdapter(CommonData.categoryIconsJet, CommonData.categoryNames, CommonData.categorySizes, this);
        //create a layoutManager (which is needed for RecyclerView!)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        //dividerItemDecoration makes the dividers!
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(categoryRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        categoryRecyclerView.addItemDecoration(dividerItemDecoration);
        //set the layout Manager onto the RecyclerView and set the Adapter
        categoryRecyclerView.setLayoutManager(layoutManager);
        categoryRecyclerView.setAdapter(mainAdapter);
    }

    //direct user to FavoritesActivity
    public void onFavoritesButtonClick(View view) {
        Intent intent = new Intent(MainActivity.this.getApplicationContext(), FavoritesActivity.class);
        startActivity(intent);
    }

    //onClick method for menu button up right, inflates R.menu.main_menu
    public void showPopupMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, popup.getMenu());
        popup.show();

        //set OnItemClickListener for menu and direct user to selected Activity
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.suggestion:
                        Intent intent1 = new Intent(MainActivity.this, SuggestionActivity.class);
                        MainActivity.this.startActivity(intent1);
                        return true;
                    case R.id.feedback:
                        Intent intent2 = new Intent(MainActivity.this, FeedbackActivity.class);
                        MainActivity.this.startActivity(intent2);
                        return true;
                    case R.id.settings:
                        Intent intent3 = new Intent(MainActivity.this, SettingsActivity.class);
                        MainActivity.this.startActivity(intent3);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    //the on click method for each list item
    @Override
    public void onCategoryClick(int position) {
        if (position < 15) {
            //direct user to CategoryActivity; Intent uses StringExtra "categoryName" to tell CategoryActivity which QuoteList to show
            Intent intent = new Intent(MainActivity.this.getApplicationContext(), CategoryActivity.class);
            intent.putExtra("categoryName", CommonData.categoryNames[position]);
            startActivity(intent);

            //if position 14 clicked, randomly pick category and quote and go to QuoteActivity immediately
        } else if (position == 15) {
            //numberOfAvailableCategories to pass on to RandomQuoteActivity | -1 is needed to neutralize "Random" and "Search" category (containing no own quotes)
            int numberOfAvailableCategories = CommonData.categoryNames.length - 2;

            //direct user to RandomQuoteActivity | pass on intent: number of categories
            Intent intent = new Intent(MainActivity.this.getApplicationContext(), RandomQuoteActivity.class);
            intent.putExtra("numberOfAvailableCategories", numberOfAvailableCategories);
            startActivity(intent);
        } else if (position == 16) {
            //direct user to SearchActivity
            Intent intent = new Intent(MainActivity.this.getApplicationContext(), SearchActivity.class);
            startActivity(intent);
        }
    }
}
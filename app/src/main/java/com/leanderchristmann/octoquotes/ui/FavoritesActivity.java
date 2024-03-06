package com.leanderchristmann.octoquotes.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.leanderchristmann.octoquotes.R;
import com.leanderchristmann.octoquotes.adapters.FavoritesAdapter;
import com.leanderchristmann.octoquotes.util.FavoritesItemTouchHelper;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FavoritesActivity extends AppCompatActivity implements FavoritesAdapter.OnFavoriteClickListener {

    //globally declared sharedPreferences, needed everywhere here, because FavoritesList stored in SharedPreferences (and theme Settings!)
    private SharedPreferences sharedPreferences;

    //boolean darkmode to pass on to CustomAdapter3, so he doesnt have to make a SharedPreferences connection himself (here it has to be declared and initialized anyways)
    private boolean darkMode = true;

    //ui components
    private RecyclerView favoritesRecyclerView;

    //vars
    private ArrayList<String> favoriteQuotes;
    private ArrayList<String> favoriteCategories;
    private FavoritesAdapter favoritesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make SharedPreferences connection
        sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true)){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            darkMode = false;
        }
        setContentView(R.layout.activity_favorites);

        favoritesRecyclerView = findViewById(R.id.favoritesRecyclerView);

        initOrUpdateLists();
        initRecyclerView();
    }

    //handle activity state changes: developer.android.com/guide/components/activities/state-changes
    @Override
    protected void onResume() {
        super.onResume();
        initOrUpdateLists();
    }

    private void initRecyclerView(){
        //create a layoutManager (which is needed for RecyclerView!)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(FavoritesActivity.this);
        favoritesRecyclerView.setLayoutManager(layoutManager);
        //dividerItemDecoration makes the dividers!
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(favoritesRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        favoritesRecyclerView.addItemDecoration(dividerItemDecoration);

        favoritesAdapter = new FavoritesAdapter(FavoritesActivity.this, favoriteQuotes, favoriteCategories, darkMode, this);

        //the itemTouchHelper (swipeDeleting, highlighting, moving items)
        ItemTouchHelper.Callback callback = new FavoritesItemTouchHelper(favoritesAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        favoritesAdapter.setItemTouchHelper(itemTouchHelper);
        itemTouchHelper.attachToRecyclerView(favoritesRecyclerView);

        favoritesRecyclerView.setAdapter(favoritesAdapter);
    }

    //extracted code out of onCreate method, so the list can be filled onCreate and onResume ->update functionality achieved
    private void initOrUpdateLists(){
        Gson gson = new Gson();
        //get Strings for ArrayLists out of SharedPreferencfes (READ)
        // if not exists, no big deal, because "Gson by default generates optimized Json content ignoring the NULL values", but have to take care in CustomAdapter3!
        String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", null);
        String jsonGetFavoriteCategories = sharedPreferences.getString("favoriteCategories", null);
        //convert them to ArrayList form (TRANSLATE)
        Type type = new TypeToken<List<String>>(){}.getType();
        favoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
        favoriteCategories = gson.fromJson(jsonGetFavoriteCategories, type);
    }

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickFavorites(View view) {
        finish();
    }

    //onClick method for each favorites recycler list item
    @Override
    public void onFavoriteClick(int position) {
        Intent intent = new Intent(getApplicationContext(), FavoritesQuoteActivity.class);
        intent.putExtra("quotePosition", position);
        startActivity(intent);
    }
}
//SharedPreferences has 1.42MB storage, the whole bible takes up 5MB. so its huge.
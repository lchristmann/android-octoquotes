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
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.leanderchristmann.octoquotes.R;
import com.leanderchristmann.octoquotes.adapters.SearchAdapter;
import com.leanderchristmann.octoquotes.data.SearchAlgorithm;

public class SearchActivity extends AppCompatActivity implements SearchAdapter.OnSearchedClickListener{

    private EditText searchEditText;

    //matchesArray needed globally
    private String[][] matchesArray;

    //define constants
    private static final String DARK_MODE_KEY = "darkMode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //look into SharedPreferences to see if user has light or dark theme set & set theme accordingly
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean(DARK_MODE_KEY, true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_search);

        //initialize layout elements
        ImageButton searchImageButton = findViewById(R.id.searchImageButton);
        searchEditText = findViewById(R.id.searchEditText);

        //do remaining needed changes for the set theme if needed (if its light mode!)
        if (!sharedPreferences.getBoolean(DARK_MODE_KEY, true)) {
            searchImageButton.setImageResource(R.drawable.x16_search_jet_no_circle);
        }
    }

    public void onSearchImageButtonClick(View view) {

        //hide keyboard
        View viewThatHasFocus = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            if (imm != null) {
                if (viewThatHasFocus != null) {
                    imm.hideSoftInputFromWindow(viewThatHasFocus.getWindowToken(), 0);
                }
            }
        }

        //get editText content in String form | clear editText
        String inputFromEditText = searchEditText.getText().toString();
        searchEditText.setText("", TextView.BufferType.EDITABLE);

        //if searchEditText is empty, just exit method with empty return statement
        if (inputFromEditText.isEmpty()) {
            return;
        }

        //make string lowercase (taglists are lowerCase as well ->whole search is case insensitive)
        String lowerCaseInput = inputFromEditText.toLowerCase();

        //delete all special signs (replace with "") | note that ' stays in! | DONT REMOVE \\ from }!! | regex syntax: www.vogella.com/tutorials/JavaRegularExpressions/article.html
        String toDelete = ",+|-+|\\++|\"+|\\.+|;+|:+|\\?+|!+|\\$+|&+|\\(+|\\)+|\\[+|]+|@+|_+|\\*+|=+|#+|/+|\\{+|\\}+|€+|§+";
        String inputWithoutSpecialSigns = lowerCaseInput.replaceAll(toDelete, "");

        //split the String at the spaces
        String[] searchArray = inputWithoutSpecialSigns.split("\\s+");

        //number of matching quotes: QuotesLists searchNumberOfMatches method | make Toast showing user number of results -> load them
        int countedMatches = SearchAlgorithm.searchNumberOfMatches(searchArray);
        Toast.makeText(this, countedMatches + " matches found!", Toast.LENGTH_SHORT).show();

        //put array with quotes + author for listView together
        matchesArray = SearchAlgorithm.getMatchesArray(searchArray, countedMatches);

        RecyclerView searchedRecyclerView = findViewById(R.id.searchedRecyclerView);
        SearchAdapter searchAdapter = new SearchAdapter(matchesArray[0], matchesArray[1], this);
        //create a layoutManager (which is needed for RecyclerView!)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SearchActivity.this);
        //dividerItemDecoration makes the dividers!
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(searchedRecyclerView.getContext(), DividerItemDecoration.VERTICAL);
        searchedRecyclerView.addItemDecoration(dividerItemDecoration);
        //set the layout Manager onto the RecyclerView and set the Adapter
        searchedRecyclerView.setLayoutManager(layoutManager);
        searchedRecyclerView.setAdapter(searchAdapter);
    }

    public void onUpButtonClickSearch(View view) {
        finish();
    }

    @Override
    public void onSearchedClick(int position) {
        Intent intent = new Intent(this, SearchQuoteActivity.class);
        intent.putExtra("clickedPosition", position);
        intent.putExtra("categoryNamesArray", matchesArray[2]);
        intent.putExtra("quotePositionsArray", matchesArray[3]);
        startActivity(intent);
    }
}

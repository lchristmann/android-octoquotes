package com.leanderchristmann.octoquotes.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.leanderchristmann.octoquotes.R;
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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//QuoteActivity implements GestureDetector.OnGestureListener -> gives onFling method for swiping, amongst others
public class QuoteActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    //declare quoteTextView and addToFavoritesButton (quoteTextView set for each new quote; addToFavoritesButton has to change if quote is in Favorites)
    private TextView quoteTextView, authorTextView;
    private ImageButton addToFavoritesButton;

    //declare all variables needed globally | currentCategoryListSize needed for swiping, so we dont get out of array bounds with index on swipe
    private int quotePosition, currentCategoryListSize;
    private String quoteText, authorName, categoryName;

    //globally declared sharedPreferences, bcs needed in onCreate for setting the theme and onAddToFavoritesButtonClick
    private SharedPreferences sharedPreferences;

    //variable to prevent toast accumulation
    private Toast showingToast = null;

    //declarations for swipe functionality
    private static final int SWIPE_TRESHOLD = 100, SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize globally declared sharedPreferences object
        sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_quote);

        //intitialize TextView, ImageView and ImageButtons (needed layout elements)
        quoteTextView = findViewById(R.id.quoteText);
        authorTextView = findViewById(R.id.authorText);
        ImageView categoryIconImageView = findViewById(R.id.categoryIconImageView);
        addToFavoritesButton = findViewById(R.id.addToFavoritesButton);
        ImageButton randomNextQuoteButton =findViewById(R.id.randomNextQuoteButton);
        ImageButton copyQuoteButton = findViewById(R.id.copyQuoteButton);

        //do remaining needed changes for the set theme if needed (if its light mode!)
        if (!sharedPreferences.getBoolean("darkMode", true)){
            randomNextQuoteButton.setImageResource(R.drawable.x52_shuffle_jet);
            copyQuoteButton.setImageResource(R.drawable.x51_copy_jet);
        }

        //get intentExtras categoryName & quotePosition -> uniquely identifies quote
        Intent intent = getIntent();
        categoryName = intent.getStringExtra("categoryName");
        quotePosition = intent.getIntExtra("quotePosition", 0);

        //setQuoteTextView with this method
        setQuoteTextView(categoryName, quotePosition);

        //initialize the currentCategoryListSize variable depending on Category: needed for onSwipeRight() and onSwipeLeft() methods AND setCategoryIconImageView
        switch (categoryName) {
            case "Attitude":
                currentCategoryListSize = Attitude.getAttitudeListSize();
                categoryIconImageView.setImageResource(R.drawable.x01_attitude_snow_no_circle);
                break;
            case "Happiness":
                currentCategoryListSize = Happiness.getHappinessListSize();
                categoryIconImageView.setImageResource(R.drawable.x02_happiness_snow_no_circle);
                break;
            case "Humor":
                currentCategoryListSize = Humor.getHumorListSize();
                categoryIconImageView.setImageResource(R.drawable.x03_humor_snow_no_circle);
                break;
            case "Inspiration":
                currentCategoryListSize = Inspiration.getInspirationListSize();
                categoryIconImageView.setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                break;
            case "Love":
                currentCategoryListSize = Love.getLoveListSize();
                categoryIconImageView.setImageResource(R.drawable.x05_love_snow_no_circle);
                break;
            case "Motivation":
                currentCategoryListSize = Motivation.getMotivationListSize();
                categoryIconImageView.setImageResource(R.drawable.x06_motivation_snow_no_circle);
                break;
            case "Purpose":
                currentCategoryListSize = Purpose.getPurposeListSize();
                categoryIconImageView.setImageResource(R.drawable.x07_purpose_snow_no_circle);
                break;
            case "Success":
                currentCategoryListSize = Success.getSuccessListSize();
                categoryIconImageView.setImageResource(R.drawable.x08_success_snow_no_circle);
                break;
            case "Time":
                currentCategoryListSize = Time.getTimeListSize();
                categoryIconImageView.setImageResource(R.drawable.x09_time_snow_no_circle);
                break;
            case "Wisdom":
                currentCategoryListSize = Wisdom.getWisdomListSize();
                categoryIconImageView.setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                break;
            case "Sports":
                currentCategoryListSize = Sports.getSportsListSize();
                categoryIconImageView.setImageResource(R.drawable.x12_sports_snow_no_circle);
                break;
            case "Nature":
                currentCategoryListSize = Nature.getNatureListSize();
                categoryIconImageView.setImageResource(R.drawable.x17_nature_snow_no_circle);
                break;
            case "Coding":
                currentCategoryListSize = Coding.getCodingListSize();
                categoryIconImageView.setImageResource(R.drawable.x13_coding_snow_no_circle);
                break;
            case "Short":
                currentCategoryListSize = Short.getShortListSize();
                categoryIconImageView.setImageResource(R.drawable.x14_short_snow_no_circle);
                break;
            case "Faith":
                currentCategoryListSize = Faith.getFaithListSize();
                categoryIconImageView.setImageResource(R.drawable.x15_cross_snow_no_circle);
                break;
        }

        //initizalize gesture Detector for swiping
        gestureDetector = new GestureDetector(this, this);
    }

    //puts the text for the quoteTextView together (quote + " ~" + author) and sets the quotesTextView with that text
    public void setQuoteTextView(String categoryName, int quotePosition) {
        switch (categoryName) {
            case "Attitude":
                quoteText = Attitude.getAttitudeQuote(quotePosition);
                authorName = Attitude.getAttitudeAuthor(quotePosition);
                break;
            case "Happiness":
                quoteText = Happiness.getHappinessQuote(quotePosition);
                authorName = Happiness.getHappinessAuthor(quotePosition);
                break;
            case "Humor":
                quoteText = Humor.getHumorQuote(quotePosition);
                authorName = Humor.getHumorAuthor(quotePosition);
                break;
            case "Inspiration":
                quoteText = Inspiration.getInspirationQuote(quotePosition);
                authorName = Inspiration.getInspirationAuthor(quotePosition);
                break;
            case "Love":
                quoteText = Love.getLoveQuote(quotePosition);
                authorName = Love.getLoveAuthor(quotePosition);
                break;
            case "Motivation":
                quoteText = Motivation.getMotivationQuote(quotePosition);
                authorName = Motivation.getMotivationAuthor(quotePosition);
                break;
            case "Purpose":
                quoteText = Purpose.getPurposeQuote(quotePosition);
                authorName = Purpose.getPurposeAuthor(quotePosition);
                break;
            case "Success":
                quoteText = Success.getSuccessQuote(quotePosition);
                authorName = Success.getSuccessAuthor(quotePosition);
                break;
            case "Time":
                quoteText = Time.getTimeQuote(quotePosition);
                authorName = Time.getTimeAuthor(quotePosition);
                break;
            case "Wisdom":
                quoteText = Wisdom.getWisdomQuote(quotePosition);
                authorName = Wisdom.getWisdomAuthor(quotePosition);
                break;
            case "Sports":
                quoteText = Sports.getSportsQuote(quotePosition);
                authorName = Sports.getSportsAuthor(quotePosition);
                break;
            case "Nature":
                quoteText = Nature.getNatureQuote(quotePosition);
                authorName = Nature.getNatureAuthor(quotePosition);
                break;
            case "Coding":
                quoteText = Coding.getCodingQuote(quotePosition);
                authorName = Coding.getCodingAuthor(quotePosition);
                break;
            case "Short":
                quoteText = Short.getShortQuote(quotePosition);
                authorName = Short.getShortAuthor(quotePosition);
                break;
            case "Faith":
                quoteText = Faith.getFaithQuote(quotePosition);
                authorName = Faith.getFaithAuthor(quotePosition);
                break;
        }

        quoteTextView.setText(quoteText);
        String formattedAuthor = "~ " + authorName;
        authorTextView.setText(formattedAuthor);

        //START set bookmarkIcon up right (FILLED = saved in Favorites or NOT FILLED = not saved in Favorites)
        //if the favoriteQuotesList (technically a String) exists in SharedPreferences...
        if(sharedPreferences.contains("favoriteQuotes")) {
            Gson gson = new Gson();
            //...get String for the ArrayList out of SharedPreferences (READ)
            String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", "");
            //convert the String to ArrayList form (TRANSLATE)
            Type type = new TypeToken<List<String>>(){}.getType();
            ArrayList<String> favoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
            //if the actual quote (checked on quoteText) is already in the SharedPreferences favoritesList, show the filled bookmark icon
            if(favoriteQuotes.contains(quoteText)){
                addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
            } else {
                addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
            }
        } else {
            addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
        }
        //END set bookmarkIcon up right
    }

    //method to make the gestureDetector notice touchEvents
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //START not used methods (from GestureDetector.OnGestureListener Interface)
    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }
    //END not used methods (from GestureDetector.OnGestureListener Interface)

    //the method to handle the swiping (from GestureDetector.OnGestureListener Interface). tutorial: www.youtube.com/watch?v=32rSs4tE-mc&t=616s&ab_channel=BrandanJones
    @Override
    public boolean onFling(MotionEvent downEvent, MotionEvent moveEvent, float velocityX, float velocityY) {
        boolean result = false;
        //calculate measures of move in X and Y dimension
        float diffX = moveEvent.getX() - downEvent.getX();
        float diffY = moveEvent.getY() - downEvent.getY();
        //which was greater? movement across X or Y? if X -> more of a horizontal motion; else (Y is greater) -> more of a vertical mortion
        if (Math.abs(diffX) > Math.abs(diffY)) {
            //check if SWIPE_THRESHOLD and SWIPE_VELOCITY_THRESHOLD crossed on X-dimension (=valid horizontal swipe detected)
            if (Math.abs(diffX) > SWIPE_TRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                if (diffX > 0) {
                    //left to right swipe
                    onSwipeRight();
                } else {
                    //right to left swipe
                    onSwipeLeft();
                }
                result = true;
            }
        } else {
            //check if SWIPE_THRESHOLD and SWIPE_VELOCITY_THRESHOLD crossed on Y-dimension (=valid vertical swipe detected)
            if (Math.abs(diffY) > SWIPE_TRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                if (diffY > 0) {
                    //top to bottom swipe
                    onSwipeBottom();
                } else {
                    //bottom to top swipe
                    onSwipeTop();
                }
                result = true;
            }
        }
        return result;
    }

    //swiping up or down exits the quote activity
    private void onSwipeTop() {
        finish();
    }

    private void onSwipeBottom() {
        finish();
    }

    //handles the left to right swipe: decrease quotePosition if > position 0; (else) if position == 0 go to the highest listElement (index: list.length - 1)
    private void onSwipeRight() {
        if(quotePosition > 0) {
            quotePosition--;
        } else {
            quotePosition = currentCategoryListSize - 1;
        }
        setQuoteTextView(categoryName, quotePosition);
    }

    //handles the right to left swipe: increase quotePosition if < highestIndex; (else) if its the highestIndex (list.length-1) already, go to lowest listElement (index = 0)
    private void onSwipeLeft() {
        if(quotePosition < currentCategoryListSize - 1) {
            quotePosition++;
        } else {
            quotePosition = 0;
        }
        setQuoteTextView(categoryName, quotePosition);
    }

    //generates random index and setsText with the quote & author at that index
    public void onRandomNextQuoteButtonClick(View view) {
        //random generator with an upperlimit of the total ArrayList size. Random(upperlimit) delivers values in range of [0;upperlimit-1]
        Random randomGenerator = new Random();
        int randomPosition = randomGenerator.nextInt(currentCategoryListSize);
        //while randomPosition is the same position as the quote before, find new random quote [effect: randomButton always delivers new quote]
        while(randomPosition == quotePosition)
            randomPosition = randomGenerator.nextInt(currentCategoryListSize);
        //updates quotePosition to the randomly selected position
        quotePosition = randomPosition;
        setQuoteTextView(categoryName, randomPosition);
    }

    //add quote/author/category each in one ArrayList to Shared Preferences - guide: kelut.at/arraylist-mit-objekten-in-den-sharedpreferences-abspeichern/
    //note: don't worry about the length of the favorites list in SharedPreferences, max size of one String is 1.42MB. the whole bible is 5MB.
    public void onAddToFavoritesButtonClick(View view) {
        //create a SharedPreferences editor
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //create a Gson object to translate the lists from JSON Strings to ArrayLists
        Gson gson = new Gson();
        //if: if sharedPreferences doesnt contain favoriteQuotes list ~it has not been created yet, create it here and add the current quote/author/category
        if(!sharedPreferences.contains("favoriteQuotes")) {
            //create the new ArrayLists (CREATE)
            ArrayList<String> favoriteQuotes = new ArrayList<>();
            ArrayList<String> favoriteAuthors = new ArrayList<>();
            ArrayList<String> favoriteCategories = new ArrayList<>();
            //add quote/author/category (EDIT)
            favoriteQuotes.add(quoteText);
            favoriteAuthors.add(authorName);
            favoriteCategories.add(categoryName);
            //convert ArrayLists to JSON with Gson (TRANSLATE)
            String jsonFavoriteQuotes = gson.toJson(favoriteQuotes);
            String jsonFavoriteAuthors = gson.toJson(favoriteAuthors);
            String jsonFavoriteCategories = gson.toJson(favoriteCategories);
            //put the three lists into sharedPreferences (WRITE)
            editor.putString("favoriteQuotes", jsonFavoriteQuotes).apply();
            editor.putString("favoriteAuthors", jsonFavoriteAuthors).apply();
            editor.putString("favoriteCategories", jsonFavoriteCategories).apply();
            addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
            //else: if sharedPreferences contains favoriteQuotes lists, get them and make them readable ArrayLists (they are saved in sharedPrefs as JSON Strings)
        } else {
            //get Strings for ArrayLists out of SharedPreferences (READ)
            String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", "");
            String jsonGetFavoriteAuthors = sharedPreferences.getString("favoriteAuthors", "");
            String jsonGetFavoriteCategories = sharedPreferences.getString("favoriteCategories", "");
            //convert them to ArrayList form (TRANSLATE)
            Type type = new TypeToken<List<String>>(){}.getType();
            ArrayList<String> favoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
            ArrayList<String> favoriteAuthors = gson.fromJson(jsonGetFavoriteAuthors, type);
            ArrayList<String> favoriteCategories = gson.fromJson(jsonGetFavoriteCategories, type);

            //check if quote is already saved: if no, add it - if yes, remove it and set the bookMarkIcon to the notFilled icon
            if(!favoriteQuotes.contains(quoteText)) {
                //add the current quote/author/category (EDIT)
                favoriteQuotes.add(quoteText);
                favoriteAuthors.add(authorName);
                favoriteCategories.add(categoryName);
                //convert them back to JSON with Gson (TRANSLATE)
                String jsonPutFavoriteQuotes = gson.toJson(favoriteQuotes);
                String jsonPutFavoriteAuthors = gson.toJson(favoriteAuthors);
                String jsonPutFavoriteCategories = gson.toJson(favoriteCategories);
                //update (put back into SharedPreferences) (WRITE)
                editor.putString("favoriteQuotes", jsonPutFavoriteQuotes).apply();
                editor.putString("favoriteAuthors", jsonPutFavoriteAuthors).apply();
                editor.putString("favoriteCategories", jsonPutFavoriteCategories).apply();
                //set Filled bookMarkIcon (quote is in favorites now!)
                addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
            } else {
                //get the index of the quote in the favoritesLists in SharedPreferences
                int indexOfQuoteToRemove = favoriteQuotes.indexOf(quoteText);
                //remove the values at index in the 3 lists: quote/author/category (EDIT)
                favoriteQuotes.remove(indexOfQuoteToRemove);
                favoriteAuthors.remove(indexOfQuoteToRemove);
                favoriteCategories.remove(indexOfQuoteToRemove);
                //convert ArrayLists to JSON with Gson (TRANSLATE)
                String jsonFavoriteQuotes = gson.toJson(favoriteQuotes);
                String jsonFavoriteAuthors = gson.toJson(favoriteAuthors);
                String jsonFavoriteCategories = gson.toJson(favoriteCategories);
                //put the updated lists into sharedPreferences (WRITE/UPDATE)
                editor.putString("favoriteQuotes", jsonFavoriteQuotes).apply();
                editor.putString("favoriteAuthors", jsonFavoriteAuthors).apply();
                editor.putString("favoriteCategories", jsonFavoriteCategories).apply();
                //set notFilled bookMarkIcon (quote has been removed from favorites!)
                addToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
            }
        }
    }

    //make sharedPreferences connection, see how copySettings are set(with/without Author) -> put textToCopy together accordingly and copy it to Clipboard
    public void onCopyButtonClick(View view) {
        String textToCopy;
        String copySettings = sharedPreferences.getString("copySettings", "withoutAuthor");
        if(copySettings.equals("withoutAuthor")){
            textToCopy = quoteText;
        }else{
            textToCopy = quoteText + " ~" + authorName;
        }
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("OctoQuotes", textToCopy);
        if (clipboard != null) {
            clipboard.setPrimaryClip(clip);
            //this prevents toast accumulation
            if (showingToast != null) showingToast.cancel();
            showingToast = Toast.makeText(this, "copied!", Toast.LENGTH_SHORT);
            showingToast.show();
        }
    }

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickQuote(View view) {
        finish();
    }
}
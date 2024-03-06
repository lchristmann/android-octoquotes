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
public class RandomQuoteActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private TextView randomQuoteTextView, randomAuthorTextView;
    private ImageButton addRandomToFavoritesButton;
    private ImageView categoryIconRandomImageView;

    //variables needed for the Random functionality | find usages of variable with Str + Shift + F7 - go down with F3, up with Shift F3- remove highlighting with Esc
    private Random randomGenerator;
    private int numberOfAvailableCategories;
    private String categoryName, quoteText, authorName;

    //globally declared sharedPreferences, bcs needed in onCreate for setting the theme and onAddToFavoritesButtonClick
    private SharedPreferences sharedPreferences;

    //variable to prevent toast accumulation
    private Toast showingToast = null;

    //declarations for swipe functionality
    private static final int SWIPE_TRESHOLD = 100, SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;

    private static final String DARK_MODE_KEY = "darkMode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize globally declared sharedPreferences object
        sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean(DARK_MODE_KEY, true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_random_quote);

        //intitialize TextView, ImageView and ImageButtons
        randomQuoteTextView = findViewById(R.id.randomQuoteTextView);
        randomAuthorTextView = findViewById(R.id.randomAuthorTextView);
        ImageButton refreshQuoteButton = findViewById(R.id.refreshQuoteButton);
        ImageButton copyRandomQuoteButton = findViewById(R.id.copyRandomQuoteButton);
        addRandomToFavoritesButton = findViewById(R.id.addRandomToFavoritesButton);
        categoryIconRandomImageView = findViewById(R.id.categoryIconRandomImageView);

        //get intent and initialize variables
        randomGenerator = new Random();
        Intent intent = getIntent();
        numberOfAvailableCategories = intent.getIntExtra("numberOfAvailableCategories", 0);

        //do remaining needed changes for the set theme if needed (if its lightmode!)
        if (!sharedPreferences.getBoolean(DARK_MODE_KEY, true)){
            refreshQuoteButton.setImageResource(R.drawable.x56_arrow_right_jet);
            copyRandomQuoteButton.setImageResource(R.drawable.x51_copy_jet);
        }

        //first random quote onCreate
        setRandomQuoteWithIcon();

        //initizalize gesture Detector for swiping
        gestureDetector = new GestureDetector(this, this);
    }

    private void setRandomQuoteWithIcon() {
        int quotePosition, upperLimit;
        String joinedTextForTextView;
        int randomCategoryIndex = randomGenerator.nextInt(numberOfAvailableCategories);

        //depending on randomly selected category GET listSize TO USE as upperLimit for the randomNumbersGenerator -> get random index from that quoteList like that
        switch (randomCategoryIndex) {
            case 0:
                categoryName = "Attitude";
                upperLimit = Attitude.getAttitudeListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x01_attitude_snow_no_circle);
                quoteText = Attitude.getAttitudeQuote(quotePosition);
                authorName = Attitude.getAttitudeAuthor(quotePosition);
                break;
            case 1:
                categoryName = "Happiness";
                upperLimit = Happiness.getHappinessListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x02_happiness_snow_no_circle);
                quoteText = Happiness.getHappinessQuote(quotePosition);
                authorName = Happiness.getHappinessAuthor(quotePosition);
                break;
            case 2:
                categoryName = "Humor";
                upperLimit = Humor.getHumorListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x03_humor_snow_no_circle);
                quoteText = Humor.getHumorQuote(quotePosition);
                authorName = Humor.getHumorAuthor(quotePosition);
                break;
            case 3:
                categoryName = "Inspiration";
                upperLimit = Inspiration.getInspirationListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                quoteText = Inspiration.getInspirationQuote(quotePosition);
                authorName = Inspiration.getInspirationAuthor(quotePosition);
                break;
            case 4:
                categoryName = "Love";
                upperLimit = Love.getLoveListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x05_love_snow_no_circle);
                quoteText = Love.getLoveQuote(quotePosition);
                authorName = Love.getLoveAuthor(quotePosition);
                break;
            case 5:
                categoryName = "Motivation";
                upperLimit = Motivation.getMotivationListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x06_motivation_snow_no_circle);
                quoteText = Motivation.getMotivationQuote(quotePosition);
                authorName = Motivation.getMotivationAuthor(quotePosition);
                break;
            case 6:
                categoryName = "Purpose";
                upperLimit = Purpose.getPurposeListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x07_purpose_snow_no_circle);
                quoteText = Purpose.getPurposeQuote(quotePosition);
                authorName = Purpose.getPurposeAuthor(quotePosition);
                break;
            case 7:
                categoryName = "Success";
                upperLimit = Success.getSuccessListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x08_success_snow_no_circle);
                quoteText = Success.getSuccessQuote(quotePosition);
                authorName = Success.getSuccessAuthor(quotePosition);
                break;
            case 8:
                categoryName = "Time";
                upperLimit = Time.getTimeListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x09_time_snow_no_circle);
                quoteText = Time.getTimeQuote(quotePosition);
                authorName = Time.getTimeAuthor(quotePosition);
                break;
            case 9:
                categoryName = "Wisdom";
                upperLimit = Wisdom.getWisdomListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                quoteText = Wisdom.getWisdomQuote(quotePosition);
                authorName = Wisdom.getWisdomAuthor(quotePosition);
                break;
            case 10:
                categoryName = "Sports";
                upperLimit = Sports.getSportsListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x12_sports_snow_no_circle);
                quoteText = Sports.getSportsQuote(quotePosition);
                authorName = Sports.getSportsAuthor(quotePosition);
                break;
            case 11:
                categoryName = "Nature";
                upperLimit = Nature.getNatureListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x17_nature_snow_no_circle);
                quoteText = Nature.getNatureQuote(quotePosition);
                authorName = Nature.getNatureAuthor(quotePosition);
                break;
            case 12:
                categoryName = "Coding";
                upperLimit = Coding.getCodingListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x13_coding_snow_no_circle);
                quoteText = Coding.getCodingQuote(quotePosition);
                authorName = Coding.getCodingAuthor(quotePosition);
                break;
            case 13:
                categoryName = "Short";
                upperLimit = Short.getShortListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x14_short_snow_no_circle);
                quoteText = Short.getShortQuote(quotePosition);
                authorName = Short.getShortAuthor(quotePosition);
                break;
            case 14:
                categoryName = "Faith";
                upperLimit = Faith.getFaithListSize();
                quotePosition = randomGenerator.nextInt(upperLimit);
                categoryIconRandomImageView.setImageResource(R.drawable.x15_cross_snow_no_circle);
                quoteText = Faith.getFaithQuote(quotePosition);
                authorName = Faith.getFaithAuthor(quotePosition);
                break;

        }

        randomQuoteTextView.setText(quoteText);
        String formattedAuthor = "~ " + authorName;
        randomAuthorTextView.setText(formattedAuthor);

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
                addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
            } else {
                addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
            }
        } else {
            addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
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
        setRandomQuoteWithIcon();
    }

    //handles the right to left swipe: increase quotePosition if < highestIndex; (else) if its the highestIndex (list.length-1) already, go to lowest listElement (index = 0)
    private void onSwipeLeft() {
        setRandomQuoteWithIcon();
    }

    //add quote/author/category each in one ArrayList to Shared Preferences - guide: kelut.at/arraylist-mit-objekten-in-den-sharedpreferences-abspeichern/
    public void onAddRandomToFavoritesButtonClick(View view){
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
            addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
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
                addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow_filled);
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
                addRandomToFavoritesButton.setImageResource(R.drawable.x50_bookmark_snow);
            }
        }
    }

    public void onRefreshQuoteButtonClick(View view){
        setRandomQuoteWithIcon();
    }

    public void onCopyRandomButtonClick(View view){
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
            if (showingToast != null) showingToast.cancel();
            showingToast = Toast.makeText(this, "copied!", Toast.LENGTH_SHORT);
            showingToast.show();
        }
    }

    public void onUpButtonClickRandom(View view){
        finish();
    }
}

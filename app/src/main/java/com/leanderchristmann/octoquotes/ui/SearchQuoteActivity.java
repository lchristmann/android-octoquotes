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

//WATCH OUT: !"quotePosition" is the position in the SEARCH-RESULTS-LITS! | the position in quotesList is found inn positionsArray!!
public class SearchQuoteActivity extends AppCompatActivity  implements GestureDetector.OnGestureListener {

    //declare all variables needed globally
    private int quotePosition;
    private String[] categoryNamesArray;
    private int[] positionsArray;
    private String quoteText, authorName;

    //declare quoteTextView and addToFavoritesButton (quoteTextView set for each new quote; addToFavoritesButton has to change if quote is in Favorites)
    private TextView quoteTextView, authorTextView;
    private ImageView categoryIconImageView;
    private ImageButton addToFavoritesButton;

    //globally declared sharedPreferences, bcs needed in onCreate for setting the theme and onAddToFavoritesButtonClick
    private SharedPreferences sharedPreferences;

    //variable to prevent toast accumulation
    private Toast showingToast = null;

    //declarations for swipe functionality
    private static final int SWIPE_TRESHOLD = 100, SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;

    //NOTE: convert position array to int array | addToFavorites | swiping!! -> left and right need new setText | dont forget the check if quote is already in favorites! ->setIcon! seeQuoteAct
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize globally declared sharedPreferences object
        sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_search_quote);

        //initialize TextView, ImageView and ImageButtons(needed layout elements)
        quoteTextView = findViewById(R.id.searchQuoteTextView);
        authorTextView = findViewById(R.id.searchAuthorTextView);
        categoryIconImageView = findViewById(R.id.categoryIconImageViewSearch);
        addToFavoritesButton = findViewById(R.id.addSearchedToFavoritesButton);
        ImageButton copySearchQuoteButton = findViewById(R.id.copySearchQuoteButton);
        ImageButton randomNextSearchQuoteButton = findViewById(R.id.randomNextSearchQuoteButton);

        //do remaining needed changes for the set theme if needed (if its light mode!)
        if (!sharedPreferences.getBoolean("darkMode", true)){
            copySearchQuoteButton.setImageResource(R.drawable.x51_copy_jet);
            randomNextSearchQuoteButton.setImageResource(R.drawable.x52_shuffle_jet);
        }

        //get Intent, and save values in global private variables
        Intent intent = getIntent();
        quotePosition = intent.getIntExtra("clickedPosition", 0);
        categoryNamesArray = intent.getStringArrayExtra("categoryNamesArray");
        //need to convert the quotePositions from String array to int Array -> save int array to private global variable
        String[] quotePositionsStringArray = intent.getStringArrayExtra("quotePositionsArray");
        positionsArray = new int[quotePositionsStringArray.length];         //NPE warning can be ignored, since this list will never be null (user got here by clicking on lits item from parallel list!)
        for (int i = 0; i < quotePositionsStringArray.length; i++) {
            positionsArray[i] = Integer.parseInt(quotePositionsStringArray[i]);
        }

        setSearchQuoteTextViewAndIcon(quotePosition);

        //initizalize gesture Detector for swiping
        gestureDetector = new GestureDetector(this, this);
    }

    //puts the text for the quoteTextView together (quote + " ~" + author) and sets the quotesTextView with that text AND sets variableIconImageView AND sets bookMarkIcon accordingly
    public void setSearchQuoteTextViewAndIcon(int quotePosition) {
        switch(categoryNamesArray[quotePosition]){
            case "Attitude":
                quoteText = Attitude.getAttitudeQuote(positionsArray[quotePosition]);
                authorName = Attitude.getAttitudeAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x01_attitude_snow_no_circle);
                break;
            case "Happiness":
                quoteText = Happiness.getHappinessQuote(positionsArray[quotePosition]);
                authorName = Happiness.getHappinessAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x02_happiness_snow_no_circle);
                break;
            case "Humor":
                quoteText = Humor.getHumorQuote(positionsArray[quotePosition]);
                authorName = Humor.getHumorAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x03_humor_snow_no_circle);
                break;
            case "Inspiration":
                quoteText = Inspiration.getInspirationQuote(positionsArray[quotePosition]);
                authorName = Inspiration.getInspirationAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                break;
            case "Love":
                quoteText = Love.getLoveQuote(positionsArray[quotePosition]);
                authorName = Love.getLoveAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x05_love_snow_no_circle);
                break;
            case "Motivation":
                quoteText = Motivation.getMotivationQuote(positionsArray[quotePosition]);
                authorName = Motivation.getMotivationAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x06_motivation_snow_no_circle);
                break;
            case "Purpose":
                quoteText = Purpose.getPurposeQuote(positionsArray[quotePosition]);
                authorName = Purpose.getPurposeAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x07_purpose_snow_no_circle);
                break;
            case "Success":
                quoteText = Success.getSuccessQuote(positionsArray[quotePosition]);
                authorName = Success.getSuccessAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x08_success_snow_no_circle);
                break;
            case "Time":
                quoteText = Time.getTimeQuote(positionsArray[quotePosition]);
                authorName = Time.getTimeAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x09_time_snow_no_circle);
                break;
            case "Wisdom":
                quoteText = Wisdom.getWisdomQuote(positionsArray[quotePosition]);
                authorName = Wisdom.getWisdomAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                break;
            case "Sports":
                quoteText = Sports.getSportsQuote(positionsArray[quotePosition]);
                authorName = Sports.getSportsAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x12_sports_snow_no_circle);
                break;
            case "Nature":
                quoteText = Nature.getNatureQuote(positionsArray[quotePosition]);
                authorName = Nature.getNatureAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x17_nature_snow_no_circle);
                break;
            case "Coding":
                quoteText = Coding.getCodingQuote(positionsArray[quotePosition]);
                authorName = Coding.getCodingAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x13_coding_snow_no_circle);
                break;
            case "Short":
                quoteText = Short.getShortQuote(positionsArray[quotePosition]);
                authorName = Short.getShortAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x14_short_snow_no_circle);
                break;
            case "Faith":
                quoteText = Faith.getFaithQuote(positionsArray[quotePosition]);
                authorName = Faith.getFaithAuthor(positionsArray[quotePosition]);
                categoryIconImageView.setImageResource(R.drawable.x15_cross_snow_no_circle);
                break;
            default:
                quoteText = "";
                authorName = "";
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
            quotePosition = positionsArray.length - 1;
        }
        setSearchQuoteTextViewAndIcon(quotePosition);
    }

    //handles the right to left swipe: increase quotePosition if < highestIndex; (else) if its the highestIndex (list.length-1) already, go to lowest listElement (index = 0)
    private void onSwipeLeft() {
        if(quotePosition < positionsArray.length - 1) {
            quotePosition++;
        } else {
            quotePosition = 0;
        }
        setSearchQuoteTextViewAndIcon(quotePosition);
    }

    //add quote/author/category each in one ArrayList to Shared Preferences - guide: kelut.at/arraylist-mit-objekten-in-den-sharedpreferences-abspeichern/
    public void onAddSearchQuoteToFavoritesButtonClick(View view) {
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
            favoriteCategories.add(categoryNamesArray[quotePosition]);
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
                favoriteCategories.add(categoryNamesArray[quotePosition]);
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

    //generates random index from searchResults and sets everything new
    public void onRandomNextSearchQuoteButtonClick(View view) {
        //exit if there's only one quote (otherwise it would produce an infinite loop and cause the app to stop responding)
        if(positionsArray.length == 1) { return; }

        //random generator with an upperlimit of the total ArrayList size. Random(upperlimit) delivers values in range of [0;upperlimit-1]
        Random randomGenerator = new Random();
        int randomPosition = randomGenerator.nextInt(positionsArray.length);
        //while randomPosition is the same position as the quote before, find new random quote [effect: randomButton always delivers new quote]
        while(randomPosition == quotePosition)
            randomPosition = randomGenerator.nextInt(positionsArray.length);
        //updates quotePosition to the randomly selected position
        quotePosition = randomPosition;
        setSearchQuoteTextViewAndIcon(quotePosition);
    }

    public void onSearchCopyButtonClick(View view) {
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

    public void onUpButtonClickSearchQuote(View view) {
        finish();
    }
}

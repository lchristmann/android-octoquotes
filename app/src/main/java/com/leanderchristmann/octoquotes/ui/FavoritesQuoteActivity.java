package com.leanderchristmann.octoquotes.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//QuoteActivity implements GestureDetector.OnGestureListener -> gives onFling method for swiping, amonst others
public class FavoritesQuoteActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {

    //the only 2 layout elements that are variable -> have to be set by this class
    private TextView favoriteQuoteTextView, favoriteAuthorTextView;
    private ImageView favoriteCategoryIconImageView;

    //declare all variables needed globally
    private ArrayList<String> favoriteQuotes, favoriteAuthors, favoriteCategories;
    private int quotePosition;
    private String quoteText, authorName;

    //variables needed for GestureDetector (swiping functionality)
    private static final int SWIPE_TRESHOLD = 100, SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;

    //variable to prevent toast accumulation
    private Toast showingToast = null;

    //globally declared sharedPreferences, needed everywhere here, because FavoritesList stored in SharedPreferences (and theme Settings!)
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make sharedPreferences connection here. (it is create globally above, so now it can be accessed everywhere in this class)
        sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default

        setContentView(R.layout.activity_favorites_quote);

        favoriteQuoteTextView = findViewById(R.id.favoriteQuoteTextView);
        favoriteAuthorTextView = findViewById(R.id.favoriteAuthorTextView);
        favoriteCategoryIconImageView = findViewById(R.id.favoriteCategoryIconImageView);
        ImageButton randomNextFavoriteQuoteButton = findViewById(R.id.randomNextFavoriteQuoteButton);
        ImageButton removeFromFavoritesButton = findViewById(R.id.removeFromFavoritesButton);
        ImageButton copyFavoriteQuoteButton = findViewById(R.id.copyFavoriteQuoteButton);

        //do remaining needed changes for the set theme if needed (if its lightmode!)
        if (!sharedPreferences.getBoolean("darkMode", true)){
            randomNextFavoriteQuoteButton.setImageResource(R.drawable.x52_shuffle_jet);
            removeFromFavoritesButton.setImageResource(R.drawable.x55_trash_jet);
            copyFavoriteQuoteButton.setImageResource(R.drawable.x51_copy_jet);
        }

        Intent intent = getIntent();
        quotePosition = intent.getIntExtra("quotePosition", 0);

        //create Gson object, that can transform objects to Strings (guide: kelut.at/arraylist-mit-objekten-in-den-sharedpreferences-abspeichern/)
        Gson gson = new Gson();

        //get Strings for ArrayLists out of SharedPreferencfes (READ)
        String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", "");
        String jsonGetFavoriteAuthors = sharedPreferences.getString("favoriteAuthors", "");
        String jsonGetFavoriteCategories = sharedPreferences.getString("favoriteCategories", "");

        //convert them to ArrayList form (TRANSLATE)
        Type type = new TypeToken<List<String>>() {
        }.getType();
        favoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
        favoriteAuthors = gson.fromJson(jsonGetFavoriteAuthors, type);
        favoriteCategories = gson.fromJson(jsonGetFavoriteCategories, type);

        setQuoteTextViewAndIcon(quotePosition);

        //initizalize gesture Detector for swiping
        gestureDetector = new GestureDetector(this, this);
    }

    //given: 3lists: quote/author/category, position of the selected quote ->everything is set by position here: quote[position]/author[position]/category[position]
    private void setQuoteTextViewAndIcon(int quotePosition) {
        //get the quoteText and authorName; set combined in JoinedTextView to the TextView
        quoteText = favoriteQuotes.get(quotePosition);
        authorName = favoriteAuthors.get(quotePosition);

        favoriteQuoteTextView.setText(quoteText);
        String formattedAuthor = "~ " + authorName;
        favoriteAuthorTextView.setText(formattedAuthor);

        //set the icon up right depending on the category
        String categoryName = favoriteCategories.get(quotePosition);
        switch (categoryName) {
            case "Attitude":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x01_attitude_snow_no_circle);
                break;
            case "Happiness":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x02_happiness_snow_no_circle);
                break;
            case "Humor":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x03_humor_snow_no_circle);
                break;
            case "Inspiration":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                break;
            case "Love":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x05_love_snow_no_circle);
                break;
            case "Motivation":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x06_motivation_snow_no_circle);
                break;
            case "Purpose":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x07_purpose_snow_no_circle);
                break;
            case "Success":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x08_success_snow_no_circle);
                break;
            case "Time":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x09_time_snow_no_circle);
                break;
            case "Wisdom":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                break;
            case "Sports":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x12_sports_snow_no_circle);
                break;
            case "Nature":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x17_nature_snow_no_circle);
                break;
            case "Coding":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x13_coding_snow_no_circle);
                break;
            case "Short":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x14_short_snow_no_circle);
                break;
            case "Faith":
                favoriteCategoryIconImageView.setImageResource(R.drawable.x15_cross_snow_no_circle);
                break;
        }
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
        float diffX = moveEvent.getX() - downEvent.getX();
        float diffY = moveEvent.getY() - downEvent.getY();
        //which was greater? movement across X or Y?
        if (Math.abs(diffX) > Math.abs(diffY)) {
            //right or left swipe
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
            //up or down swipe
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

    //handles the left to right swipe: decrease quotePosition if > position 0; (else) if position == 0 go to the highest listElement (index: list.size - 1)
    private void onSwipeRight() {
        if (quotePosition > 0) {
            quotePosition--;
        } else {
            quotePosition = favoriteQuotes.size() - 1;
        }
        setQuoteTextViewAndIcon(quotePosition);
    }

    //handles the right to left swipe: increase quotePosition if < HighestIndex (list.size-1); (else) if its the highestIndex (list.length-1) already, go to lowest listElement (index = 0)
    private void onSwipeLeft() {
        if (quotePosition < favoriteQuotes.size() - 1) {
            quotePosition++;
        } else {
            quotePosition = 0;
        }
        setQuoteTextViewAndIcon(quotePosition);
    }

    public void onRandomNextFavoriteQuoteButtonClick(View view) {
        //exit if there's only one quote (otherwise it would produce an infinite loop and cause the app to stop responding)
        if(favoriteQuotes.size() == 1) { return; }

        //random generator with an upperlimit of the total list size. Random(upperlimit) delivers values in range of [0;upperlimit-1]
        Random randomGenerator = new Random();
        int randomPosition = randomGenerator.nextInt(favoriteQuotes.size());
        //while randomPosition is the same position as the quote before, find new random quote [effect: randomButton always delivers new quote]
        while (randomPosition == quotePosition)
            randomPosition = randomGenerator.nextInt(favoriteQuotes.size());
        setQuoteTextViewAndIcon(randomPosition);
        //updates quotePosition to the randomly selected position
        quotePosition = randomPosition;
    }

    public void onRemoveFavoriteQuoteClick(View view) {
        //make an AlertDialog popup to verify if the user really wants to delete the quote from favorites. on positiveButtonClick delete it from Lists here and SharedPreferences
        int trashIcon;
        if(sharedPreferences.getBoolean("darkMode", true))
            trashIcon = R.drawable.x55_trash_snow;
        else
            trashIcon = R.drawable.x55_trash_jet;

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setIcon(trashIcon)
                .setTitle("Remove this quote\nfrom favorites?")
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Remove", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //create a sharedPreferencesEditor
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        //remove the values at the current position in the 3 lists: quote/author/category (EDIT)
                        favoriteQuotes.remove(quotePosition);
                        favoriteAuthors.remove(quotePosition);
                        favoriteCategories.remove(quotePosition);
                        //convert ArrayLists to JSON with Gson (TRANSLATE)
                        Gson gson = new Gson();
                        String jsonFavoriteQuotes = gson.toJson(favoriteQuotes);
                        String jsonFavoriteAuthors = gson.toJson(favoriteAuthors);
                        String jsonFavoriteCategories = gson.toJson(favoriteCategories);
                        //put the updated lists into sharedPreferences (WRITE/UPDATE)
                        editor.putString("favoriteQuotes", jsonFavoriteQuotes).apply();
                        editor.putString("favoriteAuthors", jsonFavoriteAuthors).apply();
                        editor.putString("favoriteCategories", jsonFavoriteCategories).apply();

                        //WHEN FAVORITE QUOTE REMOVED SET NEW QUOTE OR - if it was the last quote - exit Activity
                        //if it was the last quote that has just been removed, finish Activity
                        if (favoriteQuotes.isEmpty()) {
                            finish();
                            //if there are still favorite quotes, show the next one (ArrayList moves quotes up if one has been removed, there are no gaps, so when list item is removed at position, list item at position + 1 becomes lits item at position(if it exists ofc) and the list size is already one smaller)
                        } else {
                            if (quotePosition < favoriteQuotes.size()) {
                                setQuoteTextViewAndIcon(quotePosition);
                                //if the removed quote was the last quote, meaning that the index t hat has been removed is now out of bounds (quotePosition=list.size) set the first quote in the list
                            } else {
                                setQuoteTextViewAndIcon(0);
                                quotePosition = 0;
                            }
                        }
                    }
                })
                .show();
        //set the button colors to mainPurple instead of turqouise blue. have to set after, bcs before show they dont exist yet.
        alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(getResources().getColor(R.color.foregroundColor));
        alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(getResources().getColor(R.color.foregroundColor));
    }

    //make sharedPreferences connection, see how copySettings are set(with/without Author) -> put textToCopy together accordingly and copy it to Clipboard
    public void onFavoriteCopyButtonClick(View view) {
        String textToCopy;
        String copySettings = sharedPreferences.getString("copySettings", "withoutAuthor");
        if (copySettings.equals("withoutAuthor")) {
            textToCopy = quoteText;
        } else {
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

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickFavoritesQuote(View view) {
        finish();
    }
}
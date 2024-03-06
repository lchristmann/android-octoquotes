package com.leanderchristmann.octoquotes.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.leanderchristmann.octoquotes.R;

import java.util.HashMap;
import java.util.Map;

//QuoteActivity implements GestureDetector.OnGestureListener -> gives onFling method for swiping, amongst others
public class FeedbackActivity extends AppCompatActivity implements GestureDetector.OnGestureListener{

    //declare layouts (to set their visibility programmatically in this class) & layout elements (only those with data to retrieve needed explicitly)
    private ConstraintLayout feedbackLayout, onSuccessLayout, onFailureLayout;

    private EditText subjectEditText, feedbackEditText;

    private static final String SUBJECT_KEY = "subject", FEEDBACK_TEXT_KEY = "feedbackText";
    //make define connection to the database connection to the feedbackCollection (by getting an instance -> defining the path)
    private CollectionReference feedbackCollectionReference = FirebaseFirestore.getInstance().collection("mainCollection")
            .document("feedback").collection("feedbackCollection");

    //variable to prevent toast accumulation
    private Toast showingToast = null;

    //declarations for swipe functionality
    private static final int SWIPE_TRESHOLD = 100, SWIPE_VELOCITY_THRESHOLD = 100;
    private GestureDetector gestureDetector;
    //user can only swipe out if he submitted the Feedback (so he doesn't swipe out by mistake and clears his text by mistake)
    private boolean swipeable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //look into SharedPreferences to see if user has light or dark theme set & set theme accordingly
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);
        //look into SharedPreferences to set the Activity according to theme settings
        if (sharedPreferences.getBoolean("darkMode", true))
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        //else do nothing, because the light mode is default
        setContentView(R.layout.activity_feedback);

        //initialize the layout elements declared above
        feedbackLayout = findViewById(R.id.feedbackLayout);
        onSuccessLayout = findViewById( R.id.onSuccessLayoutFeedback);
        onFailureLayout = findViewById(R.id.onFailureLayoutFeedback);
        subjectEditText = findViewById(R.id.subjectEditText);
        feedbackEditText = findViewById(R.id.feedbackEditText);

        //set default visibility: succes & failure layouts INVISIBLE; (feedBack layout per default(xml file) VISIBLE)
        onSuccessLayout.setVisibility(View.INVISIBLE);
        onFailureLayout.setVisibility(View.INVISIBLE);

        //initizalize gesture Detector for swiping and set the swipeable variable false for now (so you cant swipe out by mistake while writing)
        gestureDetector = new GestureDetector(this, this);
        swipeable = false;
    }

    public void onSubmitButtonClick(View view) {

        //if no Internet Connection, show toast so user knows why it's not working
        if(!isConnectedToInternet(getApplicationContext())){
            //prevents toast accumulation
            if (showingToast != null) showingToast.cancel();
            showingToast = Toast.makeText(this, "No Internet Connection", Toast.LENGTH_SHORT);
            showingToast.show();
            return;
        }

        //retrieve text out of EditTexts
        String subjectText = subjectEditText.getText().toString();
        String feedbackText = feedbackEditText.getText().toString();

        //if feedback text is empty, just exit method with empty return statement
        if(feedbackText.isEmpty()) {return; }

        //if feedback text not empty, save feedback to Maps: "subject":"subjectText" - "feedbackText":"feedbackText" (Map= (key, value) pairs)
        Map<String, Object>feedbackToSave = new HashMap<>();
        feedbackToSave.put(SUBJECT_KEY, subjectText);
        feedbackToSave.put(FEEDBACK_TEXT_KEY, feedbackText);

        //write the maps into a document in the defined Cloud Firestore database collection (document name = random unique ID)
        feedbackCollectionReference.add(feedbackToSave).addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
            @Override
            public void onSuccess(DocumentReference documentReference) {
                //set main layout invisible and onSuccessLayout visible
                feedbackLayout.setVisibility(View.INVISIBLE);
                onSuccessLayout.setVisibility(View.VISIBLE);
                //set swipeable to true, so the user can swipe out of success layout
                swipeable = true;
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                //set main layout invisible and onFailureLayout visible
                feedbackLayout.setVisibility(View.INVISIBLE);
                onFailureLayout.setVisibility(View.VISIBLE);
                //set swipeable to true, so the user can swipe out of failure layout
                swipeable = true;
            }
        });
    }

    private static boolean isConnectedToInternet(Context context){
        boolean isConnected = true;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected() || !networkInfo.isAvailable()) {
                isConnected = false;
            }
        } catch (Exception e){
            isConnected = false;
        }

        return isConnected;
    }

    //onClick method for upButton: left arrow to exit the activity
    public void onUpButtonClickFeedback(View view) {
        finish();
    }

    //method to make the gestureDetector notice touchEvents
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    //SWIPING: if onSuccess or onFailure layout has been set, the user can swipe out of the activity in any direction
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

    private void onSwipeTop() {
        if(swipeable)
            finish();
    }

    private void onSwipeBottom() {
        if(swipeable)
            finish();
    }

    private void onSwipeRight() {
        if(swipeable)
            finish();
    }

    private void onSwipeLeft() {
        if(swipeable)
            finish();
    }
}
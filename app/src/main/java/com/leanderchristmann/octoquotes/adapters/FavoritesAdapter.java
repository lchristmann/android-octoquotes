package com.leanderchristmann.octoquotes.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.leanderchristmann.octoquotes.R;
import com.leanderchristmann.octoquotes.util.FavoritesItemTouchHelperAdapter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//this CustomAdapter is built FOR FavoritesActivity USING custom_layout_3.xml
public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolder> implements FavoritesItemTouchHelperAdapter {
    //declare everything needed to fill layout
    private final Context context;
    private ArrayList<String> favoriteQuotes;
    private ArrayList<String> favoriteCategories;
    private final boolean darkMode;
    private OnFavoriteClickListener onFavoriteClickListener;
    private ItemTouchHelper itemTouchHelper;

    private SharedPreferences sharedPreferences;

    //constructor for CustomAdapter3, takes the ArrayLists needed to fill custom_layout_3 and initializes inflater with context
    public FavoritesAdapter(Context context, ArrayList<String> favoriteQuotes, ArrayList<String> favoriteCategories, boolean darkMode, OnFavoriteClickListener onFavoriteClickListener) {
        this.context = context;
        this.favoriteQuotes = favoriteQuotes;
        this.favoriteCategories = favoriteCategories;
        this.darkMode = darkMode;
        this.onFavoriteClickListener = onFavoriteClickListener;
    }

    //provide a reference to the type of views that you are using (custom ViewHolder)
    class ViewHolder extends RecyclerView.ViewHolder implements
            View.OnTouchListener, GestureDetector.OnGestureListener {
        private final ImageView favoriteCategoryImageView;
        private final TextView quoteTextViewInCustomLayout3;
        OnFavoriteClickListener onFavoriteClickListener;
        GestureDetector gestureDetector;

        //constructor for ViewHolder (public ViewHolder(){...})
        ViewHolder(View view, OnFavoriteClickListener onFavoriteClickListener) {
            super(view);

            //findViewByIds
            favoriteCategoryImageView = view.findViewById(R.id.favoriteCategoryImageView);;
            quoteTextViewInCustomLayout3 = view.findViewById(R.id.quoteTextViewInCustomLayout3);;
            this.onFavoriteClickListener = onFavoriteClickListener;

            gestureDetector = new GestureDetector(view.getContext(), this);

            view.setOnTouchListener(this);
        }

        ImageView getFavoriteCategoryImageView() {
            return favoriteCategoryImageView;
        }
        TextView getQuoteTextViewInCustomLayout3() {
            return quoteTextViewInCustomLayout3;
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            onFavoriteClickListener.onFavoriteClick(getAdapterPosition());
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {
            itemTouchHelper.startDrag(this);
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return true;
        }

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            gestureDetector.onTouchEvent(event);
            return true;
        }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout_3, parent, false);

        return new ViewHolder(view, onFavoriteClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //get element from your dataset at this position and replace the contents of the view with that element
        //HANDLE TEXTVIEW
        holder.getQuoteTextViewInCustomLayout3().setText(favoriteQuotes.get(position));
        //HANDLE IMAGE VIEW
        switch (favoriteCategories.get(position)) {
            case "Attitude":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x01_attitude_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x01_attitude_jet_no_circle);
                break;
            case "Happiness":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x02_happiness_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x02_happiness_jet_no_circle);
                break;
            case "Humor":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x03_humor_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x03_humor_jet_no_circle);
                break;
            case "Inspiration":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x04_inspiration_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x04_inspiration_jet_no_circle);
                break;
            case "Love":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x05_love_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x05_love_jet_no_circle);
                break;
            case "Motivation":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x06_motivation_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x06_motivation_jet_no_circle);
                break;
            case "Purpose":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x07_purpose_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x07_purpose_jet_no_circle);
                break;
            case "Success":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x08_success_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x08_success_jet_no_circle);
                break;
            case "Time":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x09_time_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x09_time_jet_no_circle);
                break;
            case "Wisdom":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x10_wisdom_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x10_wisdom_jet_no_circle);
                break;
            case "Sports":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x12_sports_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x12_sports_jet_no_circle);
                break;
            case "Nature":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x17_nature_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x17_nature_jet_no_circle);
                break;
            case "Coding":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x13_coding_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x13_coding_jet_no_circle);
                break;
            case "Short":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x14_short_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x14_short_jet_no_circle);
                break;
            case "Faith":
                if (darkMode)
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x15_cross_snow_no_circle);
                else
                    holder.getFavoriteCategoryImageView().setImageResource(R.drawable.x15_cross_jet_no_circle);
                break;
        }
    }

    //tells Adapter how many items there are
    @Override
    public int getItemCount() {
        //check if favoriteQuotes is null or else this will throw NPE!      IF DEFVALUE in FavoritesActivity ever changed to "" instead of null, check with .isEmpty here!
        if (favoriteQuotes == null)
            return 0;
        return favoriteQuotes.size();
    }

    //best practice way for recyclerView onClickListener: interface -> implement it in activity
    public interface OnFavoriteClickListener{
        void onFavoriteClick(int position);
    }

    //Following 2 methods are from FavoritesItemTouchHelperAdapter interface
    //dragging to change position
    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        //JUST FRONTEND (changes listview user interface)
        String fromQuote = favoriteQuotes.get(fromPosition);
        favoriteQuotes.remove(fromPosition);
        favoriteQuotes.add(toPosition, fromQuote);

        String fromCategory = favoriteCategories.get(fromPosition);
        favoriteCategories.remove(fromPosition);
        favoriteCategories.add(toPosition, fromCategory);
        this.notifyItemMoved(fromPosition, toPosition);

        //NOW THIS CHANGES THE BACKEND (data stored in SharedPreferences)
        moveStringInFavoritesSharedPrefs(fromPosition, toPosition);
    }

    //swiping to delete
    @Override
    public void onItemSwiped(int position) {
        //JUST FRONTEND
        favoriteQuotes.remove(position);
        favoriteCategories.remove(position);
        this.notifyItemRemoved(position);           //many hours bug fixed by adding "this." in those 2 lines.
        this.notifyItemRangeChanged(position, favoriteQuotes.size());

        //BACKEND (SharedPreferences)
        removeFromFavoritesSharedPrefs(position);
    }

    public void setItemTouchHelper(ItemTouchHelper itemTouchHelper) {
        this.itemTouchHelper = itemTouchHelper;
    }

    private void moveStringInFavoritesSharedPrefs(int fromPosition, int toPosition) {

        sharedPreferences = context.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);

        //create a sharedPreferencesEditor and a Gson object
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();

        //get ArrayLists out of SharedPreferences (READ)
        String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", "");
        String jsonGetFavoriteAuthors = sharedPreferences.getString("favoriteAuthors", "");
        String jsonGetFavoriteCategories = sharedPreferences.getString("favoriteCategories", "");

        //convert them to ArrayList form (TRANSLATE)
        Type type = new TypeToken<List<String>>(){}.getType();
        ArrayList<String> SPfavoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
        ArrayList<String> SPfavoriteAuthors = gson.fromJson(jsonGetFavoriteAuthors, type);
        ArrayList<String> SPfavoriteCategories = gson.fromJson(jsonGetFavoriteCategories, type);

        //Store data from quote, author, category before removing it, so it can be added again after
        String quoteToMove = SPfavoriteQuotes.get(fromPosition);
        String authorToMove = SPfavoriteAuthors.get(fromPosition);
        String categoryToMove = SPfavoriteCategories.get(fromPosition);

        //REMOVE FROM OLD POSITION
        //remove the values at the current position in the 3 lists (EDIT)
        SPfavoriteQuotes.remove(fromPosition);
        SPfavoriteAuthors.remove(fromPosition);
        SPfavoriteCategories.remove(fromPosition);

        //ADD ON NEW POSITION
        SPfavoriteQuotes.add(toPosition, quoteToMove);
        SPfavoriteAuthors.add(toPosition, authorToMove);
        SPfavoriteCategories.add(toPosition, categoryToMove);

        //convert ArrayLists to JSON with Gson (TRANSLATE)
        String jsonFavoriteQuotes = gson.toJson(SPfavoriteQuotes);
        String jsonFavoriteAuthors = gson.toJson(SPfavoriteAuthors);
        String jsonFavoriteCategories = gson.toJson(SPfavoriteCategories);

        //put the updated lists into sharedPreferences (WRITE/UPDATE)
        editor.putString("favoriteQuotes", jsonFavoriteQuotes).apply();
        editor.putString("favoriteAuthors", jsonFavoriteAuthors).apply();
        editor.putString("favoriteCategories", jsonFavoriteCategories).apply();
    }

    private void removeFromFavoritesSharedPrefs(int position) {

        sharedPreferences = context.getSharedPreferences("com.leanderchristmann.octoquotes", Context.MODE_PRIVATE);

        //create a sharedPreferencesEditor and a Gson object
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();

        //get ArrayLists out of SharedPreferences (READ)
        String jsonGetFavoriteQuotes = sharedPreferences.getString("favoriteQuotes", "");
        String jsonGetFavoriteAuthors = sharedPreferences.getString("favoriteAuthors", "");
        String jsonGetFavoriteCategories = sharedPreferences.getString("favoriteCategories", "");

        //convert them to ArrayList form (TRANSLATE)
        Type type = new TypeToken<List<String>>(){}.getType();
        ArrayList<String> SPfavoriteQuotes = gson.fromJson(jsonGetFavoriteQuotes, type);
        ArrayList<String> SPfavoriteAuthors = gson.fromJson(jsonGetFavoriteAuthors, type);
        ArrayList<String> SPfavoriteCategories = gson.fromJson(jsonGetFavoriteCategories, type);

        //remove the values at the current position in the 3 lists (EDIT)
        SPfavoriteQuotes.remove(position);
        SPfavoriteAuthors.remove(position);
        SPfavoriteCategories.remove(position);

        //convert ArrayLists to JSON with Gson (TRANSLATE BACK)
        String jsonFavoriteQuotes = gson.toJson(SPfavoriteQuotes);
        String jsonFavoriteAuthors = gson.toJson(SPfavoriteAuthors);
        String jsonFavoriteCategories = gson.toJson(SPfavoriteCategories);

        //put the updated lists into sharedPreferences (WRITE/UPDATE)
        editor.putString("favoriteQuotes", jsonFavoriteQuotes).apply();
        editor.putString("favoriteAuthors", jsonFavoriteAuthors).apply();
        editor.putString("favoriteCategories", jsonFavoriteCategories).apply();
    }
}

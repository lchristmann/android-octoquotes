package com.leanderchristmann.octoquotes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leanderchristmann.octoquotes.R;

//this CustomAdapter built for and used by: MainActivity USING custom_layout.xml
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    //declare everything needed to fill layout
    private int[] categoryIcons;
    private String[] categoryNames;
    private int[] categorySizes;
    private OnCategoryClickListener onCategoryClickListener;

    //constructor for CustomAdapter, takes everything needed to fill custom_layout and initializes inflater with context
    public MainAdapter(int[] categoryIcons, String[] categoryNames, int[] categorySizes, OnCategoryClickListener onCategoryClickListener) {
        this.categoryIcons = categoryIcons;
        this.categoryNames = categoryNames;
        this.categorySizes = categorySizes;
        this.onCategoryClickListener = onCategoryClickListener;
    }

    //prove a reference to the type of views that you are using (custom ViewHolder)
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ImageView mainCategoryIconImageView;
        private final TextView mainCategoryNameTextView;
        private final TextView mainCategorySizeTextView;
        OnCategoryClickListener onCategoryClickListener;

        //constructor for ViewHolder (public ViewHolder(){...})
        ViewHolder(View view, OnCategoryClickListener onCategoryClickListener) {
            super(view);
            //setOnClickListener

            mainCategoryIconImageView = view.findViewById(R.id.mainCategoryIconImageView);
            mainCategoryNameTextView = view.findViewById(R.id.mainCategoryNameTextView);
            mainCategorySizeTextView = view.findViewById(R.id.mainCategorySizeTextView);
            this.onCategoryClickListener = onCategoryClickListener;

            view.setOnClickListener(this);
        }

        ImageView getMainCategoryIconImageView() {
            return mainCategoryIconImageView;
        }
        TextView getMainCategoryNameTextView() {
            return mainCategoryNameTextView;
        }
        TextView getMainCategorySizeTextView() {
            return mainCategorySizeTextView;
        }

        @Override
        public void onClick(View v) {
            onCategoryClickListener.onCategoryClick(getAdapterPosition());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout, parent, false);

        return new ViewHolder(view, onCategoryClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getMainCategoryIconImageView().setImageResource(categoryIcons[position]);
        holder.getMainCategoryNameTextView().setText(categoryNames[position]);
        //care String.valueof() important (/Integer.toString(...)), cant give SetText an Integer!
        holder.getMainCategorySizeTextView().setText(String.valueOf(categorySizes[position]));
    }

    @Override
    public int getItemCount() {
        return categoryIcons.length;
    }

        //best practice way for recyclerView onClickListener: interface -> implement it in activity
    public interface OnCategoryClickListener{
        void onCategoryClick(int position);
    }
}

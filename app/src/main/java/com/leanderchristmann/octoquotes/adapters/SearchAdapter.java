package com.leanderchristmann.octoquotes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leanderchristmann.octoquotes.R;

//this CustomAdapter is built FOR SearchActivity USING custom_layout_4.xml
public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private String[] quotes, authors;
    private OnSearchedClickListener onSearchedClickListener;

    public SearchAdapter(String[] quotes, String[] authors, OnSearchedClickListener onSearchedClickListener) {
        this.quotes = quotes;
        this.authors = authors;
        this.onSearchedClickListener = onSearchedClickListener;
    }

    //provide a reference to the type of views that you are using (custom ViewHolder)
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final TextView foundQuoteTextView, foundAuthorTextView;
        OnSearchedClickListener onSearchedClickListener;

        //constructor for ViewHolder
        ViewHolder(View view, OnSearchedClickListener onSearchedClickListener){
            super(view);

            foundQuoteTextView = view.findViewById(R.id.foundQuoteTextView);
            foundAuthorTextView = view.findViewById(R.id.foundAuthorTextView);
            this.onSearchedClickListener = onSearchedClickListener;

            view.setOnClickListener(this);
        }

        TextView getFoundQuoteTextView(){
            return foundQuoteTextView;
        }

        TextView getFoundAuthorTextView(){
            return foundAuthorTextView;
        }

        @Override
        public void onClick(View v) {
            onSearchedClickListener.onSearchedClick(getAdapterPosition());
        }
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout_4, parent, false);

        return new ViewHolder(view, onSearchedClickListener);
    }

    //Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //get element from your dataset at this position and replace the contents of the view with that element
        holder.getFoundQuoteTextView().setText(quotes[position]);
        String formattedAuthor = "~ " + authors[position];
        holder.getFoundAuthorTextView().setText(formattedAuthor);
    }

    @Override
    public int getItemCount() {
        return quotes.length;
    }

    //best practice way for recyclerView onClickListener: interface -> implement it in activity
    public interface OnSearchedClickListener{
        void onSearchedClick(int position);
    }
}

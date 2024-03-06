package com.leanderchristmann.octoquotes.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leanderchristmann.octoquotes.R;

//this CustomAdapter is built FOR CategoryActivity USING custom_layout_2.xml
//to understand the ViewHolder technology: https://www.youtube.com/watch?v=69C1ljfDvl0&ab_channel=CodingWithMitch (second half of vid explanation!)
//https://www.youtube.com/watch?v=W2fTwpAiteE&t=375s&ab_channel=LetsBuildThatApp | https://www.youtube.com/watch?v=uh6lKnfp5hY&ab_channel=BrandanJones

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    //declare everything needed to fill layout
    private String[] quotes;
    private int purpleCircleId;
    private OnQuoteClickListener onQuoteClickListener;

    //constructor for CustomAdapter2, takes everything needed to fill custom_layout_2 and initializes inflater with context
    public CategoryAdapter(String[] quotes, boolean darkMode, OnQuoteClickListener onQuoteClickListener) {
        this.quotes = quotes;
        //determine Image Resource for Circle (persian indigo for light mode or purple(majorelle blue)for dark mode)
        if(darkMode)
            purpleCircleId = R.drawable.x98_ring_purple_for_dark;
        else
            purpleCircleId = R.drawable.x98_ring_purple_for_light;
        this.onQuoteClickListener = onQuoteClickListener;
    }

    //provide a reference to the type of views that you are using (custom ViewHolder)
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private final ImageView purpleRingImageView;
        private final TextView quoteIndexNumberTextView;
        private final TextView quoteTextViewInCustomLayout2;
        OnQuoteClickListener onQuoteClickListener;

        //constructor for ViewHolder (public ViewHolder(){...})
        ViewHolder(View view, OnQuoteClickListener onQuoteClickListener) {
            super(view);

            purpleRingImageView = view.findViewById(R.id.purpleRingImageView);
            quoteIndexNumberTextView = view.findViewById(R.id.quoteIndexNumberTextView);
            quoteTextViewInCustomLayout2 = view.findViewById(R.id.quoteTextViewInCustomLayout2);
            this.onQuoteClickListener = onQuoteClickListener;

            view.setOnClickListener(this);
        }

        ImageView getPurpleRingImageView() {
            return purpleRingImageView;
        }
        TextView getQuoteIndexNumberTextView() {
            return quoteIndexNumberTextView;
        }
        TextView getQuoteTextViewInCustomLayout2() {
            return quoteTextViewInCustomLayout2;
        }

        @Override
        public void onClick(View v) {
            onQuoteClickListener.onQuoteClick(getAdapterPosition());
        }
    }



    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_layout_2, parent, false);

        return new ViewHolder(view, onQuoteClickListener);
    }

    //Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        //get element from your dataset at this position and replace the contents of the view with that element
        holder.getPurpleRingImageView().setImageResource(purpleCircleId);
        holder.getQuoteIndexNumberTextView().setText(String.valueOf(position+1));
        holder.getQuoteTextViewInCustomLayout2().setText(quotes[position]);
    }

    @Override
    public int getItemCount() {
        return quotes.length;
    }

    //best practice way for recyclerView onClickListener: interface -> implement it in activity
    public interface OnQuoteClickListener{
        void onQuoteClick(int position);
    }
}
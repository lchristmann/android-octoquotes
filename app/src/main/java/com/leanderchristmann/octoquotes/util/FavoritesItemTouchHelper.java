package com.leanderchristmann.octoquotes.util;

import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.leanderchristmann.octoquotes.R;

//tutorial for removing and moving recyclerview items: https://www.youtube.com/watch?v=uvzP8KTz4Fg&t=95s&ab_channel=CodingWithMitch
public class FavoritesItemTouchHelper extends ItemTouchHelper.Callback{

    private final FavoritesItemTouchHelperAdapter favoritesItemTouchHelperAdapter;

    public FavoritesItemTouchHelper(FavoritesItemTouchHelperAdapter favoritesItemTouchHelperAdapter) {
        this.favoritesItemTouchHelperAdapter = favoritesItemTouchHelperAdapter;
    }

    //disable that, because we want to handle the drag inside of the ViewHolder of the RecyclerView
    @Override
    public boolean isLongPressDragEnabled() {
        return false;
    }

    //return true, because I want to be able to swipe the views
    @Override
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    //when I let go of dragged item, clear view is going to be called   | colors is set back to normal
    @Override
    public void clearView(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        super.clearView(recyclerView, viewHolder);
        viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(viewHolder.itemView.getContext(), R.color.backgroundColor));
    }

    //change the color to lighter grey when dragged
    @Override
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int actionState) {
        super.onSelectedChanged(viewHolder, actionState);
        if(actionState == ItemTouchHelper.ACTION_STATE_DRAG){
            viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(viewHolder.itemView.getContext(), R.color.dividerColor));
        }
    }

    @Override
    public int getMovementFlags(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder) {
        final int dragFlags = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        final int swipeFlags = ItemTouchHelper.START | ItemTouchHelper.END;
        return makeMovementFlags(dragFlags, swipeFlags);
    }

    @Override
    public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
        favoritesItemTouchHelperAdapter.onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
        favoritesItemTouchHelperAdapter.onItemSwiped(viewHolder.getAdapterPosition());
    }
}

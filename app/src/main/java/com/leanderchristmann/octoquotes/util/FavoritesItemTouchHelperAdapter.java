package com.leanderchristmann.octoquotes.util;

public interface FavoritesItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);

    void onItemSwiped(int position);
}

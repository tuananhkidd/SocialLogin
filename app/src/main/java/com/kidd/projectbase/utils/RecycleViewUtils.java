package com.kidd.projectbase.utils;

import android.content.Context;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kidd.projectbase.adapter.GalleryAdapter;

public class RecycleViewUtils {

    /**
     * @param mRecycle
     * @param adapter
     * @param listenerClickImageChat
     * @param numberImage
     * @param context
     */
    public static void showListRcvImageGallery(
            RecyclerView mRecycle,
            GalleryAdapter adapter,
            GalleryAdapter.ListenerClickImageChat listenerClickImageChat,
            int numberImage,
            Context context) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, numberImage);
        mRecycle.setHasFixedSize(true);
        mRecycle.setLayoutManager(gridLayoutManager);
        mRecycle.setItemAnimator(new DefaultItemAnimator());
        adapter.setListenerClickImageChat(listenerClickImageChat);
        mRecycle.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


}

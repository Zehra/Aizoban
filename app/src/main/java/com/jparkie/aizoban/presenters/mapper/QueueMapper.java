package com.jparkie.aizoban.presenters.mapper;

import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.widget.BaseAdapter;

public interface QueueMapper {
    public void registerAdapter(BaseAdapter adapter);

    public SparseBooleanArray getCheckedItemPositions();

    public Parcelable getPositionState();

    public void setPositionState(Parcelable state);
}

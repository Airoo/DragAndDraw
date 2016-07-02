package com.airo.android.draganddraw;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Airo on 01.07.2016.
 */
public class DragAndDrawFragment extends android.support.v4.app.Fragment {
    public static DragAndDrawFragment newInstance() {
        return new DragAndDrawFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_drag_and_draw, container,
                false);
        return v;
    }
}

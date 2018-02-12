package com.example.viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.view4, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment4", "onDestroyView");
    }
}

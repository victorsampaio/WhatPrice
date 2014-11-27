package android.com.whatprice.whatprice;

import android.app.Fragment;
import android.com.whatprice.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VictorSampaio on 26/11/2014.
 */
public class WhatPriceActivity extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_whatprice, container, false);
        return rootView;
    }

}

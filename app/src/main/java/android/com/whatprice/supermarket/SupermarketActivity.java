package android.com.whatprice.supermarket;

import android.app.Fragment;
import android.com.whatprice.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VictorSampaio on 26/11/2014.
 */
public class SupermarketActivity extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_supermarket, container, false);
        return rootView;
    }

}

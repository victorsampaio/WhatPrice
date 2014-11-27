package android.com.whatprice.product;

import android.app.Fragment;
import android.com.whatprice.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by VictorSampaio on 26/11/2014.
 */
public class ProductActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_product, container, false);
        return rootView;
    }

}

package android.com.whatprice.supermarket;

import android.app.Fragment;
import android.com.whatprice.R;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

/**
 * Created by VictorSampaio on 26/11/2014.
 */
public class SupermarketActivity extends Fragment implements OnClickListener{

    private static final String CATEGORY = "SupermarketActivity";

    Button btSave, btClear, btDelete;
    EditText etName, etAddress, etNumber, etPhone, etNeighborhood;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_supermarket, container, false);

        // Edit Text - Register
        etName = (EditText)rootView.findViewById(R.id.edtName);
        etAddress = (EditText)rootView.findViewById(R.id.edtAddress);
        etNumber = (EditText)rootView.findViewById(R.id.edtNumber);
        etPhone = (EditText)rootView.findViewById(R.id.edtPhone);
        etNeighborhood = (EditText)rootView.findViewById(R.id.edtNeighborhood);

        // Button
        btClear = (Button)rootView.findViewById(R.id.btnClear);
        btClear.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {

        etName.getText().clear();
        etAddress.getText().clear();
        etNumber.getText().clear();
        etPhone.getText().clear();
        etNeighborhood.getText().clear();

        try {

            if (v == btClear){
                Log.i(CATEGORY, "Button Clear Ok: ");
                etName.getText().clear();
                Log.i(CATEGORY, "EditText Name - Cleaned");
                etAddress.getText().clear();
                Log.i(CATEGORY, "EditText Address - Cleaned");
                etNumber.getText().clear();
                Log.i(CATEGORY, "EditText Number - Cleaned");
                etPhone.getText().clear();
                Log.i(CATEGORY, "EditText Phone - Cleaned");
                etNeighborhood.getText().clear();
                Log.i(CATEGORY, "EditText Neighborhood - Cleaned");

            }else if (v == btDelete){
                Log.i(CATEGORY, "Button Clear Ok: ");
                etName.getText().clear();
                Log.i(CATEGORY, "EditText Name - Cleaned");
                etAddress.getText().clear();
                Log.i(CATEGORY, "EditText Address - Cleaned");
                etNumber.getText().clear();
                Log.i(CATEGORY, "EditText Number - Cleaned");
                etPhone.getText().clear();
                Log.i(CATEGORY, "EditText Phone - Cleaned");
                etNeighborhood.getText().clear();
                Log.i(CATEGORY, "EditText Neighborhood - Cleaned");

            }else if (v == btSave){
                Log.i(CATEGORY, "Button Clear Ok: ");
                etName.getText().clear();
                Log.i(CATEGORY, "EditText Name - Cleaned");
                etAddress.getText().clear();
                Log.i(CATEGORY, "EditText Address - Cleaned");
                etNumber.getText().clear();
                Log.i(CATEGORY, "EditText Number - Cleaned");
                etPhone.getText().clear();
                Log.i(CATEGORY, "EditText Phone - Cleaned");
                etNeighborhood.getText().clear();
                Log.i(CATEGORY, "EditText Neighborhood - Cleaned");

            }
        }catch (Exception e){
            Log.i(CATEGORY, "ERROR: " + e.getMessage());
            e.getMessage();
        }


    }
}

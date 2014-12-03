package android.com.whatprice.product;

import android.app.Fragment;
import android.com.whatprice.R;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by VictorSampaio on 26/11/2014.
 */


public class ProductActivity extends Fragment implements OnClickListener{

    private static final String CATEGORY = "ProductActivity";

    TextView alert;
    Button btClear, btSave, btDelete;
    EditText name, price;
    String nameText, stringPrice;
    Double valuePrice;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.layout_product, container, false);

        name =(EditText)rootView.findViewById(R.id.edtNameProduct);
        price = (EditText)rootView.findViewById(R.id.edtPrice);

        // Buttons
        //Clear
        btClear =(Button)rootView.findViewById(R.id.btnClear);
        btClear.setOnClickListener(this);
        //Delete
        btDelete = (Button)rootView.findViewById(R.id.btnDelete);
        btDelete.setOnClickListener(this);
        //Save
        btSave = (Button)rootView.findViewById(R.id.btnSave);
        btSave.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    name = (EditText)rootView.findViewById(R.id.edtNameProduct);
                    nameText = name.getText().toString();
                    price = (EditText)rootView.findViewById(R.id.edtPrice);
                    stringPrice = price.getText().toString();

                    if (nameText.matches("") || stringPrice.matches("")){
                       Log.i(CATEGORY, "WRITE A PRODUCT");
                        alert = (TextView)rootView.findViewById(R.id.txvAlertProduct);
                        alert.setText("Product or Price Invalid");
                        return;
                    }else {
                        Log.i(CATEGORY, "Button Clear Ok: ");
                        name.getText().clear();
                        Log.i(CATEGORY, "EditText Name: Cleaned ");
                        price.getText().clear();
                        Log.i(CATEGORY, "EditText Price: Cleaned ");
                    }

                }catch (Exception e){
                    Log.i(CATEGORY, "ERROR: " + e.getMessage());
                    e.getMessage();
                }
            }
        });

        return rootView;
    }

    @Override
    public void onClick(View v) {
        try {
            if (v == btClear){
                Log.i(CATEGORY, "Button Clear Ok: ");
                name.getText().clear();
                Log.i(CATEGORY, "EditText Name: Cleaned ");
                price.getText().clear();
                Log.i(CATEGORY, "EditText Price: Cleaned ");

            }else {
                if (v == btDelete) {
                    Log.i(CATEGORY, "Button Clear Ok: ");
                    name.getText().clear();
                    Log.i(CATEGORY, "EditText Name: Cleaned ");
                    price.getText().clear();
                    Log.i(CATEGORY, "EditText Price: Cleaned ");

                }
                /*
                else {
                    if (v == btDelete) {
                        Log.i(CATEGORY, "Button Clear Ok: ");
                        name.getText().clear();
                        Log.i(CATEGORY, "EditText Name: Cleaned ");
                        price.getText().clear();
                        Log.i(CATEGORY, "EditText Price: Cleaned ");
                    }
                }*/
            }

        }catch (Exception e){
            Log.i(CATEGORY, "ERROR: " + e.getMessage());
            e.getMessage();
        }

    }
}

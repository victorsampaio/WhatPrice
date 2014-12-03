package android.com.whatprice.adapter;

import android.com.whatprice.R;
import android.com.whatprice.product.Product;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VictorSampaio on 01/12/2014.
 */
public class ProductListAdapter extends BaseAdapter {

    private List<Product> productList;
    private LayoutInflater inflater;

    public ProductListAdapter(Context context, List<Product>productList){

        this.productList = productList;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Product product = productList.get(position);

        View view = inflater.inflate(R.layout.layout_product_table, null);

        TextView nameView = (TextView)view.findViewById(R.id.txvName);
        nameView.setText(product.name);

        TextView priceView = (TextView)view.findViewById(R.id.txvPrice);
        priceView.setText(String.valueOf(product.price));

        return view;
    }
}



























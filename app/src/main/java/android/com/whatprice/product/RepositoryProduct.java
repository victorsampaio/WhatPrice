package android.com.whatprice.product;

import android.com.whatprice.product.Product;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

/**
 * Created by VictorSampaio on 02/12/2014.
 */
public class RepositoryProduct {
    private static final String CATEGORY = "RepositoryProduct";

    // The name of the database
    private static final String DATABASE_NAME = "wp";

    //The name of the Table
    public static final String TABLE_PRODUCT = "product";

    protected SQLiteDatabase db;

    public RepositoryProduct(Context context){
        // Open existing database
        db = context.openOrCreateDatabase(DATABASE_NAME, Context.MODE_PRIVATE, null);
    }

    protected RepositoryProduct(){
        // Just for create a subclass
    }

    // Save a product, insert a new product or update
    public long save(Product product){
        long id = product.id;

        if (id != 0){
            update(product);
        }else {
            // Insert a New Product
            id = insert(product);
        }
        return id;
    }

    // Insert a new Product
    public long insert(Product product){
        ContentValues values = new ContentValues();
        values.put(Product.Products.NAME, product.name);
        values.put(Product.Products.PRICE, product.price);

        long id = insert(values);
        return id;
    }
    // Insert a new Product
    public long insert(ContentValues values){
        long id = db.insert(TABLE_PRODUCT, "", values);
        return id;
    }

    // Update the product in a Database. The 'id' is used
    public int update(Product product){
        ContentValues values = new ContentValues();
        values.put(Product.Products.NAME, product.name);
        values.put(Product.Products.PRICE, product.price);

        String _id = String.valueOf(product.id);

        String where = Product.Products._ID + "=?";
        String[] whereArgs = new String[]{ _id };

        int count = update(values, where, whereArgs);

        return count;
    }

    // Update the Product with values.
    // The 'whereArgs' is used for identify the product to update
    public  int update(ContentValues values, String where, String[] whereArgs){
        int count = db.update(TABLE_PRODUCT, values, where,whereArgs);
        Log.i(CATEGORY, "Upgrade[" + count +"] register");

        return count;
    }

    // Delete the product with 'id' provided
    public int delete(long id){
        String where = Product.Products._ID + "=?";

        String _id = String.valueOf(id);
        String[] whereArgs = new String[]{ _id };

        int count = delete(where, whereArgs);

        return count;
    }

    // Delete the product with the Arguments provides
    public int delete(String where, String[] whereArgs){
        int count = db.delete(TABLE_PRODUCT, where, whereArgs);
        Log.i(CATEGORY, "Deleted [" + count + "] registers");
        return count;
    }

    // CLOSE DATABASE
    public void close(){
        //Close database
        if (db != null){
            db.close();
        }
    }

}




















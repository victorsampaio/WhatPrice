package android.com.whatprice.product;

import android.com.whatprice.database.DatabaseSQLiteHelper;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

/**
 * Created by VictorSampaio on 02/12/2014.
 */
public class RepositoryProductScript extends RepositoryProduct {

    //Script for execute a Drop in a Table
    private static final String SCRIPT_DATABASE_DELETE = "DROP TABLE IF EXISTS product";

    // Create a table with initial 'id'
    private static final String[] SCRIPT_DATABASE_CREATE = new String[]{
            "DROP TABLE IF EXISTS product",
            "create table product ( _id integer primary key autoincrement, name text not null, price decimal not null);",
            "insert into product (name,price) values('Arroz','10');",
            "insert into product (name,price) values('Biscoito','8');"
    };

    // Database Name
    private static final String DATABASE_NAME = "wp";

    // Version Control
    private static final int DATABASE_VERSION = 1;

    // Table Name
    public static final String TABLE_PRODUCT = "product";

    // Class for Open, create, and upgrade the database
    private DatabaseSQLiteHelper dbHelper;

    // Create a database with SQL Script
    public RepositoryProductScript(Context context){
        // create using a SQL Script
        dbHelper = new DatabaseSQLiteHelper(context, RepositoryProductScript.DATABASE_NAME, RepositoryProductScript.DATABASE_VERSION,
                RepositoryProductScript.SCRIPT_DATABASE_CREATE, RepositoryProductScript.SCRIPT_DATABASE_DELETE);

        db = dbHelper.getWritableDatabase();

    }

    // CLOSE DATABASE
    @Override
    public void close() {
        super.close();
        if (dbHelper != null) {
            dbHelper.close();
        }
    }
}

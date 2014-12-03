package android.com.whatprice.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by VictorSampaio on 01/12/2014.
 */

public class DatabaseSQLiteHelper extends SQLiteOpenHelper {

    private static final String CATEGORY ="Database-SQLiteHelper";

    private String[] scriptSQLCreate;
    private String scriptSQLDelete;


    public DatabaseSQLiteHelper(Context context, String nameDatabase, int versionDatabase, String[] scriptSQLCreate, String scriptSQLDelete) {
        super(context, nameDatabase, null, versionDatabase);
        this.scriptSQLCreate = scriptSQLCreate;
        this.scriptSQLDelete = scriptSQLDelete;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a new Database
        Log.i(CATEGORY, "Create a New Database");
        int informedScripts= scriptSQLCreate.length;

        // Execute Sql
        for (int i = 0 ; i < informedScripts ; i++){
            String sql = scriptSQLCreate[i];
            Log.i(CATEGORY, sql);
            db.execSQL(sql);
        }
    }

    // Changed a version
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(CATEGORY, "Upgrading a version " + oldVersion + " to new Version " + newVersion + ". All the registers will be deleted.");
        Log.i(CATEGORY, scriptSQLDelete);

        // Delete Tables
        db.execSQL(scriptSQLDelete);

        // Create again
        onCreate(db);
    }
}
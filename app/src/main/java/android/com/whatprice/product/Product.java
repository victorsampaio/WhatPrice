package android.com.whatprice.product;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;
import android.util.Log;

/**
 * Created by VictorSampaio on 01/12/2014.
 */
public class Product {

    public static String[] colunas = new String[] { Products._ID, Products.NAME, Products.PRICE};

    public static final String AUTHORITY = "android.com.whatprice.product";

    public long id;
    public String name;
    public Double price;

    public Product(){
    }

    public Product (String name, Double price){
        super();
        this.name = name;
        this.price =price;
    }

    public Product (long id, String name, Double price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public static final class Products implements BaseColumns{

        private Products(){
        }

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/products");

        // Mime Type para todos os carros
        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.google.products";

        // Mime Type para um único carro
        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.products";

        // Ordenação default para inserir no order by
        public static final String DEFAULT_SORT_ORDER = "_id ASC";

        public static final String NAME = "name";
        public static final String PRICE = "price";

        // Método que constrói uma Uri para um Produto específico, com o seu id
       public static Uri getUriId(long id) {
            // Adiciona o id na URI default do /carros
            Uri uriProduct = ContentUris.withAppendedId(Products.CONTENT_URI, id);
            return uriProduct;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }

}


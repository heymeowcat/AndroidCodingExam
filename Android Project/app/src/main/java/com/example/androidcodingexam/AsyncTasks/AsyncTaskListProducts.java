package com.example.androidcodingexam.AsyncTasks;

import android.content.Context;
import android.os.AsyncTask;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidcodingexam.Adapters.ProductsAdapter;
import com.example.androidcodingexam.Entities.Products;
import com.example.androidcodingexam.utils.AppConfig;
import com.example.androidcodingexam.utils.HttpPostClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.apache.http.message.BasicNameValuePair;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AsyncTaskListProducts extends AsyncTask<String, String, String> {


    RecyclerView view;

    Gson gson = new Gson();
    Context context;
    ProductsAdapter productsAdapter;

    public AsyncTaskListProducts(Context c, RecyclerView view) {
        this.context = c;
        this.view = view;
    }

    @Override
    protected String doInBackground(String... strings) {
        String response = new HttpPostClient().sendHttpPostRequest(AppConfig.productsUrl);
        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        Type productListtype = new TypeToken<ArrayList<Products>>(){
        }.getType();
        ArrayList<Products> productsarray = gson.fromJson(s, productListtype);

        ArrayList<Products> products = new ArrayList<>();
        for (int i=0;i<productsarray.size();i++){
            Products p =productsarray.get(i);
            products.add(p);
        }

        productsAdapter = new ProductsAdapter(context, products);
        view.setAdapter(productsAdapter);
        productsAdapter.notifyDataSetChanged();

    }
}

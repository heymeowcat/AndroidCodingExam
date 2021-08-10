package com.example.androidcodingexam.AsyncTasks;

import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

import com.example.androidcodingexam.Entities.User;
import com.example.androidcodingexam.Home;
import com.example.androidcodingexam.utils.AppConfig;
import com.example.androidcodingexam.utils.HttpPostClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;

public class AsyncTaskLogin  extends AsyncTask<String,String,String> {


    private final View view;

    public AsyncTaskLogin(View view) {
        this.view = view;
    }

    @Override
    protected String doInBackground(String... strings) {

        JsonObject jo = new JsonObject();
        jo.addProperty("username",strings[0]);
        jo.addProperty("password",strings[1]);

        String jsonText = jo.toString();

        List<BasicNameValuePair> param = new ArrayList<>();
        param.add(new BasicNameValuePair("loginparams",jsonText));

        String response = new HttpPostClient().sendHttpPostRequest(AppConfig.loginUrl,param);
        return response;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if(s.equals("error")){
            Toast.makeText(view.getContext(), "Username or Password Wrong", Toast.LENGTH_SHORT).show();
        }else {
            Intent intent = new Intent(view.getContext(),Home.class);
            view.getContext().startActivity(intent);
        }


    }
}

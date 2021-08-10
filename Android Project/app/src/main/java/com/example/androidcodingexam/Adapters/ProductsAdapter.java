package com.example.androidcodingexam.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidcodingexam.Entities.Products;
import com.example.androidcodingexam.R;

import java.util.ArrayList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {

    Context context;
    ArrayList<Products> products;

    public ProductsAdapter(Context c, ArrayList<Products> p){
        context =c;
        products= p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.product__layout,viewGroup,false);
        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.productname.setText(products.get(i).getProductname().trim());
        Glide.with(context).load(products.get(i).getProductImgUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView productname;
        ImageView imageView;
        private MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            productname= itemView.findViewById(R.id.productName);
        }
    }
}

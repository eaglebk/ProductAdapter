package com.eagle.com.gridviewcustom.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.BaseAdapter;

import com.eagle.com.gridviewcustom.component.CustomButton;
import com.eagle.com.gridviewcustom.dto.Product;

import java.util.List;
import java.util.Objects;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private List<Product> products;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        this.products = products;
    }

    @Override
    public int getCount(){
        return products.size();
    }

    @Override
    public Object getItem(int position){
        return products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Button button;

        if (convertView == null){
            button = new CustomButton(context);
            button.setText(products.get(position).getName());
        } else {
            button = (CustomButton)convertView;
        }
        button.setId(position);

        return button;

    }
}

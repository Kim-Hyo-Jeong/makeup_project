package com.example.beautygan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class listAdapter_makeup_information extends BaseAdapter {
    Context context;
    ArrayList<list_makeup_information> list_itemArrayList;

    ImageView pr_image;
    TextView pr_brand;
    TextView pr_name;
    TextView pr_price;
    ImageView pr_url;

    public listAdapter_makeup_information(Context context, ArrayList<list_makeup_information> list_itemArrayList) {
        this.context = context;
        this.list_itemArrayList = list_itemArrayList;
    }

    @Override
    public int getCount() {
        return this.list_itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.list_itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.makeup_information, null);
            pr_image = (ImageView) convertView.findViewById(R.id.pr_image);
            pr_brand = (TextView) convertView.findViewById(R.id.pr_brand);
            pr_name = (TextView) convertView.findViewById(R.id.pr_name);
            pr_price = (TextView) convertView.findViewById(R.id.pr_price);
            pr_url = (ImageView) convertView.findViewById(R.id.pr_url);
        }

        pr_image.setImageResource(list_itemArrayList.get(position).get_prImage());
        pr_brand.setText(list_itemArrayList.get(position).get_prBrand());
        pr_name.setText(list_itemArrayList.get(position).get_prName());
        pr_price.setText(list_itemArrayList.get(position).get_prPrice());
        pr_url.setImageResource(list_itemArrayList.get(position).get_prUrl());

        return convertView;
    }
}
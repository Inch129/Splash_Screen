package com.example.splash_screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;
public class MyAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<ItemA> objects = new ArrayList<>(50);

    public MyAdapter(Context context, ArrayList<ItemA> itemA) {
        ctx = context;
        objects = itemA;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Holder h;
        if (view == null) {
            view = lInflater.inflate(R.layout.list_item, parent, false);
            h = new Holder();
            h.title = (TextView)view.findViewById(R.id.textItem);
            view.setTag(h);
        } else {
            h = (Holder)view.getTag();
        }

        h.title.setText(objects.get(position).name);
        return view;
    }

    public static class Holder{
        TextView title;
    }
}

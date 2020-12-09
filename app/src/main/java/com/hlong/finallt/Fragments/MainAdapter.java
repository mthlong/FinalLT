package com.hlong.finallt.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hlong.finallt.R;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String[] food;
    private String[] review1;
    private int[] numberImage;

    public MainAdapter(Context c,String[] food, int[] numberImage, String[] review1) {
        context =c;
        this.food = food;
        this.numberImage = numberImage;
        this.review1=review1;

    }

    @Override
    public int getCount() {
        return review1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_item, null);
        }
        ImageView imageView = convertView.findViewById(R.id.image_view);
        TextView textView = convertView.findViewById(R.id.textView);
        TextView textViewrv1 = convertView.findViewById(R.id.textViewrv1);

        imageView.setImageResource(numberImage[position]);
        textView.setText(food[position]);
        textViewrv1.setText(review1[position]);



        return convertView;
    }
}

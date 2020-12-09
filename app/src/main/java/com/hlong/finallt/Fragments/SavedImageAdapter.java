package com.hlong.finallt.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hlong.finallt.R;

public class SavedImageAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] tittle;
    private String[] des;
    private String[] des2;
    private int[] Image1;

    public SavedImageAdapter(Context c, String[] tittle, String[] des, String[] des2, int[]Image1) {
        context = c;
        this.tittle = tittle;
        this.des = des;
        this.des2 = des2;
        this.Image1 = Image1;
    }

    @Override
    public int getCount() {
        return 3;
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
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_item_saved_image, null);
        }
        ImageView imageView = convertView.findViewById(R.id.image_view_saved_image);

        TextView textView = convertView.findViewById(R.id.tvten);
        TextView textView2 = convertView.findViewById(R.id.tvngay);
        TextView textView3 = convertView.findViewById(R.id.tvanh);

        imageView.setImageResource(Image1[position]);
        textView.setText(tittle[position]);
        textView2.setText(des[position]);
        textView3.setText(des2[position]);

        return convertView;
    }
}

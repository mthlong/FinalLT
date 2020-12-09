package com.hlong.finallt.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hlong.finallt.R;

public class SavedallAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] tittle;
    private String[] des;
    private String [] des2;
    private int[] Image1;
    private int[] Image2;

    public SavedallAdapter(Context c, String[] tittle, String[] des,String[] des2, int[]Image1,int[] Image2) {
        context = c;
        this.tittle = tittle;
        this.des = des;
        this.des2 = des2;
        this.Image1 = Image1;
        this.Image2 = Image2;
    }

    @Override
    public int getCount() {
        return 9;
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
            convertView = inflater.inflate(R.layout.row_item_saved_all, null);
        }
        ImageView imageView = convertView.findViewById(R.id.image_view_saved_all);
        ImageView imageView2 = convertView.findViewById(R.id.image_came_loca);
        TextView textView = convertView.findViewById(R.id.tvten);
        TextView textView2 = convertView.findViewById(R.id.tvdiachi);
        TextView textView3 = convertView.findViewById(R.id.tvluuboi);

        imageView.setImageResource(Image1[position]);
        imageView2.setImageResource(Image2[position]);
        textView.setText(tittle[position]);
        textView2.setText(des[position]);
        textView3.setText(des2[position]);

        return convertView;
    }
}

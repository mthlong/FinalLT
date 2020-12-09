package com.hlong.finallt.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hlong.finallt.R;

public class Fragments3 extends Fragment {
    String[] tittle = {"Hình ảnh", "Hình ảnh", "Hình ảnh"};
    int[] Image1 = {R.drawable.food1,R.drawable.food2,R.drawable.food3};
    String[] des = {"2d","2.5d","1d"};
    String[] des2 = {"ảnh", "ảnh", "ảnh"};
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_s3,container,false);
        gridView = v.findViewById(R.id.gridview_daluu_image);

        SavedImageAdapter adapter = new SavedImageAdapter(getActivity(),tittle,des,des2,Image1);
        gridView.setAdapter(adapter);
        return v;
    }
}

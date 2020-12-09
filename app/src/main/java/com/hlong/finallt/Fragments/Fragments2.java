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

public class Fragments2 extends Fragment {
    String[] tittle = {"Hello Pasta - Beefsteak- Trần Phú","Bánh canh cô Nận - 69 Lý Tự Trọng",
            "Sữa chua nếp cẩm","Quán ốc đặc biết siêu cay trung tâm thành phố","El Naoono Sinh tố trái cây tươi","Chè liên- cơ sở 3 Đà Nẵng"};
    int[] Image1 = {R.drawable.food12,R.drawable.food13,R.drawable.food14,R.drawable.food15,R.drawable.food16,R.drawable.food17};
    String[] des = {"8.1","7.5","8.9","4.5","6.7","7.1"};
    String[] des2 = {"8 Trần Phú, P.4, Quận 5, TP.HCM","09 Đường CMT8 phường Hòa Minh tp.Đà Nẵng","9/21 Văn Đồng, Q5, Tp HCM","345 Nguyễn Văn Linh, tp Đà Nẵng","12/5 Hoàng Thị Loan Q2 tp HCM","Giữa đường Hoàng Văn Thái, Thanh Khê, tp Đà Nẵng"};
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_s2,container,false);
        gridView = v.findViewById(R.id.gridview_daluu_location);

        SavedLocationAdapter adapter = new SavedLocationAdapter(getActivity(),tittle,des2,des,Image1);
        gridView.setAdapter(adapter);
        return v;
    }
}

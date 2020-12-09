package com.hlong.finallt.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hlong.finallt.R;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;

public class Fragments1 extends Fragment {


    String[] tittle = {"Hình ảnh","Hình ảnh","Hình ảnh","Hello Pasta - Beefsteak- Trần Phú","Bánh canh cô Nận - 69 Lý Tự Trọng",
                        "Sữa chua nếp cẩm","Quán ốc đặc biết siêu cay trung tâm thành phố","El Naoono Sinh tố trái cây tươi","Chè liên- cơ sở 3 Đà Nẵng","Chim cút- Xôi xéo nhà hàng Thương Mai"};
    int [] Image1 = {R.drawable.food9,R.drawable.food10,R.drawable.food11,R.drawable.food12,R.drawable.food13,R.drawable.food14,R.drawable.food15,R.drawable.food16,R.drawable.food17,R.drawable.food18};
    int [] Image2 = {R.drawable.ic_camera_red,R.drawable.ic_camera_red,R.drawable.ic_camera_red,R.drawable.ic_location_red,R.drawable.ic_location_red,R.drawable.ic_location_red,R.drawable.ic_location_red,R.drawable.ic_location_red,R.drawable.ic_location_red};
    String [] des = {"Được lưu từ ảnh của Tina Nguyen","Được lưu từ ảnh của Anh Hoàng","Được lưu từ ảnh của Hoàng Long",
            "8 Trần Phú, P.4, Quận 5, TP.HCM","09 Đường CMT8 phường Hòa Minh tp.Đà Nẵng","9/21 Văn Đồng, Q5, Tp HCM","345 Nguyễn Văn Linh, tp Đà Nẵng","12/5 Hoàng Thị Loan Q2 tp HCM","Giữa đường Hoàng Văn Thái, Thanh Khê, tp Đà Nẵng","12 Nguyễn Đức Trung, Q10, tp.HCM"};
    String [] time = {"2d","2.5d","1d","5d","4d","1d","2d","6d","10d","12d"};

    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_s1, container, false);

        gridView = v.findViewById(R.id.gridview_daluu_all);

        SavedallAdapter adapter = new SavedallAdapter(getActivity(),tittle,des,time,Image1,Image2);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"You clicked"+ tittle[+ position], Toast.LENGTH_SHORT).show();
            }
        });
    return v;
    }
}

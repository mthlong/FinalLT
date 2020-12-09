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

public class Fragmentdh3 extends Fragment {
    String[] tittle = {"S Coffee - Đường 3 tháng 2","Cơm chiên 73 - Đệ Nhất Cơm Thố",
            "Ku Shin - Súp thật cẩm & Sâm Rong Biển","Cơm Gà Gia Vĩnh - Hải Phòng","The Pizza Company - Co.op Mart Đà Nẵng","Jolibee - Nguyễn Đức Trung"};
    int[] Image1 = {R.drawable.food19,R.drawable.food20,R.drawable.food21,R.drawable.food22,R.drawable.food23,R.drawable.food24};
    String[] des2 = {"3 Phần - 49,000đ","2 phần - 46,250đ","2 phần - 50,000đ","1 phần - 48,500đ","1 phần - 138,000đ","1 phần - 60,000đ"};
    String[] des = {"7 Đường 3 tháng 2 Quận Hải Châu, Đ...","107 Lý Thái Tông, quận Thanh Khê,...",
                        "K99/38 Thái Thị Bôi, Quận Thanh Khê,...","241 Hải Phòng, Quận Thanh Khê,...","Tầng Trệt Coop Mart 478 Điện Biên Phủ, Đ...","47 Nguyễn Đức Trung, Quận Thanh Khê,tp..."};
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_dh3,container,false);
        gridView = v.findViewById(R.id.gridview_donhang_donnhap);

        DonhangdonnhapAdapter adapter = new DonhangdonnhapAdapter(getActivity(),tittle,des2,des,Image1);
        gridView.setAdapter(adapter);
        return v;
    }
}

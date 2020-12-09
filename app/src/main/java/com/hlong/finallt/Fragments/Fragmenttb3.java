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

public class Fragmenttb3 extends Fragment {
    String[] tittle = {"[DN] [NowTable] Top 10 Quán BBQ - Ưu đãi 40%", "[HCMC, HN, DN] Khảo sát ngay - Nhận mã Freeship!"};
    int[] Image1 = {R.drawable.food1,R.drawable.ic_app_delivery_now};
    String[] des = {"1d","2d"};
    String[] des2 = {"Cuối tuần deal về tới ngay BBC Ủn Ỉn, Bolshevik, Phố nướng Tokyo,... ưu đãi 40% hóa đơn khi đặt bàn trước tại NowTable nha",
            "Now ghi nhận bạn đã có đơn hàng trong vòng 30 ngày gần đây. Hãy chia sẻ cảm nhận của bạn vè Now và có cơ hội nhận mã Freeship 15k nhé!"};
    GridView gridView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_tb3,container,false);
        gridView = v.findViewById(R.id.gridview_thongbao_tinmoi);

        ThongbaoAdapter adapter = new ThongbaoAdapter(getActivity(),tittle,des,des2,Image1);
        gridView.setAdapter(adapter);
        return v;
    }
}

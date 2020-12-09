package com.hlong.finallt.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.hlong.finallt.MainActivity;
import com.hlong.finallt.R;


public class TaikhoanFragment extends Fragment {
    TextView pf_dangxuat,pf_dangnhap, pf_xemhd;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_taikhoan, container, false);

        pf_dangnhap=v.findViewById(R.id.pf_dangnhap);
        pf_xemhd = v.findViewById(R.id.pf_xemhd);
        pf_dangxuat=v.findViewById(R.id.pf_dangxuat);


        pf_xemhd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), EditProfile.class);
                startActivity(intent);
            }
        });
        pf_dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

    }

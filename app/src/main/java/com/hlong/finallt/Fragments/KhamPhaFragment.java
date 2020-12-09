package com.hlong.finallt.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.hlong.finallt.R;


public class KhamPhaFragment extends Fragment implements ViewPager.OnPageChangeListener, RadioGroup.OnCheckedChangeListener{

    ViewPager viewPagerTrangChu;
    RadioButton rbOdau, rbAnGi;
    RadioGroup groupOdauAngi;
    ImageView btt_back;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_khampha, container, false);
        viewPagerTrangChu = (ViewPager) v.findViewById(R.id.viewpager_trangchu);
        rbOdau = (RadioButton) v.findViewById(R.id.rb_odau);
        rbAnGi = (RadioButton) v.findViewById(R.id.rb_angi);
        btt_back=(ImageView) v.findViewById(R.id.btt_back);
        groupOdauAngi = (RadioGroup) v.findViewById(R.id.group_odau_angi);

        btt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        AdapterViewPagerKhamPha adapterViewPagerKhamPha = new AdapterViewPagerKhamPha(getChildFragmentManager());
        viewPagerTrangChu.setAdapter(adapterViewPagerKhamPha);
        viewPagerTrangChu.addOnPageChangeListener(this);
        groupOdauAngi.setOnCheckedChangeListener(this);
        return v;
    }
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:
                rbOdau.setChecked(true);
                break;
            case 1:
                rbAnGi.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb_angi:
                viewPagerTrangChu.setCurrentItem(1);
                break;
            case R.id.rb_odau:
                viewPagerTrangChu.setCurrentItem(0);
                break;
        }
    }
}

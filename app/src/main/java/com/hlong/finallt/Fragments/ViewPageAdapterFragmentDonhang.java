package com.hlong.finallt.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapterFragmentDonhang extends FragmentStatePagerAdapter {

    public ViewPageAdapterFragmentDonhang(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragmentdh1();
            case 1:
                return new Fragmentdh2();
            case 2:
                return new Fragmentdh3();
            default:
                return new Fragmentdh1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Đang đến";
                break;
            case 1:
                title = "Lịch sử";
                break;
            case 2:
                title = "Đơn nháp";
                break;

        }
        return title;
    }
}

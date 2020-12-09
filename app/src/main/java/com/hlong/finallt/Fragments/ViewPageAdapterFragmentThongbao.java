package com.hlong.finallt.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapterFragmentThongbao extends FragmentStatePagerAdapter {

    public ViewPageAdapterFragmentThongbao(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragmenttb1();
            case 1:
                return new Fragmenttb2();
            case 2:
                return new Fragmenttb3();
            default:
                return new Fragmenttb1();
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
                title = "Dịch vụ";
                break;
            case 1:
                title = "Của tôi";
                break;
            case 2:
                title = "Tin mới";
                break;

        }
        return title;
    }
}

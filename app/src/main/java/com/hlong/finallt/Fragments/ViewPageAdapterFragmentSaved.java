package com.hlong.finallt.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapterFragmentSaved extends FragmentStatePagerAdapter {

    public ViewPageAdapterFragmentSaved(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragments1();
            case 1:
                return new Fragments2();
            case 2:
                return new Fragments3();
            case 3:
                return new Fragments4();
            default:
                return new Fragments1();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Tất cả";
                break;
            case 1:
                title = "Địa điểm";
                break;
            case 2:
                title = "Hình ảnh";
                break;
            case 3:
                title = "Bài viết";
                break;
        }
        return title;
    }
}

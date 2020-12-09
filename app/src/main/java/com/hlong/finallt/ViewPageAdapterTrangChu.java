package com.hlong.finallt;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.hlong.finallt.Fragments.DonhangFragment;
import com.hlong.finallt.Fragments.HomeFragment;
import com.hlong.finallt.Fragments.SavedFragment;
import com.hlong.finallt.Fragments.TaikhoanFragment;
import com.hlong.finallt.Fragments.ThongbaoFragment;

public class ViewPageAdapterTrangChu extends FragmentStatePagerAdapter {
    public ViewPageAdapterTrangChu(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SavedFragment();
            case 2:
                return new DonhangFragment();
            case 3:
                return new ThongbaoFragment();
            case 4:
                return new TaikhoanFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}

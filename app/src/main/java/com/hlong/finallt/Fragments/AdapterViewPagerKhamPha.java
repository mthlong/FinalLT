package com.hlong.finallt.Fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AdapterViewPagerKhamPha extends FragmentStatePagerAdapter {
    AngiFragment angiFragment;
    OdauFragment odauFragment;
    public AdapterViewPagerKhamPha(@NonNull FragmentManager fm) {
        super(fm);
        angiFragment = new AngiFragment();
        odauFragment = new OdauFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return odauFragment;
            case 1:
                return angiFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}


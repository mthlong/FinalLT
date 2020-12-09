package com.hlong.finallt.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.hlong.finallt.R;

public class SavedFragment extends Fragment {
    View myFragment;
    private TabLayout mTabLayout;
    private ViewPager mviewPager;

    public SavedFragment(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myFragment = inflater.inflate(R.layout.fragment_saved, container, false);
        mviewPager = myFragment.findViewById(R.id.view_pager_saved);
        mTabLayout = myFragment.findViewById(R.id.tab_layout_saved);
        return myFragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setUpViewPager(mviewPager);
        mTabLayout.setupWithViewPager(mviewPager);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setUpViewPager(ViewPager mviewPager) {
        ViewPageAdapterFragmentSaved viewPageAdapterFragmentSaved = new ViewPageAdapterFragmentSaved(getChildFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mviewPager.setAdapter(viewPageAdapterFragmentSaved);
        mTabLayout.setupWithViewPager(mviewPager);
    }
}

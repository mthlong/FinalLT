package com.hlong.finallt;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;
import com.hlong.finallt.Fragments.DonhangFragment;
import com.hlong.finallt.Fragments.HomeFragment;
import com.hlong.finallt.Fragments.SavedFragment;
import com.hlong.finallt.Fragments.TaikhoanFragment;
import com.hlong.finallt.Fragments.ThongbaoFragment;

public class Navbottom extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager2 viewPager;

    private BottomNavigationView mNavigationView;
    private ViewPager mViewPager;
    NotificationHelper notificationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbottom);



        BottomNavigationView botNav = findViewById(R.id.bottom_navigation);
        botNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_wrapper, new HomeFragment()).commit();


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.ic_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.ic_saved:
                            selectedFragment = new SavedFragment();
                            break;
                        case R.id.ic_profile:
                            selectedFragment = new TaikhoanFragment();
                            break;
                        case R.id.ic_money:
                            selectedFragment = new DonhangFragment();
                            break;
                        case R.id.ic_thongbao:
                            selectedFragment = new ThongbaoFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fl_wrapper, selectedFragment).commit();
                    return true;
                }
            };


    private void setUpViewPager() {
        ViewPageAdapterTrangChu viewPageAdapter = new ViewPageAdapterTrangChu(getSupportFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPageAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                switch (position) {
                    case 0:
                        mNavigationView.getMenu().findItem(R.id.ic_home).setChecked(true);
                        break;
                    case 1:
                        mNavigationView.getMenu().findItem(R.id.ic_saved).setChecked(true);
                        break;
                    case 2:
                        mNavigationView.getMenu().findItem(R.id.ic_money).setChecked(true);
                        break;
                    case 3:
                        mNavigationView.getMenu().findItem(R.id.ic_thongbao).setChecked(true);
                        break;
                    case 4:
                        mNavigationView.getMenu().findItem(R.id.ic_profile).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
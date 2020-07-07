package com.cyt.androidclient.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.cyt.androidclient.R;
import com.cyt.androidclient.adapter.ViewPagerAdapter;
import com.cyt.androidclient.fragment.MeFragment;
import com.cyt.androidclient.fragment.NewsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;
    private ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initData();
    }

    private void initData() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        //fragment关联viewpager
        viewPagerAdapter.addFragment(new NewsFragment());
        viewPagerAdapter.addFragment(new MeFragment());
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setCurrentItem(0);
        //点击 bottomNavigationView，viewpager关联
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab_news:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.tab_me:
                        viewPager.setCurrentItem(1);
                        return true;
                    default:
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            //viewpager滑动关联底部bottomNavigation
            @Override
            public void onPageSelected(int position) {
               bottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void init() {
        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
    }
}

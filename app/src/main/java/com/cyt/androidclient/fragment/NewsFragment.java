package com.cyt.androidclient.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.cyt.androidclient.R;
import com.cyt.androidclient.adapter.TabFragmentAdapter;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> mTabs =new ArrayList<>();
    private View news;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        news = inflater.inflate(R.layout.news_fragment,container,false);
        initView(news);
        initData();
        return news;
    }

    private void initData() {
        tabLayout.removeAllTabs();
        viewPager.removeAllViews();
        if(fragmentList!=null){
            fragmentList.clear();
            mTabs.clear();
        }
        mTabs.add("国内新闻");
        mTabs.add("科技新闻");
        mTabs.add("财经新闻");
        mTabs.add("美女图片");
        mTabs.add("汽车新闻");
        mTabs.add("NBA新闻");
        fragmentList.add(new NationNewsFragment());
        fragmentList.add(new TechnologyNewsFragment());
        fragmentList.add(new FinanceNewsFragment());
        fragmentList.add(new BeautyFragment());
        fragmentList.add(new CarFragment());
        fragmentList.add(new NbaNewsFragment());
        viewPager.setAdapter(new TabFragmentAdapter(getFragmentManager(),fragmentList,mTabs));
        tabLayout.setupWithViewPager(viewPager);
    }

    @SuppressLint("ClickableViewAccessibility")
    private void initView(View home) {
        tabLayout = home.findViewById(R.id.tab_layout);
        viewPager = home.findViewById(R.id.news_view);
    }
}

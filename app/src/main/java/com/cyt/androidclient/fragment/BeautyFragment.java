package com.cyt.androidclient.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cyt.androidclient.R;
import com.cyt.androidclient.adapter.BeautyFragmentAdapter;
import com.cyt.androidclient.bean.Beauty;
import com.cyt.androidclient.bean.Finance;
import com.cyt.androidclient.net.ApiService;
import com.google.gson.GsonBuilder;
import com.scwang.smartrefresh.header.WaveSwipeHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class BeautyFragment extends Fragment {
    private View tabView;
    private BeautyFragmentAdapter beautyFragmentAdapter;
    private List<Beauty.NewslistBean> newslistBeans = new ArrayList<>();
    private RecyclerView recyclerView;
    private SmartRefreshLayout smartRefreshLayout;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tabView = inflater.inflate(R.layout.beauty, container, false);
        recyclerView = tabView.findViewById(R.id.beauty_recycle);
        smartRefreshLayout = tabView.findViewById(R.id.beauty_fresh);
        smartRefreshLayout.setRefreshHeader(new WaveSwipeHeader(getActivity()));
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //刷新清理之前数据
                        newslistBeans.clear();
                        getNetData();
                        beautyFragmentAdapter.notifyDataSetChanged();
                        smartRefreshLayout.finishRefresh(true);//刷新完成
                    }
                }, 3000);
            }
        });
        initData();
        return tabView;
    }

    private void initData() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        beautyFragmentAdapter = new BeautyFragmentAdapter(R.layout.beauty_item,newslistBeans,getActivity());
        recyclerView.setAdapter(beautyFragmentAdapter);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getNetData();
    }

    private void getNetData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.tianapi.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<Beauty> observable = apiService.getBeautyPic("a913d256a6503df14d93f8f170e7f28d","50");
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Beauty>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Beauty beauty) {
                        final List<Beauty.NewslistBean> list = beauty.getNewslist();
                        for (int i = 0; i < list.size(); i++) {
                            Beauty.NewslistBean newslistBean = list.get(i);
                            Beauty.NewslistBean newslistBean1 = new Beauty.NewslistBean();
                            newslistBean1.setPicUrl(newslistBean.getPicUrl());
                            newslistBeans.add(newslistBean1);
                        }
                        beautyFragmentAdapter.notifyDataSetChanged();
                    }
                });
    }
}

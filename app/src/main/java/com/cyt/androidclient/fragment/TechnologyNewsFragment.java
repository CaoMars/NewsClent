package com.cyt.androidclient.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cyt.androidclient.activity.AppleDetailActivity;
import com.cyt.androidclient.R;
import com.cyt.androidclient.adapter.AppleFragmentAdapter;
import com.cyt.androidclient.bean.Apple;
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

public class TechnologyNewsFragment extends Fragment {
    private View tabView;
    AppleFragmentAdapter appleFragmentAdapter;
    private List<Apple.NewslistBean> newslistBeans = new ArrayList<>();
    private RecyclerView recyclerView;
    private SmartRefreshLayout smartRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tabView = inflater.inflate(R.layout.apple_layout, container, false);
        recyclerView = tabView.findViewById(R.id.apple_recycle);
        smartRefreshLayout = tabView.findViewById(R.id.apple_fresh);
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
                        appleFragmentAdapter.notifyDataSetChanged();
                        smartRefreshLayout.finishRefresh(true);//刷新完成
                    }
                }, 3000);
            }
        });
        initData();
        return tabView;
    }

    private void initData() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        appleFragmentAdapter = new AppleFragmentAdapter(R.layout.apple_item, newslistBeans, getActivity());
        recyclerView.setAdapter(appleFragmentAdapter);

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
        Observable<Apple> observable = apiService.getAppleNews("a913d256a6503df14d93f8f170e7f28d","50");
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Apple>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Apple apple) {
                        final List<Apple.NewslistBean> list = apple.getNewslist();
                        for (int i = 0; i < list.size(); i++) {
                            Apple.NewslistBean newslistBean = list.get(i);
                           Apple.NewslistBean newslistBean1 = new Apple.NewslistBean();
                            newslistBean1.setTitle(newslistBean.getTitle());
                            newslistBean1.setCtime(newslistBean.getCtime());
                            newslistBean1.setDescription(newslistBean.getDescription());
                            newslistBean1.setPicUrl(newslistBean.getPicUrl());
                            appleFragmentAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                                    Intent intent = new Intent(getActivity(), AppleDetailActivity.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("nba_url", list.get(position).getUrl());
                                    intent.putExtras(bundle);
                                    getActivity().startActivity(intent);
                                }
                            });
                            newslistBeans.add(newslistBean1);
                        }
                       appleFragmentAdapter.notifyDataSetChanged();
                    }

                });
    }
}

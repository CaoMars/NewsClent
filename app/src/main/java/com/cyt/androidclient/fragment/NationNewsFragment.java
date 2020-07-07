package com.cyt.androidclient.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.cyt.androidclient.R;
import com.cyt.androidclient.activity.FinanceDetailActivity;
import com.cyt.androidclient.activity.NationNewsActivity;
import com.cyt.androidclient.adapter.NationFragmentAdapter;
import com.cyt.androidclient.bean.NationNews;
import com.cyt.androidclient.net.ApiService;
import com.google.gson.GsonBuilder;
import com.scwang.smartrefresh.header.WaveSwipeHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class NationNewsFragment extends Fragment {
    private View tabView;
    private NationFragmentAdapter nationFragmentAdapter;
    private List<NationNews.NewslistBean> newslistBeans = new ArrayList<>();
    private RecyclerView recyclerView;
    private SmartRefreshLayout smartRefreshLayout;
    private Banner banner;
    private ArrayList<Integer> imagePath;
    private ArrayList<String> titles;
    private LinearLayout containers;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tabView = inflater.inflate(R.layout.nation_news, container, false);
        recyclerView = tabView.findViewById(R.id.nation_recycle);
        smartRefreshLayout = tabView.findViewById(R.id.smart_fresh);
        containers = tabView.findViewById(R.id.containers);
        smartRefreshLayout.setRefreshHeader(new WaveSwipeHeader(getActivity()));
        //下拉自动刷新
        smartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull RefreshLayout refreshLayout) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //刷新清理之前数据
                        newslistBeans.clear();
                        getNetData();
                        nationFragmentAdapter.notifyDataSetChanged();
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
        nationFragmentAdapter = new NationFragmentAdapter(R.layout.nation_item, newslistBeans, getActivity());
        //添加头部局
        nationFragmentAdapter.addHeaderView(initBanner());
        recyclerView.setAdapter(nationFragmentAdapter);
    }

    //添加轮播图
    private View initBanner() {
        View customBanner = LayoutInflater.from(getActivity()).inflate(R.layout.custom_banner, containers, false);
        ViewGroup viewGroup = (ViewGroup) customBanner;
        banner = (Banner) viewGroup.getChildAt(0);
        imagePath = new ArrayList<>();
        imagePath.add(R.drawable.pic);
        imagePath.add(R.drawable.pic1);
        imagePath.add(R.drawable.pic2);
        titles = new ArrayList<>();
        titles.add("吃鸡游戏盛大开服");
        titles.add("绿水青山就是金山银山");
        titles.add("SATURDAY SET LIVE");
        banner.setImages(imagePath);
        banner.setBannerTitles(titles);
        banner.setDelayTime(3000);
        banner.setBannerAnimation(Transformer.FlipHorizontal);
        banner.setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                Glide.with(context).load(path).into(imageView);
            }
        });
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR_TITLE);
        banner.start();
        return customBanner;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getNetData();
    }

    //联网请求网络数据
    private void getNetData() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.tianapi.com/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<NationNews> observable = apiService.getNationNews("a913d256a6503df14d93f8f170e7f28d");
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<NationNews>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("cyt", e.getMessage());
                    }

                    @Override
                    public void onNext(NationNews nationNews) {
                        final List<NationNews.NewslistBean> list = nationNews.getNewslist();
                        for (int i = 0; i < list.size(); i++) {
                            NationNews.NewslistBean newslistBean = list.get(i);
                            NationNews.NewslistBean newslistBean1 = new NationNews.NewslistBean();
                            newslistBean1.setTitle(newslistBean.getTitle());
                            newslistBean1.setMtime(newslistBean.getMtime());
                            newslistBean1.setSource(newslistBean.getSource());
                            newslistBean1.setImgsrc(newslistBean.getImgsrc());
                            //点击item跳转到详情页
                            nationFragmentAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
                                @Override
                                public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                                    Intent intent = new Intent(getActivity(), NationNewsActivity.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("nation_url", list.get(position).getUrl());
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                            });
                            newslistBeans.add(newslistBean1);
                        }
                        nationFragmentAdapter.notifyDataSetChanged();
                    }
                });
    }
}

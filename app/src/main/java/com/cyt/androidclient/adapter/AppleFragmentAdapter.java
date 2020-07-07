package com.cyt.androidclient.adapter;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Apple;

import java.util.List;

public class AppleFragmentAdapter extends BaseQuickAdapter<Apple.NewslistBean, BaseViewHolder> {
    private Context context;
    public AppleFragmentAdapter(int layoutResId, @Nullable List<Apple.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Apple.NewslistBean item) {
        //设别列表条目属性
        helper.setText(R.id.apple_title,item.getTitle())
                .setText(R.id.apple_time,item.getCtime())
                .setText(R.id.apple_source,item.getDescription())
                .setText(R.id.apple_url,item.getUrl());
         ;
         //设置加载缩略图
        Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_apple));
    }
}

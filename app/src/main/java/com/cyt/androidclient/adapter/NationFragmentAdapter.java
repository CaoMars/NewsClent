package com.cyt.androidclient.adapter;


import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.NationNews;

import java.util.List;

public class NationFragmentAdapter extends BaseQuickAdapter<NationNews.NewslistBean, BaseViewHolder> {
    private Context context;
    public NationFragmentAdapter(int layoutResId, @Nullable List<NationNews.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, NationNews.NewslistBean item) {
        helper.setText(R.id.tv_title,item.getTitle())
                .setText(R.id.tv_time,item.getMtime())
                .setText(R.id.tv_source,item.getSource());
     Glide.with(context).load(item.getImgsrc()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_nation));
    }
}

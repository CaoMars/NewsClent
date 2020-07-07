package com.cyt.androidclient.adapter;

import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Militery;

import java.util.List;

public class MiliteryFragmentAdapter extends BaseQuickAdapter<Militery.NewslistBean, BaseViewHolder> {
    private Context context;
    public MiliteryFragmentAdapter(int layoutResId, @Nullable List<Militery.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Militery.NewslistBean item) {
        helper.setText(R.id.militery_title,item.getTitle())
                .setText(R.id.militery_time,item.getCtime())
                .setText(R.id.militery_source,item.getDescription());
        Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_militery));
    }
}

package com.cyt.androidclient.adapter;

import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Nba;

import java.util.List;

public class NbaFragmentAdapter extends BaseQuickAdapter<Nba.NewslistBean, BaseViewHolder> {
    private Context context;
    public NbaFragmentAdapter(int layoutResId, @Nullable List<Nba.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Nba.NewslistBean item) {
       helper.setText(R.id.nba_title,item.getTitle())
               .setText(R.id.nba_time,item.getCtime())
               .setText(R.id.nba_source,item.getDescription());
       Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_nba));
    }
}

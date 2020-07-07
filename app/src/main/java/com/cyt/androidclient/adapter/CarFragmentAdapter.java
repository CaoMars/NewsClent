package com.cyt.androidclient.adapter;

import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Car;

import java.util.List;

public class CarFragmentAdapter extends BaseQuickAdapter<Car.NewslistBean, BaseViewHolder> {
    private Context context;

    public CarFragmentAdapter(int layoutResId, @Nullable List<Car.NewslistBean> data, Context context) {
        super(layoutResId, data);
        this.context = context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Car.NewslistBean item) {
        helper.setText(R.id.car_title, item.getTitle())
                .setText(R.id.car_time, item.getCtime())
                .setText(R.id.car_source, item.getDescription());
        Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_car));
    }
}

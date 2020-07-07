package com.cyt.androidclient.adapter;


import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Beauty;


import java.util.List;

public class BeautyFragmentAdapter extends BaseQuickAdapter<Beauty.NewslistBean, BaseViewHolder> {
    private Context context;

    public BeautyFragmentAdapter(int layoutResId, @Nullable List<Beauty.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, Beauty.NewslistBean item) {
        Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).diskCacheStrategy(DiskCacheStrategy.RESOURCE).into((ImageView) helper.getView(R.id.image_beauty));
    }
}

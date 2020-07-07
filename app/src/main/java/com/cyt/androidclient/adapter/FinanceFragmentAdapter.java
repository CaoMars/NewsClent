package com.cyt.androidclient.adapter;


import android.content.Context;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.cyt.androidclient.R;
import com.cyt.androidclient.bean.Finance;
import java.util.List;

public class FinanceFragmentAdapter extends BaseQuickAdapter<Finance.NewslistBean, BaseViewHolder> {
   private Context context;
    public FinanceFragmentAdapter(int layoutResId, @Nullable List<Finance.NewslistBean> data,Context context) {
        super(layoutResId, data);
        this.context =context;
    }

    @Override
    protected void convert(BaseViewHolder helper, Finance.NewslistBean item) {
        helper.setText(R.id.title_finance,item.getTitle())
                .setText(R.id.finance_time,item.getCtime())
                .setText(R.id.tv_description,item.getDescription());
        Glide.with(context).load(item.getPicUrl()).error(R.mipmap.place).into((ImageView) helper.getView(R.id.image_finance));
    }


}

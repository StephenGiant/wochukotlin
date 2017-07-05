package com.wicture.wochu.business.main.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wicture.com.wochu.business.BaseViewHolder
import com.wicture.com.wochu.business.MyBaseAdapter
import com.wicture.wochu.R
import com.wicture.wochu.data.index.BannerData

/**
 * Created by Administrator on 2017/6/30.
 */
class IconsAdapter :MyBaseAdapter<BannerData.RecommendedContentBean.ItemsBean,BaseViewHolder>{

    constructor(activity: Activity, data: MutableList<BannerData.RecommendedContentBean.ItemsBean>) : super(activity, data)

    override fun bindItemData(holder: BaseViewHolder, data: BannerData.RecommendedContentBean.ItemsBean, position: Int) {

        holder.setNetImage(mActivity,R.id.iv_icon_index,data.imgUrl)
        holder.setText("",R.id.tv_icondes)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(mActivity).inflate(R.layout.item_indexicon, parent, false)
        return BaseViewHolder(view)
    }


}
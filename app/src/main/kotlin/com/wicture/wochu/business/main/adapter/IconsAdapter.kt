package com.wicture.wochu.business.main.adapter

import android.app.Activity
import android.view.ViewGroup
import com.wicture.com.wochu.business.BaseViewHolder
import com.wicture.com.wochu.business.MyBaseAdapter
import com.wicture.wochu.data.index.BannerData

/**
 * Created by Administrator on 2017/6/30.
 */
class IconsAdapter :MyBaseAdapter<BannerData.RecommendedContentBean,BaseViewHolder>{

    constructor(activity: Activity, data: MutableList<BannerData.RecommendedContentBean>) : super(activity, data)

    override fun bindItemData(holder: BaseViewHolder, data: BannerData.RecommendedContentBean, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
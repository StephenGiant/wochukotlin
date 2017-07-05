package com.wicture.wochu.business.main.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wicture.com.wochu.business.BaseViewHolder
import com.wicture.com.wochu.business.MyBaseAdapter
import com.wicture.wochu.R
import com.wicture.wochu.data.index.MainData
import com.wicture.wochu.extension.ToastText

/**
 * Created by Administrator on 2017/7/1.
 */
class HotsalesAdapter :MyBaseAdapter<MainData.ItemsBean,BaseViewHolder>{

    constructor(activity: Activity, data: MutableList<MainData.ItemsBean>) : super(activity, data)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
      return BaseViewHolder(LayoutInflater.from(mActivity).inflate(R.layout.item_indexhuojia,parent,false))
    }

    override fun bindItemData(holder: BaseViewHolder, data: MainData.ItemsBean, position: Int) {
       holder.setNetImage_Middle(mActivity,R.id.iv_item_hotsales,data.imgUrl)
        holder.setText(data.goodsName,R.id.tv_item)
        holder.itemView.setOnClickListener { view->
            mActivity.ToastText(data.goodsName)
        }
    }
}
package com.wicture.wochukotlin.items.business

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.wicture.com.wochukotlin.business.MyBaseAdapter
import com.wicture.wochukotlin.R
import com.wicture.wochukotlin.data.Category
import java.util.List

/**
 * Created by qianpeng on 2017/6/9.
 */
class RootCategoryAdapter : MyBaseAdapter<Category, RootCategoryAdapter.CategoryViewHolder> {
    constructor(activity: Activity, data: List<Category>) : super(activity, data)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(mActivity).inflate(R.layout.item_category, parent, false) as View
        return CategoryViewHolder(view)
    }

    override fun bindItemData(holder: CategoryViewHolder, data: Category, position: Int) {
     holder.tv_name.text = data.name
        holder.tv_url.text = data.iconList[0].url
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

     val tv_name = (itemView.findViewById(R.id.tv_name)) as TextView
        val tv_url = itemView.findViewById(R.id.icon_url) as TextView
    }
}
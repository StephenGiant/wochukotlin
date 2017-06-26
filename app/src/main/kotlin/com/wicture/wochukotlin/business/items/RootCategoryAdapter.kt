package com.wicture.wochukotlin.items.business

import android.app.Activity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import butterknife.bindView
import com.bumptech.glide.Glide
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
        try {


        Glide.with(mActivity).load(data.iconList[0].url).asBitmap().into(holder.tv_url)
        }catch (e :Exception){
            e.printStackTrace()
        }
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_name:TextView  by bindView(R.id.tv_name)
        val tv_url :ImageView by bindView(R.id.icon_url)
    }
}
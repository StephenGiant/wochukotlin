package com.wicture.com.wochu.business

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.wicture.wochu.utils.GlideUtil


/**
 * 方便使用的viewholder，可以继承，可以直接用
 * Created by qianpeng on 2017/6/8.
 */
open class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    /**
     * 添加网络图片
     */
    fun setNetImage(context:Context,resoures:Int,url:String){
    try {

    val imageView = itemView!!.findViewById(resoures) as? ImageView
    GlideUtil.setImgFromNet(context,url,imageView!!)

    }catch (exception :KotlinNullPointerException){
        exception.printStackTrace()
    }
    }

    /**
     * 添加网络图片
     */
    fun setNetImage(context:Context,resoures:Int,url:String,placeHolder:Int){
        try {

            val imageView = itemView!!.findViewById(resoures) as? ImageView
            GlideUtil.setImgFromNet(context,url,imageView!!,placeHolder)

        }catch (exception :KotlinNullPointerException){
            exception.printStackTrace()
        }
    }
    fun setNetImage_Large(context:Context,resoures:Int,url:String){
        try {

            val imageView = itemView!!.findViewById(resoures) as? ImageView
            GlideUtil.setLargeImgFromNet(context,url,imageView!!)

        }catch (exception :KotlinNullPointerException){
            exception.printStackTrace()
        }
    }
    fun setNetImage_Middle(context:Context,resoures:Int,url:String){
        try {

            val imageView = itemView!!.findViewById(resoures) as? ImageView
            GlideUtil.setMiddleImgFromNet(context,url,imageView!!)

        }catch (exception :KotlinNullPointerException){
            exception.printStackTrace()
        }
    }
    fun setText(text:String,resoures: Int){
        val textView = itemView!!.findViewById(resoures) as TextView
        textView.text = text
    }
    fun setText(activity:Activity,text:String,resoures: Int,format:Int){
        val textView = itemView!!.findViewById(resoures) as TextView
        val text_format = String.format(activity.getString(format),text)
        textView.text = text_format
    }
}
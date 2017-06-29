package com.wicture.wochu.data



/**
 * Created by qianpeng on 2017/6/8.
 */
data class Category(var name:String,var iconList:List<IconDetail>) {
    data class IconDetail(var url: String){

    }
}
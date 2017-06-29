package com.wicture.wochu.business.main.fragment

import com.wicture.wochu.base.BaseViewModel
import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.extension.decodeJson
import org.json.JSONObject



/**
 * 在此处处理数据
 * Created by qianpeng on 2017/6/29.
 */
class IndexViewModel(val fragment: IndexFragment) : BaseViewModel() {
init {
    loadData()
}

    /**
     * 加载数据
     */
    fun loadData() {
        val jsonObject = JSONObject()
        serviceApi.getDataFromNet(ApiConfig.URL_ACTSAMEND, jsonObject).doOnSubscribe {
            println("开始啦")
        }.decodeJson().subscribe({
            data ->
            println("结束啦")
            println(data.toString())
        }, {
            error ->
            error.printStackTrace()
        }
        )
    }
}
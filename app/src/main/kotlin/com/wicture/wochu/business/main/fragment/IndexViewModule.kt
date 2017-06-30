package com.wicture.wochu.business.main.fragment

import com.google.gson.Gson
import com.wicture.wochu.base.BaseViewModel
import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.data.index.BannerData
import com.wicture.wochu.data.index.MainData
import com.wicture.wochu.extension.decodeJson
import org.json.JSONObject


/**
 * 在此处处理数据
 * Created by qianpeng on 2017/6/29.
 */
class IndexViewModel(val listener: IndexDataListenner) : BaseViewModel() {


    /**
     * 加载数据
     */
    fun loadData() {
        val jsonObject = JSONObject()
        jsonObject.put("version","4.9.2");
        jsonObject.put("source","A");
        getMainData(jsonObject)
        getTopData(jsonObject)


    }

    /**
     * 获取促销信息
     */
    fun getTopData(jsonObject: JSONObject){
        serviceApi.getDataFromNet(ApiConfig.URL_ACTSAMEND, jsonObject).doOnSubscribe {
            println("开始啦")
        }.doOnComplete({
            println("结束")
        }).decodeJson().subscribe({
            data ->
            println("结束啦")
            val mainData = Gson().fromJson(data, MainData::class.java)

            listener.onMainDataLoad(mainData.acts )
            println(data.toString())
        }, {
            error ->
            error.printStackTrace()
        }
        )
    }

    /**
     * 获取轮播图以及icon信息
     */
    fun getMainData(jsonObject: JSONObject){
        serviceApi.getAPPDataFromNet(ApiConfig.URL_GET_APP_LAYOUT_AMEND,jsonObject).doOnSubscribe { println("开始了") }
                .doOnComplete{
                    println("结束啦")
                }.decodeJson().subscribe ({
            data ->
            val bannerData =   Gson().fromJson(data,BannerData::class.java)
            listener.onTopDataGet(bannerData)

        },{
            error->
            error.printStackTrace()
        }
        )
    }

    /**
     * 获取用户信息
     */
    fun getAccountData(){

    }
   public interface IndexDataListenner{
       fun onMainDataLoad(datas:MutableList<MainData.ActsBean>)
       fun onTopDataGet(bannerData: BannerData)
    }
}
package com.wicture.wochukotlin.net

import com.google.gson.JsonObject
import com.wicture.wochukotlin.config.ApiConfig
import io.reactivex.Observable
import org.json.JSONObject
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by qianpeng on 2017/6/26.
 */
interface CartApi {
    /**
     * 包含了几个购物车操作
     */
    @GET(ApiConfig.URLCART+"{url}")
    fun getCartList(@Path ("url")url:String,@Query("parameters")json:JSONObject) :Observable<JsonObject>


}
package com.wicture.wochukotlin.net

import com.wicture.wochukotlin.config.ApiConfig
import com.wicture.wochukotlin.data.BaseData
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Administrator on 2017/6/26.
 */
interface CartApi {

    @GET(ApiConfig.URL_CART_LIST)
    fun getCartList() :Observable<BaseData<String>>
}
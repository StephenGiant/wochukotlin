package com.wicture.wochukotlin

import android.app.Application
import com.wicture.wochukotlin.di.ApiComponent
import com.wicture.wochukotlin.di.ApiModule
import com.wicture.wochukotlin.di.DaggerApiComponent
import com.wicture.wochukotlin.net.RetrofitHelper

/**
 * Created by qianpeng on 2017/6/21.
 */
class WochuApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        serviceComponent = DaggerApiComponent.builder().apiModule(ApiModule(RetrofitHelper().retrofit_raw_serverhost())).build()
    }

    private lateinit var serviceComponent:ApiComponent

    fun getApiComponent():ApiComponent = serviceComponent

}
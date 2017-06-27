package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.net.CartApi
import com.wicture.wochukotlin.net.RetrofitHelper
import com.wicture.wochukotlin.net.ServiceApi
import dagger.Module
import dagger.Provides

/**
 * Created by qianpeng on 2017/6/22.
 */
@Module
class ApiModule (){
    @Provides
    fun provideServiceApi()= RetrofitHelper().retrofit_raw_serverhost().create(ServiceApi::class.java)

}
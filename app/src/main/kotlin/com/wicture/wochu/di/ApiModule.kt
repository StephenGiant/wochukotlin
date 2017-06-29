package com.wicture.wochu.di

import com.wicture.wochu.net.CartApi
import com.wicture.wochu.net.RetrofitHelper
import com.wicture.wochu.net.ServiceApi
import dagger.Module
import dagger.Provides

/**
 * Created by qianpeng on 2017/6/22.
 */
@Module
class ApiModule (){

    @Provides
    fun provideServiceApi()= RetrofitHelper().retrofit_withToken().create(ServiceApi::class.java)

    @Provides
    fun provideCartApi()= RetrofitHelper().retrofit_withToken_cart().create(CartApi::class.java)
}
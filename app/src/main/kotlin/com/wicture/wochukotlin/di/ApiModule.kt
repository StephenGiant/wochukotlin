package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.net.ServiceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by qianpeng on 2017/6/22.
 */
@Module
class ApiModule (val retrofit: Retrofit){
    @Provides
    fun provideServiceApi()= retrofit.create(ServiceApi::class.java)
//    @Provides
//    fun provideCartApi() = retrofit.create(CartApi::class.java)
}
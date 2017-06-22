package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.net.ServiceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Administrator on 2017/6/22.
 */
@Module
class ApiModule (val retrofit: Retrofit){
    @Provides
    fun provideApi()= retrofit.create(ServiceApi::class.java)
}
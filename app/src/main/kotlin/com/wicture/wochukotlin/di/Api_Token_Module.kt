package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.net.CartApi
import com.wicture.wochukotlin.net.RetrofitHelper
import dagger.Module
import dagger.Provides

/**
 * Created by Administrator on 2017/6/27.
 */
@Module
class Api_Token_Module(var token:String) {
    @Provides
    fun provideCartApi()= RetrofitHelper().retrofit_withToken(token).create(CartApi::class.java)

}
package com.wicture.wochukotlin.net


import com.wicture.wochukotlin.config.ApiConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by qianpeng on 2017/6/6.
 * 网络请求基本模型
 */
class RetrofitHelper {

    fun okhttp_raw_client(): OkHttpClient{
        val okhttpClient = OkHttpClient.Builder().addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()
         return okhttpClient
    }
    fun okhttp_with_token(token: String):OkHttpClient=
            OkHttpClient.Builder().addNetworkInterceptor(HttpLoggingInterceptor().
                    setLevel(HttpLoggingInterceptor.Level.BODY)).addNetworkInterceptor(TokenInterceptor(token)).
                    connectTimeout(20,TimeUnit.SECONDS).
                    readTimeout(20,TimeUnit.SECONDS).build()
    fun okhttp_json_client(): OkHttpClient =
        OkHttpClient.Builder().addNetworkInterceptor(HttpLoggingInterceptor().
                setLevel(HttpLoggingInterceptor.Level.BODY)).connectTimeout(20,TimeUnit.SECONDS).
                readTimeout(20,TimeUnit.SECONDS).build()
    fun retrofit_raw_serverhost ():Retrofit = Retrofit.Builder().
            baseUrl(ApiConfig.SERVER_HOST).client(okhttp_raw_client()). addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
            build()

    fun retrofit_withToken(token:String) = Retrofit.Builder().
            baseUrl(ApiConfig.SERVER_HOST).client(okhttp_with_token(token)). addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).
            build()


}
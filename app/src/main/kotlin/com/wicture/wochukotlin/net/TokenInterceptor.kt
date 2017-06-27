package com.wicture.wochukotlin.net

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by Administrator on 2017/6/27.
 */
class TokenInterceptor(var token:String) :Interceptor{


    override fun intercept(chain: Interceptor.Chain?): Response {
        val requestOrigin = chain!!.request()
        val headersOrigin = requestOrigin.headers()
        val headers = headersOrigin.newBuilder().set("authorization", "Bearer "+token).build()
        val request = requestOrigin.newBuilder().headers(headers).build()
        val response = chain.proceed(request)
//        requestOrigin.newBuilder().addHeader("authorization","Bearer "+token)
        return response
    }
}
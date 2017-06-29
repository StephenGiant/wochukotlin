package com.wicture.wochu.net

import com.wicture.wochu.WochuApplication
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

/**
 * Created by Administrator on 2017/6/27.
 */
class TokenInterceptor() :Interceptor{


    override fun intercept(chain: Interceptor.Chain?): Response {

        val requestOrigin = chain!!.request()
        val headersOrigin = requestOrigin.headers()
        var request:Request
            try {var token = WochuApplication.instance().token
                val headers = headersOrigin.newBuilder().set("authorization", "Bearer " + token!!).build()
                request = requestOrigin.newBuilder().headers(headers).build()
            }catch (e:UninitializedPropertyAccessException ){
                request = requestOrigin.newBuilder().headers(headersOrigin).build()
            }





        val response = chain.proceed(request)
//        requestOrigin.newBuilder().addHeader("authorization","Bearer "+token)
        return response
    }
}
package com.wicture.wochu.net

import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.data.BaseData
import com.wicture.wochu.data.account.LoginResponse
import com.wicture.wochu.data.account.RegistResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * 处理登陆注册，此处默认不用token
 * Created by qianpeng on 2017/6/27.
 */
interface AccountApi {

    /**
     * 登陆
     */
    @POST(ApiConfig.URL_LOGIN)
    fun loginAccount(@Body body:okhttp3.RequestBody): Observable<LoginResponse>

    /**
     * 注册
     */
    @POST(ApiConfig.URL_REGISTER)
    fun registAccount(@Body body: Body): Observable<BaseData<RegistResponse>>
}
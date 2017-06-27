package com.wicture.wochukotlin.net

import com.wicture.wochukotlin.config.ApiConfig
import com.wicture.wochukotlin.data.BaseData
import com.wicture.wochukotlin.data.account.LoginResponse
import com.wicture.wochukotlin.data.account.RegistResponse
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
package com.wicture.wochukotlin.net



import com.wicture.wochukotlin.config.ApiConfig
import com.wicture.wochukotlin.data.BaseData
import com.wicture.wochukotlin.data.Category
import com.wicture.wochukotlin.data.account.LoginResponse
import com.wicture.wochukotlin.data.account.RegistResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import java.util.List

/**
 * Created by qianpeng on 2017/6/6.
 */
interface ServiceApi {
    /**
     * 获取一级分类
     */
    @GET(ApiConfig.URL_CATEGORY_LIST)
    fun getCateGory(@Query("parameters")parameters: String):Observable<BaseData<List<Category>>>

    /**
     * 登陆
     */
    @POST(ApiConfig.URL_LOGIN)
    fun loginAccount(@Body body:okhttp3.RequestBody):Observable<LoginResponse>

    /**
     * 注册
     */
    @POST(ApiConfig.URL_REGISTER)
    fun registAccount(@Body body: Body):Observable<BaseData<RegistResponse>>
}
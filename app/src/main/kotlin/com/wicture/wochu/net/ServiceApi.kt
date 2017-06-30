package com.wicture.wochu.net



import com.google.gson.JsonObject
import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.data.BaseData
import com.wicture.wochu.data.account.LoginResponse
import com.wicture.wochu.data.account.RegistResponse
import io.reactivex.Observable
import org.json.JSONObject
import retrofit2.http.*

/**
 * Created by qianpeng on 2017/6/6.
 * 包含不需要登陆，获取数据的接口
 */
interface ServiceApi {
    /**
     * 获取分类
     * 使用说明：输入url和请求参数，然后自行封装响应
     */
    @GET(ApiConfig.URL_DIR+"{url}")
    fun getDataFromNet(@Path("url")url :String,@Query("parameters")parameters: JSONObject):Observable<BaseData<JsonObject>>
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
    /**
     * 获取分类
     * 使用说明：输入url和请求参数，然后自行封装响应
     */
    @GET(ApiConfig.URL_DIR+ApiConfig.URL_APP+"{url}")
    fun getAPPDataFromNet(@Path("url")url :String,@Query("parameters")parameters: JSONObject):Observable<BaseData<JsonObject>>


}
package com.wicture.wochukotlin.net



import com.wicture.wochukotlin.config.ApiConfig
import com.wicture.wochukotlin.data.BaseData
import com.wicture.wochukotlin.data.Category
import io.reactivex.Observable
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.List

/**
 * Created by Administrator on 2017/6/6.
 */
interface ServiceApi {
    @GET(ApiConfig.URL_CATEGORY_LIST)
    fun getCateGory(@Query("parameters")parameters: String):Observable<BaseData<List<Category>>>
}
package com.wicture.wochu.base

import android.databinding.BaseObservable
import com.wicture.wochu.WochuApplication
import com.wicture.wochu.net.CartApi
import com.wicture.wochu.net.ServiceApi
import javax.inject.Inject

/**
 * 基础viewmodel，处理数据与界面交互
 * Created by qianpeng on 2017/6/23.
 */
open class BaseViewModel : BaseObservable() {
    @Inject
    lateinit var serviceApi: ServiceApi
    @Inject
    lateinit var cartApi:CartApi
    init {
        WochuApplication.instance().getApiComponent().inject(this)
    }
}
package com.wicture.wochu.base

import com.wicture.wochu.WochuApplication


/**
 * Created by qianpeng on 2017/6/5.
 */
abstract class BaseActivity  : android.support.v7.app.AppCompatActivity() {


    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        WochuApplication.instance().getApiComponent().inject(this)
        initView(savedInstanceState)
    }
    abstract fun initView(savedInstanceState: android.os.Bundle?)

}
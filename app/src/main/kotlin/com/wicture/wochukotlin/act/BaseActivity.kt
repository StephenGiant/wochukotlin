package com.wicture.wochukotlin.act

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


/**
 * Created by qianpeng on 2017/6/5.
 */
abstract class BaseActivity  : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView(savedInstanceState)
    }
    abstract fun initView(savedInstanceState: Bundle?)

}
package com.wicture.wochu.base

import android.support.v4.app.Fragment

/**
 * Created by Administrator on 2017/6/28.
 */
abstract class BaseFragment : Fragment(){
    init {
        initData()
    }
    abstract fun initData()
}
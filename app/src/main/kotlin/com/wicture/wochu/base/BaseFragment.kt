package com.wicture.wochu.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

/**
 * Created by Administrator on 2017/6/28.
 */
abstract class BaseFragment : Fragment(){
    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initData()
    }
    abstract fun initData()
}
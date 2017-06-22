package com.wicture.wochukotlin.business.items

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import butterknife.bindView
import com.wicture.wochukotlin.R
import com.wicture.wochukotlin.act.BaseActivity

/**
 * Created by qianpeng on 2017/6/21.
 */
class CateGoryAct :BaseActivity {
    val rv_firstCategory :RecyclerView by bindView(R.id.rv_firstCategory)
    val rv_secondCategor :RecyclerView by bindView(R.id.rv_secondCategory)
    constructor() : super()

    override fun initView(savedInstanceState: Bundle?) {
       setContentView(R.layout.category_layout)

    }
}
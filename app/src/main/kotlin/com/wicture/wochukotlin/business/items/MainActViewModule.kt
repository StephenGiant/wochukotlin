package com.wicture.wochukotlin.business.items

import com.wicture.wochukotlin.R
import com.wicture.wochukotlin.act.MainAct

/**
 * Created by qianpeng on 2017/6/22.
 */
class MainActViewModule(mainAct:MainAct) {
    //首页的viewmodule

    init {
        mainAct.setContentView(R.layout.activity_scrolling)

    }
}
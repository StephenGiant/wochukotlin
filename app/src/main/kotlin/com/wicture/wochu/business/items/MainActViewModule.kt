package com.wicture.wochu.business.items

import com.wicture.wochu.R
import com.wicture.wochu.business.main.MainAct

/**
 * Created by qianpeng on 2017/6/22.
 */
class MainActViewModule(mainAct: MainAct) {
    //首页的viewmodule

    init {
        mainAct.setContentView(R.layout.activity_scrolling)

    }
}
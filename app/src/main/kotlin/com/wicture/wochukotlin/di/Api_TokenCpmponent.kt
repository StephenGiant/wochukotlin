package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.act.MainAct
import dagger.Component

/**
 * Created by Administrator on 2017/6/27.
 */
@Component(modules = arrayOf(Api_Token_Module::class))
interface Api_TokenCpmponent {
    fun inject (mainAct: MainAct)
}
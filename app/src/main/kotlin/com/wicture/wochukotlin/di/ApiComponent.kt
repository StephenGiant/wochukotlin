package com.wicture.wochukotlin.di

import com.wicture.wochukotlin.act.MainAct
import com.wicture.wochukotlin.act.TestAct
import dagger.Component

/**
 * Created by Administrator on 2017/6/22.
 */
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent {


    fun inject (testAct: TestAct)
}
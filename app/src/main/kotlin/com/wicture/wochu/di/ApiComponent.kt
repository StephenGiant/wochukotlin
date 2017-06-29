package com.wicture.wochu.di

import com.wicture.wochu.business.login.LoginAct
import com.wicture.wochu.base.BaseActivity
import com.wicture.wochu.base.BaseViewModel
import com.wicture.wochu.business.main.MainAct
import dagger.Component

/**
 * Created by Administrator on 2017/6/22.
 */
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent {

    fun inject(baseViewModel: BaseViewModel)
    fun inject (testAct: LoginAct)
    fun inject (mainAct: MainAct)
    fun inject (baseActivity: BaseActivity)
}
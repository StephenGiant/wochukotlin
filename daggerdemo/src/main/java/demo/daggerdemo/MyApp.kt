package demo.daggerdemo

import android.app.Application
import demo.daggerdemo.di.AppComponent
import demo.daggerdemo.di.AppModule
import demo.daggerdemo.di.DaggerAppComponent

/**
 * Created by qianpeng on 2017/6/21.
 */
class MyApp : Application() {
    val component: AppComponent by lazy {
        DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
        override fun onCreate() {
                super.onCreate()
                component.inject(this)
        }
}
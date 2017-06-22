package demo.daggerdemo.di

import dagger.Component
import demo.daggerdemo.MyApp
import javax.inject.Singleton

/**
 * Created by Administrator on 2017/6/21.
 */
@Singleton
@Component (modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app:MyApp)
}
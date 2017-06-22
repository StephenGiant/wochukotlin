package demo.daggerdemo.di

import dagger.Module
import dagger.Provides
import demo.daggerdemo.MyApp
import javax.inject.Singleton

/**
 * Created by Administrator on 2017/6/21.
 */
@Module class AppModule(val app:MyApp) {
@Provides @Singleton fun provideApp()=app
}
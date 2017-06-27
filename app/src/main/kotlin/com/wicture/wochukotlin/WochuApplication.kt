package com.wicture.wochukotlin

import android.app.Application
import com.wicture.wochukotlin.di.*

/**
 * Created by qianpeng on 2017/6/21.
 */
class WochuApplication :Application(){

    companion object {
        private var instance: WochuApplication? = null
        fun instance() = instance!!
    }
    private lateinit var serviceComponent:ApiComponent
     lateinit var token :String
//    private lateinit var loginComponent:LoginComponent
    override fun onCreate() {
        instance = this
        super.onCreate()
    serviceComponent = DaggerApiComponent.builder().apiModule(ApiModule()).build()


    }
    fun getApiComponent():ApiComponent = serviceComponent

    fun getApi_TokenComponent(token:String)=
        DaggerApi_TokenCpmponent.builder().api_Token_Module(Api_Token_Module(token)).build()


    /**
     * 初始化sdk操作
     */
    fun initSdks(){
//        GrowingIO.startWithConfiguration(this, Configuration().useID().trackAllFragments().setChannel("我厨"))
//
//        //talkingdata ad
//        TalkingDataAppCpa.init(this.applicationContext, TalkingData.ADTRACKING_APPID, TalkingData.ADTRACKING_CHANNED_ID)
//
//        //talkingdata ad
//        //防止debug模式的时候报错
//        if (WalleChannelReader.getChannel(this.applicationContext) != null) {
//            TCAgent.init(this, "272BD802513EB2A8FCBD34A39B44944A", WalleChannelReader.getChannel(this.applicationContext))
//        } else {
//            TCAgent.init(this, "272BD802513EB2A8FCBD34A39B44944A", "wochu")
//
//        }
//        TCAgent.setReportUncaughtExceptions(true)
//        TrackingIO.initWithKeyAndChannelId(applicationContext, "1431099b73438d4b5abd13a4e167dc4c", WalleChannelReader.getChannel(this.applicationContext))
    }

}
package com.wicture.wochu.data

/**
 * Created by Administrator on 2017/6/8.
 */
class BaseData<T> (var hasError:Boolean,var errorCode:String ,var statusCode:String
,var errorMessage:String ,var data:T){

}
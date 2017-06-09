package demo.wicture.com.wochukotlin.data

/**
 * Created by Administrator on 2017/6/8.
 */
class BaseData<T> (val hasError:Boolean,val errorCode:String ,val statusCode:String
,val errorMessage:String ,val data:T){

}
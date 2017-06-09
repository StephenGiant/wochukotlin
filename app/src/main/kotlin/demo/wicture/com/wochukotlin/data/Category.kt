package demo.wicture.com.wochukotlin.data



/**
 * Created by Administrator on 2017/6/8.
 */
data class Category(val name:String,val iconList:List<IconDetail>) {
    data class IconDetail(val url: String){

    }
}
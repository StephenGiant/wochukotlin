package com.wicture.com.wochukotlin.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import com.wicture.com.wochukotlin.data.ShippingDate
import com.wicture.wochukotlin.R
import java.util.zip.Inflater

/**
 * Created by qianpeng on 2017/6/13.
 */
class ExpandTabView :LinearLayout ,PopupWindow.OnDismissListener{
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)
    var width:Int?
    var height:Int?
init {
    //构造方法调用后调用
     width = (context as Activity).windowManager.defaultDisplay.width as Int
    height = (context as Activity).windowManager.defaultDisplay.height as Int
    orientation = LinearLayout.HORIZONTAL //横向排列
}
    override fun onDismiss() {
        val shippingDate = ShippingDate("", "", "", false, false, "")


    }

    fun setValue( textArray:List<ShippingDate>){
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        for (index in 0..textArray.size - 1){
            addView((inflater.inflate(R.layout.item_category,null)as LinearLayout).getChildAt(0) )
        }
    }
}
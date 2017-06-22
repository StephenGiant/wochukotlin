package com.wicture.wochukotlin.view

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.RelativeLayout
import com.wicture.com.wochukotlin.data.ShippingDate
import com.wicture.wochukotlin.R

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
    private val SMALL = 0

init {
    //构造方法调用后调用
     width = (context as Activity).windowManager.defaultDisplay.width as Int
    height = (context as Activity).windowManager.defaultDisplay.height as Int

    orientation = LinearLayout.HORIZONTAL //横向排列

}

    override fun onDismiss() {
        val shippingDate = ShippingDate("", "", "", false, false, "")


    }

    fun setValue( textArray:List<ShippingDate>,viewArray:List<View>){
        var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        for (index in 0..viewArray.size - 1){
            val relativeLayout = RelativeLayout(context)
            addView((inflater.inflate(R.layout.item_category,null)as LinearLayout).getChildAt(0) )
           val maxHeight = height!!*0.7 as Int
            var  rl:RelativeLayout.LayoutParams
             rl = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, maxHeight)
                relativeLayout.addView(viewArray[index],rl)
            val view = inflater.inflate(R.layout.item_togglebutton, this, false)
        }

    }
    private fun startAnimation(){

    }

}
package com.wicture.wochu.view

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.ToggleButton

/**
 * Created by qianpeng on 2017/6/13.
 */
class DrawableCenterToggleButton :ToggleButton{
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?) : super(context)

    override fun onDraw(canvas: Canvas?) {
        val drawable = compoundDrawables[2]
        if(drawable!=null){
            var textWidth:Float?
            if (text.toString().indexOf("\n") != -1) {
                val newStr = text.toString().substring(0, text.toString().lastIndexOf("\n"))
                val newEnd = text.toString().substring(text.toString().indexOf("\n") + 1, text.toString().length)
                //测量宽度，以最长的那行包裹为准
                if (newStr.length >= newEnd.length)
                    textWidth = paint.measureText(newStr)
                else
                    textWidth = paint.measureText(newEnd)
            } else {
                textWidth = paint.measureText(text.toString())
            }
            val drawablePadding = compoundDrawablePadding
            val drawableWidth = drawable.intrinsicWidth;
            val bodyWidth = textWidth + drawableWidth.toFloat() + drawablePadding.toFloat()
            setPadding(0, 0, (width - bodyWidth).toInt(), 0)
            canvas!!.translate((width - bodyWidth) / 2, 0f)
        }

        super.onDraw(canvas)

    }
}
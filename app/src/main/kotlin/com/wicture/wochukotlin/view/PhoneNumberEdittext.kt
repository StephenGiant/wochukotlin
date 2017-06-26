package com.wicture.wochukotlin.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.support.v7.widget.AppCompatEditText
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import com.wicture.wochukotlin.R



/**
 * Created by qianpeng on 2017/6/26.
 */
class PhoneNumberEdittext :AppCompatEditText{
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    var drawable:Drawable
    init {
        drawable = context.resources.getDrawable(R.drawable.ic_close)
        addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(e: Editable?) {
               setDrawable()


            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                setReget(s!!)
            }
        })
    }
    fun setDrawable (){
        if(length()>1) {
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null)
        }else{
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
        }
    }

    // 处理删除事件
    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (drawable != null && event.action == MotionEvent.ACTION_UP) {
            val eventX = event.x.toInt()
            val eventY = event.y.toInt()
            if (eventX > width - paddingRight - drawable.getIntrinsicWidth() && eventX < width - paddingRight) {
                setText("")
            }
        }
        return super.onTouchEvent(event)
    }
    /**
     * 手机号输入框规则
     */
    fun setReget(s:CharSequence){
        if(s.length==11){
            val builder = StringBuilder()
            for (index in 0.. s.length -1){
                builder.append(s[index])
                if(index==2){
                    builder.append(" ")
                }
                if(index == 6){
                    builder.append(" ")
                }

            }
            setText(builder.toString())
            setSelection(13)
        }
    }
}
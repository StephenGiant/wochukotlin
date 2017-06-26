package com.wicture.wochukotlin.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.text.Editable
import android.text.TextWatcher
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.EditText
import com.wicture.wochukotlin.R

/**
 * Created by qianpeng on 2017/6/26.
 */
class PasswordEdittext  : EditText {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    var drawable:Drawable
    init {
        drawable = context.resources.getDrawable(R.drawable.ic_eye)
        addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

            override fun afterTextChanged(s: Editable) {

                setDrawable()
                postInvalidate()

            }
        })
setDrawable()
        postInvalidate()

    }
    fun setDrawable (){
        if(length()>1) {
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null)
        }else{
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null)
        }
    }

    override  fun onTouchEvent(event: MotionEvent?): Boolean {
     if(compoundDrawables[2]!=null){
         if(event!!.action==MotionEvent.ACTION_DOWN){
             //手指放在眼睛位置
             //显示密码
             val rawX = event.x
             val rawY = event.y
                //计算相对坐标
             if(rawX>width-paddingRight-drawable.intrinsicWidth&&
                     rawX<width-paddingRight){
                 transformationMethod = HideReturnsTransformationMethod.getInstance()
                 postInvalidate()//重绘
             }


         }else if(event.action==MotionEvent.ACTION_UP){
             //手指离开眼镜，隐藏密码
             transformationMethod = PasswordTransformationMethod.getInstance()//隐藏密码
             postInvalidate()
         }
     }

        return super.onTouchEvent(event)
    }
}
package com.wicture.wochu.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.EditText
import com.wicture.wochu.R

/**
 * Created by qianpeng on 2017/6/26.
 */
class PasswordEdittext  : EditText {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    var drawable:Drawable
    var drawable_green:Drawable
    var showPassword = false
    init {
        drawable = context.resources.getDrawable(R.drawable.ic_eye_gray)
        drawable_green = context.resources.getDrawable(R.drawable.ic_eye)


    }
    fun setDrawable (){
        if(showPassword) {
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable_green, null)
        }else{
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null)
        }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        setDrawable()
//        postInvalidate()
    }
    override  fun onTouchEvent(event: MotionEvent?): Boolean {
     if(compoundDrawables[2]!=null){
         if(event!!.action==MotionEvent.ACTION_UP){
             //手指放在眼睛位置
             val rawX = event.x
             val rawY = event.y
                //计算相对坐标
             if(rawX>width-paddingRight-drawable.intrinsicWidth&&
                     rawX<width-paddingRight){
                 showPassword = !showPassword
                 setDrawable()
                 if(showPassword) {
                     transformationMethod = HideReturnsTransformationMethod.getInstance()//显示密码
                 }else{
                     transformationMethod = PasswordTransformationMethod.getInstance()//隐藏密码
                 }
                 postInvalidate()//重绘
             }


         }
//         else if(event.action==MotionEvent.ACTION_UP){
//             //手指离开眼镜，隐藏密码
//             showPassword = false
//             transformationMethod = PasswordTransformationMethod.getInstance()//隐藏密码
//             postInvalidate()
//         }
     }

        return super.onTouchEvent(event)
    }
}
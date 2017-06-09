package demo.wicture.com.wochukotlin.extension

import android.app.Activity
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

/**
 * activity类扩展
 * Created by qianpeng on 2017/6/6.
 */
fun Activity.hideSoftKeyboard(){
    val view = this.currentFocus
    view?.let({ view1 ->
        val imm = this.getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view1.windowToken, 0)
    })
}
fun Activity.ToastText(text:String){
    Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
}
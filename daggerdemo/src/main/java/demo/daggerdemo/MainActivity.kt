package demo.daggerdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView



/**
 * Created by Administrator on 2017/6/21.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById(R.id.tv_title)as TextView
    }
}
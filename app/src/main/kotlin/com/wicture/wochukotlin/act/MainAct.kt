package com.wicture.wochukotlin.act

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import butterknife.bindView
import com.wicture.wochukotlin.R
import com.wicture.wochukotlin.WochuApplication
import com.wicture.wochukotlin.items.business.RootCategoryAdapter
import com.wicture.wochukotlin.net.ServiceApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject
import javax.inject.Inject


/**
 * Created by qianpeng on 2017/6/6.
 */
class MainAct : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
val toolBar:Toolbar by bindView(R.id.toolbar)
    @Inject
    lateinit var apiservice: ServiceApi//注入apiservice,省去了业务代码在activity中使用
    var rv: RecyclerView? = null
    override fun initView(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_scrolling)

//        var  recyclerView = findViewById(R.id.rv_category) as RecyclerView
        rv = findViewById(R.id.rv_category) as RecyclerView
        toolBar.title = "团购"
        toolBar.setTitleTextColor(Color.parseColor("#FFFFFF"))
        setSupportActionBar(toolBar)
        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener({ view ->
            Snackbar.make(view, "参加团购成功！", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        })


//        DaggerMainComponent.builder().build().inject(this)
        (application as WochuApplication).getApiComponent().inject(this)
        getDataFromServer()
        startActivity(Intent(this,TestAct::class.java))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    /**
     * 获取数据
     */
    fun getDataFromServer() {
        var jsonObject = JSONObject()
        jsonObject.put("parentId", 0)

        apiservice.getCateGory(jsonObject.toString()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe({ coments ->
//                    println(coments.data[0].name)
//                    recyclerView.setAdapter(RootCategoryAdapter(this,coments.data))

                    rv!!.setAdapter(RootCategoryAdapter(this, coments.data))

                }, { error ->
                    error.printStackTrace()
//                    ToastText(error.toString())
                })
    }


}
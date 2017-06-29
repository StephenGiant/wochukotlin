package com.wicture.wochu.business.main

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.widget.RecyclerView
import android.view.MenuItem
import butterknife.bindView
import com.wicture.wochu.R
import com.wicture.wochu.WochuApplication
import com.wicture.wochu.base.BaseActivity
import com.wicture.wochu.business.main.fragment.IndexFragment
import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.databinding.ActMainBinding
import com.wicture.wochu.net.CartApi
import com.wicture.wochu.net.ServiceApi
import com.wicture.wochu.utils.Utils
import com.wicture.wochu.view.BottomNavigationViewHelper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.json.JSONObject
import javax.inject.Inject


/**
 * Created by qianpeng on 2017/6/6.
 */
class MainAct : BaseActivity() {

    val bottomNavi:BottomNavigationView by bindView(R.id.bottom_navi)
    @Inject
lateinit var cartApi: CartApi
    //同一个activity不能绑定多个component
    @Inject
    lateinit var serviceApi:ServiceApi

    lateinit var application: WochuApplication
    lateinit var binding :ActMainBinding
    var rv: RecyclerView? = null
    override fun initView(savedInstanceState: Bundle?) {
        binding=DataBindingUtil. setContentView(this,R.layout.act_main)
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.main_content,IndexFragment(),"")
        transaction.commit()
        binding.mainContent

        BottomNavigationViewHelper.disableShiftMode(bottomNavi)
        bottomNavi.setOnNavigationItemSelectedListener(object :BottomNavigationView.OnNavigationItemSelectedListener{
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                //非lambda写法,更通俗易懂
                when(item.itemId){
                    R.id.icon_home ->{}
                    R.id.icon_category ->{}
                    R.id.icon_cart ->{}
                    R.id.icon_person -> {}

                }
                return true
            }
        })
        application = WochuApplication.instance()
        application.getApiComponent().inject(this)
//        startActivityForResult(Intent(this, LoginAct::class.java),0)

    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val jsonObject = JSONObject().put("deviceNumber", Utils.getDeviceid(this))
        cartApi.getCartList(ApiConfig.URL_CART_COUNT,jsonObject).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe { json->
            println(json)
        }
    }
}
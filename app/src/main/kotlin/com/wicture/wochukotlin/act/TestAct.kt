package com.wicture.wochukotlin.act

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import butterknife.bindView
import com.wicture.wochukotlin.R
import com.wicture.wochukotlin.WochuApplication
import com.wicture.wochukotlin.di.ApiComponent
import com.wicture.wochukotlin.extension.ToastText
import com.wicture.wochukotlin.net.ServiceApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import okhttp3.FormBody
import javax.inject.Inject

/**
 * Created by Administrator on 2017/6/26.
 */
class TestAct : BaseActivity(),View.OnClickListener {
    val ediTtext_account:EditText by bindView(R.id.et_account)
    val ediTtext_password:EditText by bindView(R.id.et_password)
    val btn_login :Button by bindView(R.id.btn_login)
    @Inject
    lateinit var serviceApi:ServiceApi
    lateinit var apiComponent:ApiComponent
    override fun initView(savedInstanceState: Bundle?) {
        setContentView(R.layout.act_login)
        btn_login.setOnClickListener(this)
         apiComponent = (application as WochuApplication).getApiComponent()
        apiComponent.inject(this)
    }

    private fun login(){
        val account = ediTtext_account.text.toString()

       val sb =  StringBuilder();
        for (index in 0..account.length -1){
            if(account[index].toString()!=" ") {
                sb.append(account[index])
            }
        }
        val formBody = FormBody.Builder().add("UserName", sb.toString())
                .add("password", ediTtext_password.text.toString())
                .add("grant_type", "password").build()
        serviceApi.loginAccount(formBody).observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io()).subscribe ({ login ->
            println(login.access_token)
            ToastText("登陆成功")
            finish()


        },{
            error ->
            error.printStackTrace()
        })
    }

    override fun onClick(p0: View?) {
        login()
    }
}
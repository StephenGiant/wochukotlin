package com.wicture.wochu.business.webviews

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import butterknife.bindView
import com.wicture.wochu.R
import com.wicture.wochu.base.BaseActivity
import java.net.URLDecoder

/**
 * Created by qianpeng on 2017/7/1.
 */
class WebviewAct :BaseActivity {
val webView:WebView by bindView(R.id.webview)
    constructor() : super()

    override fun initView(savedInstanceState: Bundle?) {
        setContentView(R.layout.act_webview)
        val url = URLDecoder.decode(intent.getStringExtra("url"), "UTF-8")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.setWebChromeClient(object : WebChromeClient() {

        })

        webView.setWebViewClient(object :WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                handleUrl(url!!)
            }
        })
        webView.loadUrl(url)


    }
    private fun handleUrl(url:String){
        if(url.contains("#acback")){
            finish()
        }else if(url.contains("#addToCart")){
            println("添加购物车"+url.substring(url.indexOf("goodsId=")+8,url.lastIndexOf("&")))
        }
    }
}
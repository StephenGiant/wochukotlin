package com.wicture.wochu.config

import com.wicture.wochu.BuildConfig
import io.reactivex.Observable
import io.reactivex.functions.Function
import java.util.concurrent.TimeUnit


/**
 * Created by qianpeng on 2017/6/6.
 */
object ApiConfig {
    /**
     * 超时重连的配置
     */
    class RetryWithDelay(val maxRetries: Int = 3, val delayMillis: Long = 2000L) : Function<Observable<in Throwable>, Observable<*>> {
        var retryCount = 0

        override fun apply(observable: Observable<in Throwable>): Observable<*> = observable
                .flatMap { throwable ->
                    if (++retryCount < maxRetries) {
                        Observable.timer(delayMillis, TimeUnit.MILLISECONDS)
                    } else {
                        Observable.error(throwable as Throwable)
                    }
                }
    }
    //几个baseurl
    const val SERVER_HOST = BuildConfig.API_SERVER_HOST;
    const val CART_HOST = BuildConfig.CART_HOST;
    const val PAY_HOST = BuildConfig.PAY_SERVER_HOST;
    const val IMAGE_UPLOAD_HOST = BuildConfig.IMAGE_UPLOAD_HOST
    //几个api分类
    const val URL_DIR = "client/v1/"
    const val URL_APP = "app/"
    const val URL_GOODS = "goods/"
    const val URL_COMMENT = "comment/"
    const val URL_SATISFACTION = "satisfaction/"
    const val URL_MEMBER = "member/"
    const val URL_VOUCHER = "voucher/"//优惠券
    const val URL_CART = "shopcart/"//购物车
    const val URL_CART_OLD = "cart/"
    const val URL_PROMOTION = "promotion/"
    const val URL_ORDER = "order/"
    const val URL_ADDRESS = "address/"
    const val URL_SAMEDAY = "sameday/"
    const val URL_MESSAGE = "message/"
    const val URL_DEVICE = "deviceName=app"
    const val URL_BAOGANG = "pay/baogang/"
    const val URL_CMBPAY = "pay/CMBPay/"
    const val URL_CMBCPAY = "pay/CMBCPay/"
    //预售
    const val URL_PRESALE = "presale/"
    const val URL_ABCPAY = "pay/ABCPay"
    /*Content-Type*/
    const val CONTENT_TYPE = "text/json"
    const val CONTENT_TYPE_APPLICATION = "application/json"
    const val URL_INDEX_ACTS = URL_DIR + "acts"


    //具体业务
    /***************** 分割线**新API**end **********************/


    //**************** 首页以及分类  ****************
    /**
     * 首页数据
     */
    val URL_ACTSAMEND = "actsamend"
    val URL_GET_APP_LAYOUT_AMEND =  "layoutamend"
    /**
     * 获取大分类目录（一级&二级分类）
     */
    const val URL_CATEGORY = URL_DIR + URL_GOODS
    const val URL_CATEGORY_LIST =  "GetCategoryListFromPid"
    const val URL_SECOND_CATEGORY_LIST =  "GetCategoryListByMenuId"
    const val URL_SEARCH_BY_CATE_ID =  "SearchByCategoryId"


    //*******************登陆注册 ****************
    /**
     * 登陆
     */
    const val URL_LOGIN = "token"
    /**
     * 注册
     */
    const val URL_REGISTER = URL_DIR + URL_MEMBER + "register"

    //*******************购物车 ******************
    const val URLCART = URL_DIR+ URL_CART
    /**
     * 获取购物车商品列表
     */
    const val URL_CART_LIST_NEW =  "list"
    /**
     * 创建购物车
     */
    const val URL_CART_ADD =  "create"
    /**
     * 获取购物车商品数量
     */
    const val URL_CART_COUNT =  "GetCartGoodsCount"


}
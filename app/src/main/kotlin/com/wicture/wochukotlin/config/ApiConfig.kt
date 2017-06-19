package com.wicture.wochukotlin.config

import com.wicture.wochukotlin.BuildConfig


/**
 * Created by qianpeng on 2017/6/6.
 */
object ApiConfig {
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
    /**
     * 获取大分类目录（一级&二级分类）
     */
    const val URL_CATEGORY_LIST = URL_DIR + URL_GOODS + "GetCategoryListFromPid"
}
package com.wicture.wochu.utils

import android.content.Context
import android.content.Intent
import android.webkit.URLUtil
import com.wicture.wochu.business.webviews.WebviewAct

/**
 * Created by qianpeng on 2017/7/3.
 */
object JumpUtil {

    /**
     * 1. 网页
     */
    val JUMP_TYPE_WEBPAGE = 1
    /**
     * 2. 商品编号
     */
    val JUMP_TYPE_GOODS_NUMBER = 2
    /**
     * 3. 商品列表
     */
    val JUMP_TYPE_GOODS_LIST = 3
    /**
     * 4. 秒杀
     */
    val JUMP_TYPE_GOODS_SECKILL = 4
    /**
     * 5. 团购
     */
    val JUMP_TYPE_GROUP_PURCHASE = 5
    /**
     * 6. 商品类别编号
     */
    val JUMP_TYPE_GOODS_CATEGORY_NUMBER = 6
    /**
     * 7. 新团购
     */
    val JUMP_TYPE_NEW_GROUP_PURCHASE = 7
    /**
     * 8. 套餐列表
     */
    val JUMP_TYPE_PACKAGE_LIST = 8
    /**
     * 9. 套餐详情
     */
    val JUMP_TYPE_PACKAGE_DETAIL = 9
    /**
     * 10. 全品生鲜
     */
    val JUMP_ALL_CATEGORY = 10
    /**
     * 11. 老带新
     */
    val JUMP_INVITE_FRIEND = 11
    /**
     * 12. 充值
     */
    val JUMP_CHARGE = 12

    fun judgeJump(context: Context,source:String,type:Int){
        if(URLUtil.isValidUrl(source)){
            val intent = Intent(context, WebviewAct::class.java)
            intent.putExtra("url",source)
            context.startActivity(intent)
        }
    }
}
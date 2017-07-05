package com.wicture.wochu.img

import android.content.Context
import android.os.Environment
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool
import com.bumptech.glide.load.engine.cache.DiskCache
import com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.module.GlideModule
import com.bumptech.glide.request.target.ViewTarget
import com.wicture.wochu.R
import java.io.File
import java.io.InputStream

/**
 * Created by qianpeng on 2017/6/22.
 */
class WochuGlideModule : GlideModule{
    override fun registerComponents(context: Context?, glide: Glide?) {
        glide!!.register(GlideUrl::class.java, InputStream::class.java,OkHttpUrlLoader.Factory())
    }

    override fun applyOptions(context: Context?, builder: GlideBuilder?) {
    ViewTarget.setTagId(R.id.glide_tag_id)
        builder!!.setDiskCache(DiskCache.Factory {
            val glidefile = File(Environment.getExternalStorageDirectory(), "WoChu/GlideCache")
            glidefile.mkdirs()
            DiskLruCacheWrapper.get(glidefile, 1024 * 1024 * 128)
        })

        val calculator = MemorySizeCalculator(context)
        val defaultMemoryCacheSize = calculator.memoryCacheSize
        val defaultBitmapPoolSize = calculator.bitmapPoolSize

//        int customMemoryCacheSize = (int) (1.2 * defaultMemoryCacheSize);
        val customBitmapPoolSize = (1.2 * defaultBitmapPoolSize).toInt()
        val maxMemory = Runtime.getRuntime().maxMemory().toInt()//获取系统分配给应用的总内存大小
        val memoryCacheSize = maxMemory / 8//设置图片内存缓存占用八分之一
        //设置内存缓存大小
        builder.setMemoryCache(LruResourceCache(memoryCacheSize))
        //设置图片池大小
        builder.setBitmapPool(LruBitmapPool(customBitmapPoolSize))
    }
}
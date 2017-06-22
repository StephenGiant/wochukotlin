package com.wicture.wochukotlin.img

import android.content.Context
import android.os.Environment
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.load.engine.cache.DiskCache
import com.bumptech.glide.load.engine.cache.DiskLruCacheWrapper
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.module.GlideModule
import com.bumptech.glide.request.target.ViewTarget
import com.wicture.wochukotlin.R
import java.io.File
import java.io.InputStream

/**
 * Created by qianpeng on 2017/6/22.
 */
class WochuGlideModule : GlideModule{
    override fun registerComponents(context: Context?, glide: Glide?) {
        glide!!.register(GlideUrl::class.java, InputStream::class.java,null)
    }

    override fun applyOptions(context: Context?, builder: GlideBuilder?) {
    ViewTarget.setTagId(R.id.glide_tag_id)
        builder!!.setDiskCache(DiskCache.Factory {
            val glidefile = File(Environment.getExternalStorageDirectory(), "WoChu/GlideCache")
            glidefile.mkdirs()
            DiskLruCacheWrapper.get(glidefile, 1024 * 1024 * 128)
        })
    }
}
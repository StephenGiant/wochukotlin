package com.wicture.wochu.extension

import com.wicture.wochu.config.ApiConfig
import com.wicture.wochu.data.BaseData
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * 解析json的扩展方法
 */
fun <T> Observable<BaseData<T>>.decodeJson(): Observable<T> = this
        .subscribeOn(Schedulers.io())
        .retryWhen(ApiConfig.RetryWithDelay())
        .flatMap ({ response ->
            if (!response.hasError ) {
                Observable.just(response.data!!)
            } else {
                Observable.error(Throwable(response.errorMessage))
            }
        })
        .observeOn(AndroidSchedulers.mainThread())
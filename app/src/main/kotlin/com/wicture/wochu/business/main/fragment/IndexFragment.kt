package com.wicture.wochu.business.main.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.bindView
import com.wicture.wochu.R
import com.wicture.wochu.base.BaseFragment
import com.wicture.wochu.databinding.IndexLayoutBinding
import com.wicture.wochu.view.FlyBanner

/**
 * Created by qianpeng on 2017/6/28.
 */
class IndexFragment : BaseFragment {
    constructor() : super()
    val viewModel = IndexViewModel(this)
    val bannerIndex:FlyBanner by bindView(R.id.banner_index)
    val rvIcons:FlyBanner by bindView(R.id.rv_icons)
    val rvMainPage:FlyBanner by bindView(R.id.rv_mainPage)
    lateinit var binding:IndexLayoutBinding
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.index_layout,container,false)
        val view = binding.root
        binding.indexViewModel = viewModel
        return view
    }

    /**
     *  先于onCreateView调用
     */
    override fun initData() {

    }
}
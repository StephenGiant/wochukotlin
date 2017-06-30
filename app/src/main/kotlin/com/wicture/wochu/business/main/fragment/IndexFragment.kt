package com.wicture.wochu.business.main.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.bindView
import com.opensource.pulltorefresh.view.PullToRefreshBase
import com.wicture.wochu.R
import com.wicture.wochu.base.BaseFragment
import com.wicture.wochu.business.main.adapter.IndexAdapter
import com.wicture.wochu.data.index.BannerData
import com.wicture.wochu.data.index.MainData
import com.wicture.wochu.databinding.IndexLayoutBinding
import com.wicture.wochu.view.FullyLinearLayoutManager
import com.wicture.wochu.view.NoScrollRecyclerview

/**
 * Created by qianpeng on 2017/6/28.
 */
class IndexFragment : BaseFragment ,IndexViewModel.IndexDataListenner{
    constructor() : super()

    lateinit var viewModel : IndexViewModel
//    val bannerIndex:FlyBanner by bindView(R.id.banner_index)
//    val rvIcons:FlyBanner by bindView(R.id.rv_icons)
    val rvMainPage:NoScrollRecyclerview by bindView(R.id.rv_mainPage)
    lateinit var binding:IndexLayoutBinding
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.index_layout,container,false)
        val view = binding.root
        viewModel = IndexViewModel(this)
        viewModel.loadData()
        binding.ptrIndex.mode =PullToRefreshBase.Mode.PULL_FROM_START
        binding.indexViewModel = viewModel
        return view
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    /**
     *  先于onCreateView调用
     */
    override fun initData() {

    }

    override fun onMainDataLoad(datas: MutableList<MainData.ActsBean>) {
        println("加载成功")
        rvMainPage.isNestedScrollingEnabled = false
//        binding.rvMainPage.setAdapter(IndexAdapter(activity,datas))
        rvMainPage.layoutManager = FullyLinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rvMainPage.adapter = IndexAdapter(activity,datas)
    }

    override fun onTopDataGet(bannerData: BannerData) {
        val urlList = mutableListOf<String>()
        for (index in 0..bannerData.carousel.size -1){
           if(bannerData.carousel[index].picUrl!=null&&!TextUtils.isEmpty(bannerData.carousel[index].picUrl)){
               urlList.add(bannerData.carousel[index].picUrl)
           }
        }
        binding.bannerIndex.setImagesUrl(urlList)
    }

}
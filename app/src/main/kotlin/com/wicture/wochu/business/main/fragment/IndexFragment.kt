package com.wicture.wochu.business.main.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import butterknife.bindView
import com.opensource.pulltorefresh.view.PullToRefreshBase
import com.wicture.wochu.R
import com.wicture.wochu.base.BaseFragment
import com.wicture.wochu.business.main.adapter.IconsAdapter
import com.wicture.wochu.business.main.adapter.IndexAdapter
import com.wicture.wochu.data.index.BannerData
import com.wicture.wochu.data.index.MainData
import com.wicture.wochu.databinding.IndexLayoutBinding
import com.wicture.wochu.view.FullyLinearLayoutManager
import com.wicture.wochu.view.FullyStaggeredGridLayoutManager
import com.wicture.wochu.view.NoScrollRecyclerview
import com.wicture.wochu.view.RecyclerItemClickListener

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
        binding.ptrIndex.setOnRefreshListener ( object :PullToRefreshBase.OnRefreshListener<ScrollView>{
            override fun onRefresh(refreshView: PullToRefreshBase<ScrollView>?) {
                binding.ptrIndex.postDelayed(object :Runnable{
                    override fun run() {
                        viewModel.loadData()
                    }
                },10)

                binding.ptrIndex.onRefreshComplete()
            }
        } )
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
        if(rvMainPage.adapter==null) {
            rvMainPage.adapter = IndexAdapter(activity, datas)
        }else{
            ((rvMainPage.adapter) as IndexAdapter).refreshData(datas)
        }
//        rvMainPage.addOnItemTouchListener(object :RecyclerItemClickListener(context){
//            override fun onItemClick(view: View?, position: Int) {
//                if(datas[position].templateType!=7) {
//
//                    if(URLUtil.isValidUrl(datas[position].items[0].source)){
//                        println(datas[position].items[0].source)
//                    }
//                }else{
//                    (view as ViewGroup).requestDisallowInterceptTouchEvent(true)
//                }
//            }
//        })
    }

    override fun onTopDataGet(bannerData: BannerData) {
        val urlList = mutableListOf<String>()
        for (index in 0..bannerData.carousel.size -1){
           if(bannerData.carousel[index].picUrl!=null&&!TextUtils.isEmpty(bannerData.carousel[index].picUrl)){
               urlList.add(bannerData.carousel[index].picUrl)
           }
        }
        binding.bannerIndex.setImagesUrl(urlList)
        binding.rvIcons.layoutManager = FullyStaggeredGridLayoutManager(4,FullyStaggeredGridLayoutManager.VERTICAL)
        val items = mutableListOf<BannerData.RecommendedContentBean.ItemsBean>()
        for (index in 0..bannerData.recommendedContent.size -1){
            for (x in 0..bannerData.recommendedContent[index].items.size -1){
                items.add(bannerData.recommendedContent[index].items[x])
            }
        }
        if(binding.rvIcons.adapter==null) {
            binding.rvIcons.adapter = IconsAdapter(activity, items)
        }else{
            (binding.rvIcons.adapter as IconsAdapter).refreshData(items)
        }

        binding.rvIcons.addOnItemTouchListener(object : RecyclerItemClickListener(context){
            override fun onItemClick(view: View?, position: Int) {
               println(items[position].source)
            }
        })
    }
    fun dispatchIconClick(type :Int){
        when(type){
           3 ->{
               //今日特惠
           }
        }
        }
    fun dispatchWebViewTarget(){

        }


}
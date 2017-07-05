package com.wicture.wochu.business.main.adapter

import android.app.Activity
import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.bindView
import com.wicture.com.wochu.business.BaseViewHolder
import com.wicture.com.wochu.business.MyBaseAdapter
import com.wicture.wochu.R
import com.wicture.wochu.data.index.MainData
import com.wicture.wochu.utils.JumpUtil
import com.wicture.wochu.view.FullyLinearLayoutManager

/**
 * Created by Administrator on 2017/6/30.
 */
class IndexAdapter:MyBaseAdapter<MainData.ActsBean,BaseViewHolder> {
    val TemPlateType4 = 4
    val TemPlateType5 = 5
    val TemPlateType6 = 6
    val TemPlateType7 = 7

    constructor(activity: Activity, data: MutableList<MainData.ActsBean>) : super(activity, data)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): BaseViewHolder {
        val inflaTer =  LayoutInflater.from(mActivity)

        when(viewType){
            TemPlateType4 ->{

                return TM4ViewHolder(inflaTer.inflate(R.layout.item_tm4,parent,false))
            }
            TemPlateType5 ->{
                return TM5ViewHolder(inflaTer.inflate(R.layout.item_tm5,parent,false))
            }
            TemPlateType6 ->{
                return TM6ViewHolder(inflaTer.inflate(R.layout.item_tm6,parent,false))
            }
            TemPlateType7 ->{
                return TM7ViewHolder(inflaTer.inflate(R.layout.item_tm7,parent,false))
            }
            else ->{
                return TM4ViewHolder(inflaTer.inflate(R.layout.item_tm4,parent,false))
            }
        }

    }

    override fun bindItemData(holder: BaseViewHolder, data: MainData.ActsBean, position: Int) {
            if(holder is TM4ViewHolder){
              holder.setNetImage_Large(mActivity,R.id.iv_tm4,data.items[0].imgUrl)
            }else if(holder is TM5ViewHolder){
                holder.setNetImage(mActivity,R.id.iv_tm5,data.items[0].imgUrl)
            }else if(holder is TM6ViewHolder){
                holder.setNetImage_Large(mActivity,R.id.iv_tm6,data.items[0].imgUrl)
            }else if(holder is TM7ViewHolder){
                holder.hotSales.adapter = HotsalesAdapter(mActivity,data.items)
            }
    }

    override fun getItemViewType(position: Int): Int {

        return mDatas[position].templateType
    }

    inner class TM4ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)
        init {
            itemView.setOnClickListener { view->

                JumpUtil.judgeJump(mActivity as Context, mDatas[layoutPosition].items[0].source,
                        Integer.parseInt(mDatas[layoutPosition].items[0].type))

                println(mDatas[layoutPosition].items[0].source+"4")
            }
        }

    }
    inner class TM5ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)

    }
    inner  class TM6ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)
        init {
            itemView.setOnClickListener { view->
                println(mDatas[layoutPosition].items[0].source+"6")
            }
        }

    }
   inner class TM7ViewHolder :BaseViewHolder{
        val hotSales:RecyclerView by bindView(R.id.rv_hotsales)
        constructor(itemView: View) : super(itemView)
        init {
            hotSales.layoutManager = FullyLinearLayoutManager(mActivity,LinearLayoutManager.HORIZONTAL,false)

        }

    }
}
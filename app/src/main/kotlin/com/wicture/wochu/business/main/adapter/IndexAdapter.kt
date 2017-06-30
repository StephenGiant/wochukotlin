package com.wicture.wochu.business.main.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wicture.com.wochu.business.BaseViewHolder
import com.wicture.com.wochu.business.MyBaseAdapter
import com.wicture.wochu.R
import com.wicture.wochu.data.index.MainData

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
              holder.setNetImage(mActivity,R.id.iv_tm4,data.items[0].imgUrl)
            }else if(holder is TM5ViewHolder){
                holder.setNetImage(mActivity,R.id.iv_tm5,data.items[0].imgUrl)
            }else if(holder is TM6ViewHolder){
                holder.setNetImage(mActivity,R.id.iv_tm6,data.items[0].imgUrl)
            }
    }

    override fun getItemViewType(position: Int): Int {

        return mDatas[position].templateType
    }

    class TM4ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)

    }
    class TM5ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)

    }
    class TM6ViewHolder :BaseViewHolder{
        constructor(itemView: View) : super(itemView)

    }
    class TM7ViewHolder :BaseViewHolder{
//        val hotSales:NoScrollRecyclerview by bindView(R.id.rv_hotsales)
        constructor(itemView: View) : super(itemView)
//        init {
//            hotSales.layoutManager = LinearLayoutManager(hotSales.context,LinearLayoutManager.HORIZONTAL,false)
//        }

    }
}
package demo.wicture.com.wochukotlin.business

import android.app.Activity
import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter


/**
 * 坑:kotlin自己的list没有add与remove方法
 * int类型的数据要封装成Interger 否则remove的时候会很蛋疼
 * Created by qianpeng on 2017/6/8.
 */
abstract class MyBaseAdapter<T, VH : RecyclerView.ViewHolder>(activity: Activity, data: java.util.List<T>) : Adapter<VH>() {

    var mActivity = activity
    var mDatas  = data;

    init {

    }


    override fun onBindViewHolder(holder: VH, position: Int) {
      bindItemData(holder,mDatas[position],position)
    }

    override fun getItemCount(): Int {
        try {

            return mDatas.size


        } catch (exception: NullPointerException) {
            return 0
        }

    }

    fun refreshData(datas: java.util.List<T>) {
        mDatas = datas
        notifyDataSetChanged()
    }

    fun removeUItem(position: Int) {
        //当t不是int型的时候适合,元素如果是int型最好使用Integer
        val t = mDatas.remove(position)

            notifyItemRemoved(position)

        //这样刷新节省资源
    }

    fun addItem(item: T) {

        mDatas.add(item)
        notifyItemInserted(mDatas.size - 1)
        //这样刷新节省资源
    }

    fun removeUiItemRange(start: Int, end: Int) {

        notifyItemRangeRemoved(start, end)
        //这样刷新节省资源

    }

    /**
     * 自己处理业务逻辑
     */
    protected abstract fun bindItemData(holder: VH, data: T, position: Int)
    protected fun getItem(position: Int): T {
        var position = position
        position = Math.max(0, position)//防止position小于0报错
        return mDatas.get(position)
    }
}
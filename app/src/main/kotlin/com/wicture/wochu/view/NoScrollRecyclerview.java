package com.wicture.wochu.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * 禁用了滚动的recyclerview，防止与scrollview之间的滑动冲突
 * Created by qianpeng&wuxueqing on 2016/7/3.
 */
public class NoScrollRecyclerview extends RecyclerView {

    public NoScrollRecyclerview(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    public NoScrollRecyclerview(Context context) {
        super(context);
        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    public NoScrollRecyclerview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOverScrollMode(OVER_SCROLL_NEVER);
    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        return super.onTouchEvent(e);
    }

    @Override
    protected void onMeasure(int widthSpec, int heightSpec) {



            int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                    MeasureSpec.AT_MOST);
            super.onMeasure(widthSpec, expandSpec);


    }


}

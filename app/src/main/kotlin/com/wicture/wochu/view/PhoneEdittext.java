package com.wicture.wochu.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

import com.wicture.wochu.R;

/**
 * Created by Administrator on 2017/6/28.
 */

public class PhoneEdittext extends EditText {
    private boolean shouldStopChange = false;
    private Drawable drawable;
    public PhoneEdittext(Context context) {
        super(context);
        init();
    }

    public PhoneEdittext(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PhoneEdittext(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    @TargetApi(21)
    public PhoneEdittext(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    private void init(){
       drawable= getContext().getResources().getDrawable(R.drawable.ic_close);
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                setDrawable();
                format(editable);
            }
        });
    }
    private void format(Editable editable) {
        if (shouldStopChange) {
            shouldStopChange = false;
            return;
        }

        shouldStopChange = true;

        String str = editable.toString().trim().replaceAll(" ", "");
        int len = str.length();
        int courPos;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(str.charAt(i));
            if (i == 2 || i == 6 ) {
                if (i != len - 1)
                    builder.append(" ");
            }
        }
        courPos = builder.length();
        setText(builder.toString());
        setSelection(courPos);
//        if (listener != null) {
//            if (isBankCard()) {
//                char[] ss = getBankCardText().toCharArray();
//                listener.success(BankInfo.getNameOfBank(ss, 0));
//            } else {
//                listener.failure();
//            }
//        }
    }

    private void setDrawable(){
        if(length()>1) {
            setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
        }else{
            setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (drawable != null && event.getAction() == MotionEvent.ACTION_UP) {
            int eventX = (int) event.getX();
            int eventY = (int) event.getY();
            if (eventX > getWidth() - getPaddingRight() - drawable.getIntrinsicWidth() && eventX <
                    getWidth() - getPaddingRight()) {
                setText("");
            }
        }
        return super.onTouchEvent(event);
    }
}

package com.wicture.wochu.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.wicture.wochu.R;
import com.wicture.wochu.view.PasswordEdittext;
import com.wicture.wochu.view.PhoneEdittext;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/7/3.
 */

public class test extends AppCompatActivity {
    @BindView(R.id.backGound_pic)
    ImageView backGoundPic;
    @BindView(R.id.et_account)
    PhoneEdittext etAccount;
    @BindView(R.id.et_password)
    PasswordEdittext etPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.ll_content)
    LinearLayout llContent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        ButterKnife.bind(this);

        if(backGoundPic!=null){
            Log.i("正常","黄油刀");
        }
    }
}

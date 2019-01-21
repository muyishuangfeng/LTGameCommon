package com.gnetop.ltgamecommon.widget.activity;


import com.gnetop.ltgamecommon.R;
import com.gnetop.ltgamecommon.base.BaseAppActivity;
import com.gnetop.ltgamecommon.widget.fragment.LoginFragment;

public class LoginActivity extends BaseAppActivity {


    @Override
    protected int getViewId() {
        return R.layout.activity_login;
    }

    /**
     * 初始化控件
     */
    @Override
    protected void initView() {
        addFragment(LoginFragment.newInstance(),true,
                true);
    }

    @Override
    protected void initData() {
    }


}

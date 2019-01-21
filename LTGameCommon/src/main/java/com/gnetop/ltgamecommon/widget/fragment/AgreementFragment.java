package com.gnetop.ltgamecommon.widget.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.gnetop.ltgamecommon.R;
import com.gnetop.ltgamecommon.base.BaseFragment;
import com.gnetop.ltgamecommon.impl.OnLoginSuccessListener;
import com.gnetop.ltgamecommon.widget.activity.FAQActivity;


public class AgreementFragment extends BaseFragment implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener {

    TextView mTxtAgreement, mTxtPrivacy;
    Button mBtnInto;
    AppCompatCheckBox mCkbAgreement, mCkbPrivacy;
    boolean isAgreement = false;
    boolean isPrivacy = false;
    OnLoginSuccessListener mListener;


    public static AgreementFragment newInstance() {
        Bundle args = new Bundle();
        AgreementFragment fragment = new AgreementFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getFragmentId() {
        return R.layout.fragment_agreement;
    }

    @Override
    protected void initView(View view) {
        isAgreement = false;
        isPrivacy = false;
        mTxtAgreement = view.findViewById(R.id.txt_agreement);
        mTxtPrivacy = view.findViewById(R.id.txt_privacy);

        mCkbAgreement = view.findViewById(R.id.ckb_agreement);
        mCkbAgreement.setOnCheckedChangeListener(this);

        mCkbPrivacy = view.findViewById(R.id.ckb_privacy);
        mCkbPrivacy.setOnCheckedChangeListener(this);


        mBtnInto = view.findViewById(R.id.btn_into_game);
        mBtnInto.setOnClickListener(this);
    }

    @Override
    public void lazyLoadData() {
        super.lazyLoadData();
        initData();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_into_game) {
//            if (mListener != null) {
//                mListener.onSuccess();
//            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == R.id.ckb_agreement) {
            if (isChecked) {
                isAgreement = true;
            }

        } else if (buttonView.getId() == R.id.ckb_privacy) {
            if (isChecked) {
                isPrivacy = true;
            }
        }
    }

    /**
     * 初始化数据
     */
    private void initData() {
        SpannableStringBuilder style = new SpannableStringBuilder();
        SpannableStringBuilder style2 = new SpannableStringBuilder();
        //设置文字
        style.append(getResources().getString(R.string.text_agreement));
        style2.append(getResources().getString(R.string.text_privacy));

        //设置部分文字点击事件
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent intent = new Intent(mActivity, FAQActivity.class);
                intent.putExtra(FAQActivity.URL_CONFIG, "terms");
                startActivity(intent);
            }
        };
        //设置部分文字点击事件
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                Intent intent = new Intent(mActivity, FAQActivity.class);
                intent.putExtra(FAQActivity.URL_CONFIG, "privacy");
                startActivity(intent);
            }
        };
        style.setSpan(clickableSpan, 7, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style2.setSpan(clickableSpan2, 7, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        mTxtPrivacy.setText(style2);
        mTxtAgreement.setText(style);

        //设置部分文字颜色
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.colorBlue));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getResources().getColor(R.color.colorBlue));
        style.setSpan(foregroundColorSpan, 7, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        style.setSpan(foregroundColorSpan2, 7, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        //配置给TextView
        mTxtPrivacy.setMovementMethod(LinkMovementMethod.getInstance());
        mTxtPrivacy.setText(style2);
        //配置给TextView
        mTxtAgreement.setMovementMethod(LinkMovementMethod.getInstance());
        mTxtAgreement.setText(style);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        isPrivacy = false;
        isAgreement = false;
    }

    /**
     * 登录成功回调
     *
     * @param listener
     */
    public void setOnLoginSuccessListener(OnLoginSuccessListener listener) {
        this.mListener = listener;
    }
}

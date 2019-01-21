package com.gnetop.ltgamecommon.widget.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;

import com.gnetop.ltgamecommon.R;
import com.gnetop.ltgamecommon.base.BaseFragment;

public class LoginFragment extends BaseFragment implements View.OnClickListener{

    LinearLayout mLytGoogle, mLytFaceBook;
    private static final int RC_SIGN_IN = 10001;

    public static LoginFragment newInstance() {
        Bundle args = new Bundle();
        LoginFragment fragment = new LoginFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int getFragmentId() {
        return R.layout.fragment_loign;
    }

    @Override
    protected void initView(View view) {
        mLytGoogle = view.findViewById(R.id.lyt_login_google);
        mLytGoogle.setOnClickListener(this);

        mLytFaceBook = view.findViewById(R.id.lyt_login_facebook);
        mLytFaceBook.setOnClickListener(this);
        googleLogins();
    }

    @Override
    public void onClick(View view) {
        int resID = view.getId();
        if (resID == R.id.lyt_login_facebook) {
            //FaceBookLogin.faceBookLogin(mActivity);
        } else if (resID == R.id.lyt_login_google) {
//            getProxyActivity().addFragment(AgreementFragment.newInstance(),
//                    false,
//                    true);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        FaceBookLogin.setOnActivityResult(mFaceBookCallBack, requestCode, resultCode, data);
//        if (requestCode == RC_SIGN_IN) {
//            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
//            handleSignInResult(result);
//        }
    }


    @Override
    public void onResume() {
        super.onResume();
//        FaceBookLogin.setOnFaceBookListener(new OnFaceBookResultListener() {
//            @Override
//            public void onFaceBookSuccess(LoginResult loginResult) {
//                Logger.e(loginResult.getAccessToken().getToken() + "============apitoken");
//            }
//
//            @Override
//            public void onFaceBookCancel() {
//                Toast.makeText(mActivity, "取消了", Toast.LENGTH_SHORT).show();
//                Logger.e("取消了============apitoken");
//            }
//
//            @Override
//            public void onFaceBookError(FacebookException exception) {
//                Toast.makeText(mActivity, "错误了", Toast.LENGTH_SHORT).show();
//                Logger.e("错误了============apitoken");
//            }
//        });
    }

    private void googleLogins() {
//        GoogleSignInOptions gso = new GoogleSignInOptions
//                .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
//                .requestEmail()
//                .requestId()
//                .requestIdToken("868770536636-4qplp9tvmg408dpu1ge5qlif7t4va7ol.apps.googleusercontent.com")
//                .build();
//
//        mGoogleApiClient = new GoogleApiClient
//                .Builder(mActivity)
//                .addConnectionCallbacks(this)
//                .addOnConnectionFailedListener(this)
//                .enableAutoManage(mActivity, this)/* FragmentActivity *//* OnConnectionFailedListener */
//                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
//                .build();

    }

//    private void signIn() {
//        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
//        startActivityForResult(signInIntent, RC_SIGN_IN);
//    }
//
//    private void handleSignInResult(GoogleSignInResult result) {
//        Logger.e("robinhandleSignInResult:" + result.isSuccess());
//        if (result.isSuccess()) {
//            Logger.e("robin成功");
//            GoogleSignInAccount acct = result.getSignInAccount();
//            if (acct != null) {
//                Logger.e("robin用户名是:" + acct.getDisplayName());
//                Logger.e("robin用户email是:" + acct.getEmail());
//                Logger.e("robin用户头像是:" + acct.getPhotoUrl());
//                Logger.e("robin用户Id是:" + acct.getId());//之后就可以更新UI了
//                Logger.e("robin用户IdToken是:" + acct.getIdToken());
//                Logger.e("robin用户IdToken是:" + acct.getServerAuthCode());
//            }
//        } else {
//            Logger.e("robin没有成功" + result.getStatus());
//        }
//    }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        if (mGoogleApiClient != null) mGoogleApiClient.connect();
//    }
//
//    @Override
//    public void onConnected(@Nullable Bundle bundle) {
//        if (bundle != null) {
//            Logger.e("robingoogle登录-->onConnected,bundle==" + bundle);
//        } else {
//            Logger.e("robingoogle登录-->onConnected,bundle==");
//        }
//    }
//
//    @Override
//    public void onConnectionSuspended(int i) {
//        Logger.e("robingoogle连接支持-->onConnected,bundle==" + i);
//    }
//
//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//        Logger.e("robingoogle连接失败-->onConnected,bundle==" + connectionResult);
//    }
}

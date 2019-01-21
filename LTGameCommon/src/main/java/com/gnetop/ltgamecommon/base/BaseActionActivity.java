package com.gnetop.ltgamecommon.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class BaseActionActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void handleResp(Object resp) {
        Log.e("weChat", "handleResp===="+resp.toString());
    }

    protected void handReq(Object req) {

    }

}

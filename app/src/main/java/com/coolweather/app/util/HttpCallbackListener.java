package com.coolweather.app.util;

/**
 * Created by jiangdawei on 2016/7/13.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}

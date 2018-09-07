package com.example.admin.longconnect.util;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.example.admin.longconnect.Constans;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by WuJingCheng on 2017/6/22.
 */

public class OkhttpUtils {
    private static OkHttpClient okHttpClient;
    public OkhttpUtils() {
        if(okHttpClient==null) {
            synchronized (OkhttpUtils.class) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient();
                }
            }
        }
    }
    public void getMsg(String url, RequestBody requestBody, final Handler handler) {
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Content-Type","multipart/form-data")
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                handler.sendEmptyMessage(0);

            }
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                    String msg = response.body().string();
                    SplashBean splashBean = JsonUtils.getObject(msg,SplashBean.class);
                    Log.e("onResponse",msg);
                    if(Constans.sessionId==null){//获取session的操作
                        try {
                            Headers headers = response.headers();
                            Log.d("info_headers", "header " + headers);
                            List<String> cookies = headers.values("Set-Cookie");
                            String session = cookies.get(0);
                            Log.d("info_cookies", "onResponse-size: " + cookies);
                            Constans.sessionId = session.substring(0, session.indexOf(";"));
                            Log.e("info_s", "session is  :" + Constans.sessionId);
                        }catch (Exception r){

                        }

                    }


                    Message message = new Message();
                    message.obj =splashBean;
                    message.what =1;
                    handler.sendMessage(message);


                }else {
                    handler.sendEmptyMessage(0);
                }

            }
        });
    }
}

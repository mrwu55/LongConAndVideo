package com.example.admin.longconnect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.admin.longconnect.test.Client;
import com.example.admin.longconnect.util.OkhttpUtils;
import com.example.admin.longconnect.websocket.WsManager;
import com.shuyu.gsyvideoplayer.utils.OrientationUtils;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import okhttp3.FormBody;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @SuppressLint("HandlerLeak")
private Handler handler = new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what){
            case 1:
                try {
//                    WsManager.getInstance().init();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
        }
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_search);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        new OkhttpUtils().getMsg("http://39.108.155.228/YprojectApp/users/login",new FormBody.Builder().build(),handler);
        List<String> list = new ArrayList();
        list.add("http://pr.mm798.net/back/20180821/7d550635571b07743a44aa4e11b8a413.mp4");
        list.add("http://pr.mm798.net/back/20180821/25a085f7f6c82e56dc7a6ebe979f6c3d.mp4");
        list.add("http://pr.mm798.net/back/20180821/86f1a5a1ed8c73de7d1926c48e1fcfa8.mp4");
        list.add("http://pr.mm798.net/back/20180821/4e2f42bb902ceb0e1d999ca81576421d.mp4");
        list.add("http://pr.mm798.net/back/20180821/ca8d8871a56f327bf556687b19757b86.mp4");
        Adapter adapter = new Adapter(this,list);
        recyclerView.setAdapter(adapter);


    }

}

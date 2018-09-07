package com.example.admin.longconnect;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context context;
    private List<String> data;

    public Adapter(Context context,List<String> data){
        this.context = context;
        this.data = data;

    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        holder.gsyVideoPlayer.setUpLazy(data.get(position), true, null, null, "这是title");
//增加title
        holder.gsyVideoPlayer.getTitleTextView().setVisibility(View.GONE);
//设置返回键
        holder.gsyVideoPlayer.getBackButton().setVisibility(View.GONE);
//设置全屏按键功能
        holder.gsyVideoPlayer.getFullscreenButton().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.gsyVideoPlayer.startWindowFullscreen(context, false, true);
            }
        });
//防止错位设置
        holder.gsyVideoPlayer.setPlayTag("hhahhahhaha");
        holder.gsyVideoPlayer.setPlayPosition(position);
//是否根据视频尺寸，自动选择竖屏全屏或者横屏全屏
        holder.gsyVideoPlayer.setAutoFullWithSize(true);
//音频焦点冲突时是否释放
        holder.gsyVideoPlayer.setReleaseWhenLossAudio(false);
//全屏动画
        holder.gsyVideoPlayer.setShowFullAnimation(true);
//小屏时不触摸滑动
        holder.gsyVideoPlayer.setIsTouchWiget(false);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private StandardGSYVideoPlayer gsyVideoPlayer;

        public ViewHolder(View itemView) {
            super(itemView);
            gsyVideoPlayer = itemView.findViewById(R.id.detail_player);

        }
    }
}
package com.tianruan.round;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.tianruan.round.Util.PrefUtils;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        startSplash();
       // gotoNextPage();
    }
    private  void startSplash(){
        //5秒的延迟
        //初始化计时器
        Timer timer=new Timer();
        //初始化计时器任务
        TimerTask task =new TimerTask() {
            @Override
            public void run() {

                //startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                gotoNextPage();
            }
        };
        //启动定时器
        timer.schedule(task,2000);
    }

    //闪屏跳转到下一个界面
    private void gotoNextPage(){
        Boolean isFirstIn= PrefUtils.getBoolean(this,"isFirstIn",true);
        if (isFirstIn){
            startActivity(new Intent(SplashActivity.this,GuideActivity.class));
            PrefUtils.setBoolean(this,"isFirstIn",false);
        }else {
            startActivity(new Intent(SplashActivity.this,MainActivity.class));
        }
        finish();
    }

}

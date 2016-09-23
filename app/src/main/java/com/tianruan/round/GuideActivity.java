package com.tianruan.round;

import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        sp("filename","test","");
    }

    /**
     * 保存数据
     */
    public void sp(String spname,String Keyname,String KeyCotent){
        //SharedPreferencesCompat mySharedPreferencesCompat=getSharedPreferences(spname,Keyname,KeyCotent);
    }
}

package com.wtsst.hp.awbaidumap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

import baidumapsdk.demo.BMapApiDemoMain;

public class MainActivity extends AppCompatActivity {
    private MapView bmapView = null;
    private String txt = "王婷我爱你";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext；
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        bmapView = (MapView) findViewById(R.id.bmapView);
    }
//各个生命周期
    @Override
    protected void onDestroy() {
        super.onDestroy();
        bmapView.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        bmapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        bmapView.onPause();
    }
    public void allClick(View view){
        Intent intent = new Intent(MainActivity.this,BMapApiDemoMain.class);
        startActivity(intent);

    }
}

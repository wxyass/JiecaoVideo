package com.jiec;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.bumptech.glide.Glide;

import cn.jzvd.JzvdStd;

/**
 * 播放主Activity
 */
public class JieCaoMainActivity extends AppCompatActivity {//implements View.OnClickListener {

    JzvdStd jzvdStd;

    Button mTinyWindow;
    Button mListView;
    Button mDirectFullscreen;
    Button mApi;
    Button mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jiecao_main);

        String mp4url = "http://images.wxyass.com/wxyass/images/TroubleMaker.mp4";
        String imgurl = "http://images.wxyass.com/wxyass/images/20180909160358.png";

        jzvdStd = (JzvdStd) findViewById(R.id.jiecao_videoplayer);

        mTinyWindow = (Button) findViewById(R.id.main_tiny_window);
        mDirectFullscreen = (Button) findViewById(R.id.direct_play);
        mListView = (Button) findViewById(R.id.main_listview);
        mApi = (Button) findViewById(R.id.api);
        mWebView = (Button) findViewById(R.id.main_webview);

        /*mTinyWindow.setOnClickListener(this);
        mListView.setOnClickListener(this);
        mDirectFullscreen.setOnClickListener(this);
        mApi.setOnClickListener(this);
        mWebView.setOnClickListener(this);*/

        jzvdStd.setUp(mp4url, "饺子快长大", JzvdStd.SCREEN_WINDOW_NORMAL);
        Glide.with(this).load(imgurl).into(jzvdStd.thumbImageView);

    }

    // 对返回键进行监听
    /*@Override
    public void onBackPressedSupport() {
        *//*if (Jzvd.backPress()) {
            return;
        }*//*

        if (getSupportFragmentManager().getBackStackEntryCount() > 1) {
            pop();
        } else {
            ActivityCompat.finishAfterTransition(this);
        }
    }*/

    /*@Override
    protected void onPause() {
        super.onPause();
        Jzvd.releaseAllVideos();
    }*/

    /*@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.api:
                //startActivity(new Intent(MainActivity.this, ActivityApi.class));
                break;
            case R.id.main_listview://
                //startActivity(new Intent(MainActivity.this, ActivityListView.class));
                break;
            case R.id.main_tiny_window:
                //startActivity(new Intent(MainActivity.this, ActivityTinyWindow.class));
                break;
            case R.id.direct_play:
                //startActivity(new Intent(MainActivity.this, ActivityDirectPlay.class));
                break;
            case R.id.main_webview://
                //startActivity(new Intent(MainActivity.this, ActivityWebView.class));
                break;
        }
    }*/
}

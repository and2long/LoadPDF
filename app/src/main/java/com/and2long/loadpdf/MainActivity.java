package com.and2long.loadpdf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Demo描述: 利用WebView加载网络PDF资源,并且实现下载
 * 步骤:
 * 1 利用谷歌服务得到解析后的pdf,且在Webview中显示
 * 2 实现Webview的下载监听.
 *  即mWebView.setDownloadListener()实现下载
 *
 * 备注:
 * 测试时最好链接VPN
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private WebView mWebView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("加载PDF");
        Button load1 = (Button) findViewById(R.id.load1);
        Button load2 = (Button) findViewById(R.id.load2);
        load1.setOnClickListener(this);
        load2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.load1:
                intent = new Intent(this, LoadPDFOnlineActivity.class);
                startActivity(intent);
                break;
            case R.id.load2:
                intent = new Intent(this, LoadPDFActivity.class);
                startActivity(intent);
                break;
        }
    }
}

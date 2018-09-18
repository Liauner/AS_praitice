package com.example.p_webview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private String url="http://www.baidu.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //使用系统提供的webview控件访问网页：
        //1.获取到了webview的实例。
        //WebView webView=(WebView) findViewById(R.id.web_view);
        //2.调用webview的getSettings()方法来设置一些浏览器的属性。
        //2.其中这里调用了setJavaScriptEnable()方法来让webview支持javascript 脚本.
        //webView.getSettings().setJavaScriptEnabled(true);
        //3.调用setWebviewClient方法并传入一个webviewclient()实例，作用是从一个网页跳到另外一个网页时，目标网页仍然在当前webview中显示
        //webView.setWebViewClient(new WebViewClient());
        //4.调用loadUrl()方法并传入地址，可展示相应的网页。
        //webView.loadUrl("http://www.baidu.com");

        //调用系统浏览器或第三方浏览器加载
        //将字符串(存有地址值)解析成Uri对象.
        Uri uri = Uri.parse(url);
        //创建一个Intent实例。
        Intent intent=new Intent();
        //调用Intent()实例的setAction()方法，并设置动作。
        intent.setAction(Intent.ACTION_VIEW);
        //调用Intent()实例的setData()方法，并设置访问地址。
        intent.setData(uri);
        //将Intent()实例传给目标活动，并启动目标活动.
        startActivity(intent);
    }
}

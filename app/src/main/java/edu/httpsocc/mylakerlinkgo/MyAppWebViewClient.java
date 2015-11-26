package edu.httpsocc.mylakerlinkgo;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by 130308 on 11/25/2015.
 */

public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(url.contains("mylakerlink.socc.edu/go")) {
            view.loadUrl(url);
        } else {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(i);
        }
        return true;
    }

    private void startActivity(Intent i) {
    }
}

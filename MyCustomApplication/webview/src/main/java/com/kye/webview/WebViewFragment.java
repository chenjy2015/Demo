package com.kye.webview;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import com.tencent.sonic.sdk.SonicConfig;
import com.tencent.sonic.sdk.SonicEngine;
import com.tencent.sonic.sdk.SonicSession;
import com.tencent.sonic.sdk.SonicSessionConfig;

import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

/**
 * 支持腾讯sonic的webview fragment
 */
@RuntimePermissions
public class WebViewFragment extends Fragment implements FragmentKeyDown {
    private static final String TAG            = "WebViewFragment";
    private final static String PARAM_URL      = "param_url";
    private final static String PARAM_USECACHE = "param_usecache";

    private SonicSession mSonicSession;
    private SonicSessionClientImpl mSonicSessionClient = null;

    private String mUrl;
    private boolean mOpenCache = false;
    private WebView     mWebView;
    private ProgressBar mProgressbar;

    private WebViewCallback mWebViewCallback;
    private boolean         mShowProgress;

    private OnReceiveErrorListener onReceiveErrorListener;
    private OnOverrideUrlLoadingListener onOverrideUrlLoadingListener;

    /**
     * 获取webviewFragment实例
     *
     * @param url       网页地址
     * @param openCache true:使用腾讯的sonic， false：使用android默认的webview
     *
     * @return
     */
    public static WebViewFragment newInstance(String url, boolean openCache) {
        Bundle args = new Bundle();
        args.putString(PARAM_URL, url);
        args.putBoolean(PARAM_USECACHE, openCache);
        WebViewFragment fragment = new WebViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_webview, container, false);
        mProgressbar = view.findViewById(R.id.progressBar);
        mProgressbar.setVisibility(isShowProgress() ? View.VISIBLE : View.GONE);
        Bundle bundle = getArguments();
        if (bundle != null) {
            mUrl = bundle.getString(PARAM_URL);
            mOpenCache = bundle.getBoolean(PARAM_USECACHE);
            if (mOpenCache) {
                initSonic();
                if (isMarshmallow()) {
                    WebViewFragmentPermissionsDispatcher.getStoragePermissionWithPermissionCheck(this);
                }
            }
            initWebView(view);
        }
        return view;
    }

    private void initSonic() {
        //这个最好写在application中
        if (!SonicEngine.isGetInstanceAllowed()) {
            SonicEngine.createInstance(new SonicRuntimeImpl(getActivity().getApplication()), new SonicConfig.Builder().build());
        }
        SonicSessionConfig.Builder sessionConfigBuilder = new SonicSessionConfig.Builder();
        sessionConfigBuilder.setSupportLocalServer(true);
        mSonicSession = SonicEngine.getInstance().createSession(mUrl, sessionConfigBuilder.build());
        if (null != mSonicSession) {
            mSonicSession.bindClient(mSonicSessionClient = new SonicSessionClientImpl());
        } else {
            if (BuildConfig.DEBUG) {
                Log.e(TAG, "create sonic session fail!");
            }
        }

    }

    private void initWebView(View rootView) {
        mWebView = rootView.findViewById(R.id.webview);
        WebSettings webSettings = mWebView.getSettings();
        webSettings = mWebViewCallback.onSetWeb(webSettings);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setSaveFormData(false);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        }

        if (mWebView != null) {
            mWebView.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    if (mSonicSession != null) {
                        mSonicSession.getSessionClient().pageFinish(url);
                    }
                }

                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                }

                @TargetApi(21)
                @Override
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
                    return shouldInterceptRequest(view, request.getUrl().toString());
                }

                @Override
                public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                    if (mSonicSession != null) {
                        return (WebResourceResponse) mSonicSession.getSessionClient().requestResource(url);
                    }
                    return null;
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    if (onOverrideUrlLoadingListener != null) {
                        return onOverrideUrlLoadingListener.shouldOverrideUrlLoadingCustom(view, request);
                    }
                    return super.shouldOverrideUrlLoading(view, request);
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    if (onOverrideUrlLoadingListener != null) {
                        return onOverrideUrlLoadingListener.shouldOverrideUrlLoadingCustom(view, url);
                    }
                    return super.shouldOverrideUrlLoading(view, url);
                }

                @Override
                public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                    super.onReceivedError(view, request, error);
                    if (onReceiveErrorListener != null) {
                        onReceiveErrorListener.onReceivedError(view, request, error);
                    }
                }
            });
            mWebView.setWebChromeClient(new WebChromeClient() {
                @Override
                public void onProgressChanged(WebView view, int newProgress) {
                    super.onProgressChanged(view, newProgress);
                    if (!mShowProgress) {
                        return;
                    }
                    mProgressbar.setProgress(newProgress);
                    if (newProgress == 100) {
                        mProgressbar.setVisibility(View.GONE);
                    } else {
                        mProgressbar.setVisibility(View.VISIBLE);
                    }
                }
            });
        }

        if (mWebView != null) {
            if (mSonicSessionClient != null) {
                mSonicSessionClient.bindWebView(mWebView);
                mSonicSessionClient.clientReady();
            } else {
                mWebView.loadUrl(mUrl);
            }
        }

        if (mWebViewCallback != null) {
            mWebViewCallback.callBack(mWebView);
        }
    }

    @Override
    public void onDestroyView() {
        if (null != mSonicSession) {
            mSonicSession.destroy();
            mSonicSession = null;
        }
        super.onDestroyView();
    }

    //=========================以下进行权限处理，如果用户需要打开缓存功能，就需要使用存储权限================

    /**
     * 是否是6.0以上
     *
     * @return
     */
    private boolean isMarshmallow() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        WebViewFragmentPermissionsDispatcher.onRequestPermissionsResult(this, requestCode, grantResults);
    }

    /**
     * 获取到了权限
     */
    @NeedsPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    public void getStoragePermission() {
    }

    /**
     * 给用户解释要请求什么权限，为什么需要此权限
     *
     * @param request
     */
    @OnShowRationale(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    public void showStorageRationale(final PermissionRequest request) {
        new AlertDialog.Builder(getActivity())
                .setMessage(R.string.rationale_for_storage_permission)
                .setPositiveButton(R.string.next_step, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        request.proceed();
                    }
                }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                request.cancel();
            }
        }).show();
    }

    /**
     * 用户拒绝了权限
     */
    @OnPermissionDenied(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    public void storageDenied() {
    }

    /**
     * 用户拒绝了权限并选择了不再询问
     */
    @OnNeverAskAgain(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    public void storageNeverAsk() {
    }

    //====================以下方法给外部调用==========================================================

    /**
     * 清除缓存
     */
    public void cleanCache() {
        SonicEngine.getInstance().cleanCache();
    }

    /**
     * 处理fragment(网页)返回
     */
    @Override
    public boolean onFragmentKeyDown(int keyCode, KeyEvent event) {
        if (mWebView != null) {
            if (mWebView.canGoBack()) {
                mWebView.goBack();
                return true;
            }
        }
        return false;
    }

    /**
     * 当webview初始化完成后会回调过去
     * 可以让获取者根据获取到的webview进行js和nativie交互
     *
     * @param callback
     */
    public void setWebViewCallback(WebViewCallback callback) {
        this.mWebViewCallback = callback;
    }

    public boolean isShowProgress() {
        return mShowProgress;
    }

    public void setShowProgress(boolean mShowProgress) {
        this.mShowProgress = mShowProgress;
    }

    public void setOnReceiveErrorListener(OnReceiveErrorListener onReceiveErrorListener) {
        this.onReceiveErrorListener = onReceiveErrorListener;
    }

    public abstract static class WebViewCallback {
        public abstract void callBack(WebView webView);

        public WebSettings onSetWeb(WebSettings webSettings) {
            return webSettings;
        }
    }

    public interface OnReceiveErrorListener {
        void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error);
    }

    public interface OnOverrideUrlLoadingListener {
        boolean shouldOverrideUrlLoadingCustom(WebView view, WebResourceRequest request);
        boolean shouldOverrideUrlLoadingCustom(WebView view, String url);
    }

    public void setOnOverrideUrlLoadingListener(OnOverrideUrlLoadingListener onOverrideUrlLoadingListener) {
        this.onOverrideUrlLoadingListener = onOverrideUrlLoadingListener;
    }
}

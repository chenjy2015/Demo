package com.kye.webview;

import android.view.KeyEvent;

/**
 * 处理fragment返回
 */

public interface FragmentKeyDown {

    boolean onFragmentKeyDown(int keyCode, KeyEvent event);
}

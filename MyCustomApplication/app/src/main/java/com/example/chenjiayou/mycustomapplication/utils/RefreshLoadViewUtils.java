package com.example.chenjiayou.mycustomapplication.utils;

import android.content.Context;
import android.support.annotation.NonNull;

import com.kye.express.view.refreshAndLoad.KyeLoadFooter;
import com.kye.express.view.refreshAndLoad.KyeRefreshHeader;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreater;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreater;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.footer.ClassicsFooter;
import com.scwang.smartrefresh.layout.header.ClassicsHeader;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 19/12/2017
 * @updated : 19/12/2017
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RefreshLoadViewUtils {

    /**
     * init when app start
     */
    public static void init() {
        SmartRefreshLayout.setDefaultRefreshHeaderCreater(new DefaultRefreshHeaderCreater() {
            @NonNull
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                // todo : 全局默认使用自定义刷新头
//                return new ClassicsHeader(context).setSpinnerStyle(SpinnerStyle.Translate);
                return new KyeRefreshHeader(context);
            }
        });
        SmartRefreshLayout.setDefaultRefreshFooterCreater(new DefaultRefreshFooterCreater() {
            @NonNull
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                // todo : 全局默认使用自定义加载头
//                return new ClassicsFooter(context).setSpinnerStyle(SpinnerStyle.Translate);
                return new KyeLoadFooter(context);
            }
        });
        // header @Deprecate
        ClassicsHeader.REFRESH_HEADER_PULLDOWN = "下拉可以刷新";
        ClassicsHeader.REFRESH_HEADER_REFRESHING = "正在刷新...";
        ClassicsHeader.REFRESH_HEADER_LOADING = "正在加载...";
        ClassicsHeader.REFRESH_HEADER_RELEASE = "释放立即刷新";
        ClassicsHeader.REFRESH_HEADER_FINISH = "刷新完成";
        ClassicsHeader.REFRESH_HEADER_FAILED = "刷新失败";
        ClassicsHeader.REFRESH_HEADER_LASTTIME = "上次更新 M-d HH:mm";
        // footer @Deprecate
        ClassicsFooter.REFRESH_FOOTER_PULLUP = "上拉加载更多";
        ClassicsFooter.REFRESH_FOOTER_RELEASE = "释放立即加载";
        ClassicsFooter.REFRESH_FOOTER_REFRESHING = "正在刷新...";
        ClassicsFooter.REFRESH_FOOTER_LOADING = "正在加载...";
        ClassicsFooter.REFRESH_FOOTER_FINISH = "加载完成";
        ClassicsFooter.REFRESH_FOOTER_FAILED = "加载失败";
        ClassicsFooter.REFRESH_FOOTER_ALLLOADED = "全部加载完成";
    }
}

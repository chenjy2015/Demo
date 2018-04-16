package com.kye.model.datasource;

import com.kye.model.base.RetrofitManager;
import com.kye.model.bean.OpenApiResult;
import com.kye.model.bean.redpacket.RequestRedPacketGetUserActivityInfo;
import com.kye.model.bean.redpacket.RequestRedPacketSendShareRedEnvelopes;
import com.kye.model.bean.redpacket.RequestRedPacketWinningPrizeResult;
import com.kye.model.bean.redpacket.ResponseRedPacketGetUserActivityInfo;
import com.kye.model.bean.redpacket.ResponseRedPacketSendShareRedEnvelopes;
import com.kye.model.bean.redpacket.ResponseRedPacketWinningPrizeResult;
import com.kye.model.service.RedPacketService;

import io.reactivex.Single;

/**
 * 摇红包 数据源
 * <p>
 * Created by SkyYu on 2018/3/27
 */
public class RedPacketDataSource {

    private RedPacketService mService;

    public RedPacketDataSource() {
        mService = RetrofitManager.getInstance().createService(RedPacketService.class);
    }

    public Single<OpenApiResult<ResponseRedPacketGetUserActivityInfo>> getUserActivityInfo(RequestRedPacketGetUserActivityInfo request) {
        return mService.getUserActivityInfo(request);
    }

    public Single<OpenApiResult<ResponseRedPacketGetUserActivityInfo>> nextActivityInfo(RequestRedPacketGetUserActivityInfo request) {
        return mService.nextActivityInfo(request);
    }

    public Single<OpenApiResult<ResponseRedPacketWinningPrizeResult>> winningPrizeResult(RequestRedPacketWinningPrizeResult request) {
        return mService.winningPrizeResult(request);
    }

    public Single<OpenApiResult<ResponseRedPacketSendShareRedEnvelopes>> sendShareRedEnvelopes(RequestRedPacketSendShareRedEnvelopes request) {
        return mService.sendShareRedEnvelopes(request);
    }


}

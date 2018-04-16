package com.kye.model.bean.logistics;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 16/01/2018
 * @updated : 16/01/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public interface LogisticsRecordStatusType {

    // 寄收记录(0寄件记录，1收件记录)
    int RECORD_RECEIVE = 0;
    int RECORD_SEND = 1;

    public static interface Status {

        // 寄收状态(0待取件，1待签收，2已签收，3已完结,4已取件，5今日已签收)
        int TO_TAKE = 0;
        int TO_SIGN = 1;
        int SIGNED = 2;
        int FINISHED = 3;
        int TAKEN = 4;
        int SIGN_TODAY = 5;
    }
}

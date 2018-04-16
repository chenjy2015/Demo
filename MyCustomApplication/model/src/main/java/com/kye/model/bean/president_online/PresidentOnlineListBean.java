package com.kye.model.bean.president_online;

import java.io.Serializable;
import java.util.List;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class PresidentOnlineListBean implements Serializable{


    /**
     * datas : [{"code":"WBLY1712-00029","kindType":"其他","replyAutoSrcExt":"0","resendAutoSize":"","isConsult":"False","editorState":1,"evaluateDetails":"","resendAutoSrc":"","autoSize":"0.00","forwardPeople":"","reply":"","replyAutoSrc":"","autoSrcExt":"0","resendAutoSrcExt":"0","isShield":"False","dataType":"外部APP","telephone":"18924656687","message":"留言测测6222测试2试测试测试的试信息","status2":"未处理","isImage":"有","createDepartment":"深圳仁美","atoSrc":"","createTime":"2017-12-18 10:04:29","replyAutoSize":"","isOver":"False","guid":"9855D55D613C4178B884C4884366BBCF","createPeople":"测试","evaluate":"","isReply":"False","status":"未回复"}]
     * recordCount : 0
     * pageSize : 10
     */

    private int recordCount;
    private int pageSize;
    private List<DatasBean> datas;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean implements Serializable{

        /**
         * code : WBLY1801-00187
         * message :
         * createPeople : 李女士
         * createTime : 2018-01-12 11:58:42
         * createDepartment : 北京泰诺恩
         * telephone : 18124601223
         * dataType : 外部APP
         * isReply : false
         * isShield : false
         * forwardPeople :
         * isConsult : false
         * reply :
         * isOver : false
         * messageClass : 安全
         * guid : 31562EB6A0A5423E815C65D21E574C08
         * comment :
         * commentDetail :
         * replyStatus : 未回复
         * handleStatus : 未处理
         * audioSrc : ~/Data/File/20180112/148fa5b06c7d4dc5a4cbf057ca1d024e/148fa5b06c7d4dc5a4cbf057ca1d024e.mp3
         * isAudio : true
         * audioSize : 3.0
         * replyAudioSrc :
         * replyAudioSize :
         * resendAudioSrc :
         * resendAudioSize :
         * isImage : false
         * isReplyAudio : false
         * isResendAudio : false
         * transferReply : null
         * isEdit : false
         */

        private String code;
        private String message;
        private String createPeople;
        private String createTime;
        private String createDepartment;
        private String telephone;
        private String dataType;
        private boolean isReply;
        private boolean isShield;
        private String forwardPeople;
        private boolean isConsult;
        private String reply;
        private boolean isOver;
        private String messageClass;
        private String guid;
        private String comment;
        private String commentDetail;
        private String replyStatus;
        private String handleStatus;
        private String audioSrc;
        private boolean isAudio;
        private double audioSize;
        private String replyAudioSrc;
        private String replyAudioSize;
        private String resendAudioSrc;
        private String resendAudioSize;
        private boolean isImage;
        private boolean isReplyAudio;
        private boolean isResendAudio;
        private Object transferReply;
        private boolean isEdit;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getCreatePeople() {
            return createPeople;
        }

        public void setCreatePeople(String createPeople) {
            this.createPeople = createPeople;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getCreateDepartment() {
            return createDepartment;
        }

        public void setCreateDepartment(String createDepartment) {
            this.createDepartment = createDepartment;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public boolean isIsReply() {
            return isReply;
        }

        public void setIsReply(boolean isReply) {
            this.isReply = isReply;
        }

        public boolean isIsShield() {
            return isShield;
        }

        public void setIsShield(boolean isShield) {
            this.isShield = isShield;
        }

        public String getForwardPeople() {
            return forwardPeople;
        }

        public void setForwardPeople(String forwardPeople) {
            this.forwardPeople = forwardPeople;
        }

        public boolean isIsConsult() {
            return isConsult;
        }

        public void setIsConsult(boolean isConsult) {
            this.isConsult = isConsult;
        }

        public String getReply() {
            return reply;
        }

        public void setReply(String reply) {
            this.reply = reply;
        }

        public boolean isIsOver() {
            return isOver;
        }

        public void setIsOver(boolean isOver) {
            this.isOver = isOver;
        }

        public String getMessageClass() {
            return messageClass;
        }

        public void setMessageClass(String messageClass) {
            this.messageClass = messageClass;
        }

        public String getGuid() {
            return guid;
        }

        public void setGuid(String guid) {
            this.guid = guid;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getCommentDetail() {
            return commentDetail;
        }

        public void setCommentDetail(String commentDetail) {
            this.commentDetail = commentDetail;
        }

        public String getReplyStatus() {
            return replyStatus;
        }

        public void setReplyStatus(String replyStatus) {
            this.replyStatus = replyStatus;
        }

        public String getHandleStatus() {
            return handleStatus;
        }

        public void setHandleStatus(String handleStatus) {
            this.handleStatus = handleStatus;
        }

        public String getAudioSrc() {
            return audioSrc;
        }

        public void setAudioSrc(String audioSrc) {
            this.audioSrc = audioSrc;
        }

        public boolean isIsAudio() {
            return isAudio;
        }

        public void setIsAudio(boolean isAudio) {
            this.isAudio = isAudio;
        }

        public double getAudioSize() {
            return audioSize;
        }

        public void setAudioSize(double audioSize) {
            this.audioSize = audioSize;
        }

        public String getReplyAudioSrc() {
            return replyAudioSrc;
        }

        public void setReplyAudioSrc(String replyAudioSrc) {
            this.replyAudioSrc = replyAudioSrc;
        }

        public String getReplyAudioSize() {
            return replyAudioSize;
        }

        public void setReplyAudioSize(String replyAudioSize) {
            this.replyAudioSize = replyAudioSize;
        }

        public String getResendAudioSrc() {
            return resendAudioSrc;
        }

        public void setResendAudioSrc(String resendAudioSrc) {
            this.resendAudioSrc = resendAudioSrc;
        }

        public String getResendAudioSize() {
            return resendAudioSize;
        }

        public void setResendAudioSize(String resendAudioSize) {
            this.resendAudioSize = resendAudioSize;
        }

        public boolean isIsImage() {
            return isImage;
        }

        public void setIsImage(boolean isImage) {
            this.isImage = isImage;
        }

        public boolean isIsReplyAudio() {
            return isReplyAudio;
        }

        public void setIsReplyAudio(boolean isReplyAudio) {
            this.isReplyAudio = isReplyAudio;
        }

        public boolean isIsResendAudio() {
            return isResendAudio;
        }

        public void setIsResendAudio(boolean isResendAudio) {
            this.isResendAudio = isResendAudio;
        }

        public Object getTransferReply() {
            return transferReply;
        }

        public void setTransferReply(Object transferReply) {
            this.transferReply = transferReply;
        }

        public boolean isIsEdit() {
            return isEdit;
        }

        public void setIsEdit(boolean isEdit) {
            this.isEdit = isEdit;
        }
    }
}

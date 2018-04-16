package com.kye.model.bean.president_online;

import java.util.List;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class PresidentOnlineResBean {


    /**
     * recordCount : 1
     * codeType : 1
     * audio : {"audioBs64":"bG0=","audioSize":"0.00"}
     * picture : []
     */

    private int recordCount;
    private String codeType;
    private AudioBean audio;
    private List<String> picture;

    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public AudioBean getAudio() {
        return audio;
    }

    public void setAudio(AudioBean audio) {
        this.audio = audio;
    }

    public List<String> getPicture() {
        return picture;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    public static class AudioBean {
        /**
         * audioBs64 : bG0=
         * audioSize : 0.00
         */

        private String audioBs64;
        private String audioSize;

        public String getAudioBs64() {
            return audioBs64;
        }

        public void setAudioBs64(String audioBs64) {
            this.audioBs64 = audioBs64;
        }

        public String getAudioSize() {
            return audioSize;
        }

        public void setAudioSize(String audioSize) {
            this.audioSize = audioSize;
        }
    }
}

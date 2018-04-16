package com.kye.model.bean.tcl;

import android.webkit.JavascriptInterface;

public class ResponseTCLGoodsDetailsBean {

    /**
     * productId : 1
     * productName : 电视
     * productypeName : 乐视
     * screenAv : 曲面
     * price : 6500
     * timbre : {"kardon":true,"nautilus":true,"independentdrive":true}
     * resources : {"tencentTv":true,"friendsSong":true,"weChat":true,"sports":true}
     * screen : 宽屏
     * screenSize : 65.00
     * operation : {"system":"true","remoteControl":"true"}
     * hardware : {"processor":"处理器","ramandrom":"ram","wifi":"wifi","hdmiAndUsb":true,"dts":false,"microphone":true}
     * picture : {"material":{"displaymaterial":true},"resolving":"1080p","gamutValue":"广色域","nit":false,"engine":{"colorcontrol":true,"colorreduction":true,"brightnesscontrol":true,"mixedlight":true},"imagequality":{"localDimming":true,"hdr":true,"memc":true,"crystal":true}}
     * tvSize : {"contrainbase":"底座","notContrainbase":"不含底座"}
     */

    private String productId;
    private String productName;
    private String productypeName;
    private String screenAv;
    private String price;
    private TimbreBean timbre;
    private ResourcesBean resources;
    private String screen;
    private String screenSize;
    private OperationBean operation;
    private HardwareBean hardware;
    private PictureBean picture;
    private TvSizeBean tvSize;

    @JavascriptInterface
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JavascriptInterface
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @JavascriptInterface
    public String getProductypeName() {
        return productypeName;
    }

    public void setProductypeName(String productypeName) {
        this.productypeName = productypeName;
    }

    @JavascriptInterface
    public String getScreenAv() {
        return screenAv;
    }

    public void setScreenAv(String screenAv) {
        this.screenAv = screenAv;
    }

    @JavascriptInterface
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @JavascriptInterface
    public TimbreBean getTimbre() {
        return timbre;
    }

    public void setTimbre(TimbreBean timbre) {
        this.timbre = timbre;
    }

    @JavascriptInterface
    public ResourcesBean getResources() {
        return resources;
    }

    public void setResources(ResourcesBean resources) {
        this.resources = resources;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    @JavascriptInterface
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @JavascriptInterface
    public OperationBean getOperation() {
        return operation;
    }

    public void setOperation(OperationBean operation) {
        this.operation = operation;
    }

    @JavascriptInterface
    public HardwareBean getHardware() {
        return hardware;
    }

    public void setHardware(HardwareBean hardware) {
        this.hardware = hardware;
    }

    @JavascriptInterface
    public PictureBean getPicture() {
        return picture;
    }

    public void setPicture(PictureBean picture) {
        this.picture = picture;
    }

    @JavascriptInterface
    public TvSizeBean getTvSize() {
        return tvSize;
    }

    public void setTvSize(TvSizeBean tvSize) {
        this.tvSize = tvSize;
    }

    public static class TimbreBean {
        /**
         * kardon : true
         * nautilus : true
         * independentdrive : true
         */

        private boolean kardon;
        private boolean nautilus;
        private boolean independentdrive;

        @JavascriptInterface
        public boolean isKardon() {
            return kardon;
        }

        public void setKardon(boolean kardon) {
            this.kardon = kardon;
        }

        @JavascriptInterface
        public boolean isNautilus() {
            return nautilus;
        }

        public void setNautilus(boolean nautilus) {
            this.nautilus = nautilus;
        }

        @JavascriptInterface
        public boolean isIndependentdrive() {
            return independentdrive;
        }

        public void setIndependentdrive(boolean independentdrive) {
            this.independentdrive = independentdrive;
        }
    }

    public static class ResourcesBean {
        /**
         * tencentTv : true
         * friendsSong : true
         * weChat : true
         * sports : true
         */

        private boolean tencentTv;
        private boolean friendsSong;
        private boolean weChat;
        private boolean sports;

        @JavascriptInterface
        public boolean isTencentTv() {
            return tencentTv;
        }

        public void setTencentTv(boolean tencentTv) {
            this.tencentTv = tencentTv;
        }

        @JavascriptInterface
        public boolean isFriendsSong() {
            return friendsSong;
        }

        public void setFriendsSong(boolean friendsSong) {
            this.friendsSong = friendsSong;
        }

        @JavascriptInterface
        public boolean isWeChat() {
            return weChat;
        }

        public void setWeChat(boolean weChat) {
            this.weChat = weChat;
        }

        @JavascriptInterface
        public boolean isSports() {
            return sports;
        }

        public void setSports(boolean sports) {
            this.sports = sports;
        }
    }

    public static class OperationBean {
        /**
         * system : true
         * remoteControl : true
         */

        private String system;
        private String remoteControl;

        @JavascriptInterface
        public String getSystem() {
            return system;
        }

        public void setSystem(String system) {
            this.system = system;
        }

        @JavascriptInterface
        public String getRemoteControl() {
            return remoteControl;
        }

        public void setRemoteControl(String remoteControl) {
            this.remoteControl = remoteControl;
        }
    }

    public static class HardwareBean {
        /**
         * processor : 处理器
         * ramandrom : ram
         * wifi : wifi
         * hdmiAndUsb : true
         * dts : false
         * microphone : true
         */

        private String processor;
        private String ramandrom;
        private String wifi;
        private boolean hdmiAndUsb;
        private boolean dts;
        private boolean microphone;

        @JavascriptInterface
        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        @JavascriptInterface
        public String getRamandrom() {
            return ramandrom;
        }

        public void setRamandrom(String ramandrom) {
            this.ramandrom = ramandrom;
        }

        @JavascriptInterface
        public String getWifi() {
            return wifi;
        }

        public void setWifi(String wifi) {
            this.wifi = wifi;
        }

        @JavascriptInterface
        public boolean isHdmiAndUsb() {
            return hdmiAndUsb;
        }

        public void setHdmiAndUsb(boolean hdmiAndUsb) {
            this.hdmiAndUsb = hdmiAndUsb;
        }

        @JavascriptInterface
        public boolean isDts() {
            return dts;
        }

        public void setDts(boolean dts) {
            this.dts = dts;
        }

        @JavascriptInterface
        public boolean isMicrophone() {
            return microphone;
        }

        public void setMicrophone(boolean microphone) {
            this.microphone = microphone;
        }
    }

    public static class PictureBean {
        /**
         * material : {"displaymaterial":true}
         * resolving : 1080p
         * gamutValue : 广色域
         * nit : false
         * engine : {"colorcontrol":true,"colorreduction":true,"brightnesscontrol":true,"mixedlight":true}
         * imagequality : {"localDimming":true,"hdr":true,"memc":true,"crystal":true}
         */

        private MaterialBean material;
        private String resolving;
        private String gamutValue;
        private boolean nit;
        private EngineBean engine;
        private ImagequalityBean imagequality;

        @JavascriptInterface
        public MaterialBean getMaterial() {
            return material;
        }

        public void setMaterial(MaterialBean material) {
            this.material = material;
        }

        @JavascriptInterface
        public String getResolving() {
            return resolving;
        }

        public void setResolving(String resolving) {
            this.resolving = resolving;
        }

        @JavascriptInterface
        public String getGamutValue() {
            return gamutValue;
        }

        public void setGamutValue(String gamutValue) {
            this.gamutValue = gamutValue;
        }

        @JavascriptInterface
        public boolean isNit() {
            return nit;
        }

        public void setNit(boolean nit) {
            this.nit = nit;
        }

        @JavascriptInterface
        public EngineBean getEngine() {
            return engine;
        }

        public void setEngine(EngineBean engine) {
            this.engine = engine;
        }

        @JavascriptInterface
        public ImagequalityBean getImagequality() {
            return imagequality;
        }

        public void setImagequality(ImagequalityBean imagequality) {
            this.imagequality = imagequality;
        }

        public static class MaterialBean {
            /**
             * displaymaterial : true
             */

            private boolean displaymaterial;

            @JavascriptInterface
            public boolean isDisplaymaterial() {
                return displaymaterial;
            }

            public void setDisplaymaterial(boolean displaymaterial) {
                this.displaymaterial = displaymaterial;
            }
        }

        public static class EngineBean {
            /**
             * colorcontrol : true
             * colorreduction : true
             * brightnesscontrol : true
             * mixedlight : true
             */

            private boolean colorcontrol;
            private boolean colorreduction;
            private boolean brightnesscontrol;
            private boolean mixedlight;

            @JavascriptInterface
            public boolean isColorcontrol() {
                return colorcontrol;
            }

            public void setColorcontrol(boolean colorcontrol) {
                this.colorcontrol = colorcontrol;
            }

            @JavascriptInterface
            public boolean isColorreduction() {
                return colorreduction;
            }

            public void setColorreduction(boolean colorreduction) {
                this.colorreduction = colorreduction;
            }

            @JavascriptInterface
            public boolean isBrightnesscontrol() {
                return brightnesscontrol;
            }

            public void setBrightnesscontrol(boolean brightnesscontrol) {
                this.brightnesscontrol = brightnesscontrol;
            }

            @JavascriptInterface
            public boolean isMixedlight() {
                return mixedlight;
            }

            public void setMixedlight(boolean mixedlight) {
                this.mixedlight = mixedlight;
            }
        }

        public static class ImagequalityBean {
            /**
             * localDimming : true
             * hdr : true
             * memc : true
             * crystal : true
             */

            private boolean localDimming;
            private boolean hdr;
            private boolean memc;
            private boolean crystal;

            @JavascriptInterface
            public boolean isLocalDimming() {
                return localDimming;
            }

            public void setLocalDimming(boolean localDimming) {
                this.localDimming = localDimming;
            }

            @JavascriptInterface
            public boolean isHdr() {
                return hdr;
            }

            public void setHdr(boolean hdr) {
                this.hdr = hdr;
            }

            @JavascriptInterface
            public boolean isMemc() {
                return memc;
            }

            public void setMemc(boolean memc) {
                this.memc = memc;
            }

            @JavascriptInterface
            public boolean isCrystal() {
                return crystal;
            }

            public void setCrystal(boolean crystal) {
                this.crystal = crystal;
            }
        }
    }

    public static class TvSizeBean {
        /**
         * contrainbase : 底座
         * notContrainbase : 不含底座
         */

        private String contrainbase;
        private String notContrainbase;

        @JavascriptInterface
        public String getContrainbase() {
            return contrainbase;
        }

        public void setContrainbase(String contrainbase) {
            this.contrainbase = contrainbase;
        }

        @JavascriptInterface
        public String getNotContrainbase() {
            return notContrainbase;
        }

        public void setNotContrainbase(String notContrainbase) {
            this.notContrainbase = notContrainbase;
        }
    }
}
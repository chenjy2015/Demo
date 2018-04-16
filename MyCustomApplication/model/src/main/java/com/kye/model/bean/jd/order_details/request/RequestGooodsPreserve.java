package com.kye.model.bean.jd.order_details.request;

import com.google.gson.annotations.SerializedName;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 02/02/2018
 * @updated : 02/02/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestGooodsPreserve {

    /**
     * phone : 18924656687
     * jdOrderId : 47615822767
     * customerExpect : 30
     * productProblem : 123
     * isPresentation : true
     * problem : 测试
     * isPacking : true
     * description : 0
     * asCustomerDto : {"contactPeople":"yhj","telephone":"13810343698","mobilePhone":"13810343698","email":"123456@163.com","postcode":"065201"}
     * senderdate : {"senderType":40,"senderProvince":1,"senderCity":72,"senderCounty":2839,"senderVillage":0,"senderAddress":"test"}
     * returngoods : {"returnType":10,"returnProvince":2839,"returnCity":72,"returnCounty":1,"returnVillage":0,"returnAddress":"111"}
     * detailed : {"skuId":585893,"goodsNumber":1}
     */

    @SerializedName("phone")
    private String phone;
    @SerializedName("jdOrderId")
    private long jdOrderId;
    @SerializedName("customerExpect")
    private int customerExpect;
    @SerializedName("productProblem")
    private String productProblem;
    @SerializedName("isPresentation")
    private boolean isPresentation;
    @SerializedName("problem")
    private String problem;
    @SerializedName("isPacking")
    private boolean isPacking;
    @SerializedName("description")
    private int description;
    @SerializedName("asCustomerDto")
    private AsCustomerDtoBean asCustomerDto;
    @SerializedName("senderdate")
    private SenderdateBean senderdate;
    @SerializedName("returngoods")
    private ReturngoodsBean returngoods;
    @SerializedName("detailed")
    private DetailedBean detailed;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getJdOrderId() {
        return jdOrderId;
    }

    public void setJdOrderId(long jdOrderId) {
        this.jdOrderId = jdOrderId;
    }

    public int getCustomerExpect() {
        return customerExpect;
    }

    public void setCustomerExpect(int customerExpect) {
        this.customerExpect = customerExpect;
    }

    public String getProductProblem() {
        return productProblem;
    }

    public void setProductProblem(String productProblem) {
        this.productProblem = productProblem;
    }

    public boolean isIsPresentation() {
        return isPresentation;
    }

    public void setIsPresentation(boolean isPresentation) {
        this.isPresentation = isPresentation;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public boolean isIsPacking() {
        return isPacking;
    }

    public void setIsPacking(boolean isPacking) {
        this.isPacking = isPacking;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public AsCustomerDtoBean getAsCustomerDto() {
        return asCustomerDto;
    }

    public void setAsCustomerDto(AsCustomerDtoBean asCustomerDto) {
        this.asCustomerDto = asCustomerDto;
    }

    public SenderdateBean getSenderdate() {
        return senderdate;
    }

    public void setSenderdate(SenderdateBean senderdate) {
        this.senderdate = senderdate;
    }

    public ReturngoodsBean getReturngoods() {
        return returngoods;
    }

    public void setReturngoods(ReturngoodsBean returngoods) {
        this.returngoods = returngoods;
    }

    public DetailedBean getDetailed() {
        return detailed;
    }

    public void setDetailed(DetailedBean detailed) {
        this.detailed = detailed;
    }

    public static class AsCustomerDtoBean {
        /**
         * contactPeople : yhj
         * telephone : 13810343698
         * mobilePhone : 13810343698
         * email : 123456@163.com
         * postcode : 065201
         */

        @SerializedName("contactPeople")
        private String contactPeople;
        @SerializedName("telephone")
        private String telephone;
        @SerializedName("mobilePhone")
        private String mobilePhone;
        @SerializedName("email")
        private String email;
        @SerializedName("postcode")
        private String postcode;

        public String getContactPeople() {
            return contactPeople;
        }

        public void setContactPeople(String contactPeople) {
            this.contactPeople = contactPeople;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }
    }

    public static class SenderdateBean {
        /**
         * senderType : 40
         * senderProvince : 1
         * senderCity : 72
         * senderCounty : 2839
         * senderVillage : 0
         * senderAddress : test
         */

        @SerializedName("senderType")
        private int senderType;
        @SerializedName("senderProvince")
        private int senderProvince;
        @SerializedName("senderCity")
        private int senderCity;
        @SerializedName("senderCounty")
        private int senderCounty;
        @SerializedName("senderVillage")
        private int senderVillage;
        @SerializedName("senderAddress")
        private String senderAddress;

        public int getSenderType() {
            return senderType;
        }

        public void setSenderType(int senderType) {
            this.senderType = senderType;
        }

        public int getSenderProvince() {
            return senderProvince;
        }

        public void setSenderProvince(int senderProvince) {
            this.senderProvince = senderProvince;
        }

        public int getSenderCity() {
            return senderCity;
        }

        public void setSenderCity(int senderCity) {
            this.senderCity = senderCity;
        }

        public int getSenderCounty() {
            return senderCounty;
        }

        public void setSenderCounty(int senderCounty) {
            this.senderCounty = senderCounty;
        }

        public int getSenderVillage() {
            return senderVillage;
        }

        public void setSenderVillage(int senderVillage) {
            this.senderVillage = senderVillage;
        }

        public String getSenderAddress() {
            return senderAddress;
        }

        public void setSenderAddress(String senderAddress) {
            this.senderAddress = senderAddress;
        }
    }

    public static class ReturngoodsBean {
        /**
         * returnType : 10
         * returnProvince : 2839
         * returnCity : 72
         * returnCounty : 1
         * returnVillage : 0
         * returnAddress : 111
         */

        @SerializedName("returnType")
        private int returnType;
        @SerializedName("returnProvince")
        private int returnProvince;
        @SerializedName("returnCity")
        private int returnCity;
        @SerializedName("returnCounty")
        private int returnCounty;
        @SerializedName("returnVillage")
        private int returnVillage;
        @SerializedName("returnAddress")
        private String returnAddress;

        public int getReturnType() {
            return returnType;
        }

        public void setReturnType(int returnType) {
            this.returnType = returnType;
        }

        public int getReturnProvince() {
            return returnProvince;
        }

        public void setReturnProvince(int returnProvince) {
            this.returnProvince = returnProvince;
        }

        public int getReturnCity() {
            return returnCity;
        }

        public void setReturnCity(int returnCity) {
            this.returnCity = returnCity;
        }

        public int getReturnCounty() {
            return returnCounty;
        }

        public void setReturnCounty(int returnCounty) {
            this.returnCounty = returnCounty;
        }

        public int getReturnVillage() {
            return returnVillage;
        }

        public void setReturnVillage(int returnVillage) {
            this.returnVillage = returnVillage;
        }

        public String getReturnAddress() {
            return returnAddress;
        }

        public void setReturnAddress(String returnAddress) {
            this.returnAddress = returnAddress;
        }
    }

    public static class DetailedBean {
        /**
         * skuId : 585893
         * goodsNumber : 1
         */

        @SerializedName("skuId")
        private int skuId;
        @SerializedName("goodsNumber")
        private int goodsNumber;

        public int getSkuId() {
            return skuId;
        }

        public void setSkuId(int skuId) {
            this.skuId = skuId;
        }

        public int getGoodsNumber() {
            return goodsNumber;
        }

        public void setGoodsNumber(int goodsNumber) {
            this.goodsNumber = goodsNumber;
        }
    }
}

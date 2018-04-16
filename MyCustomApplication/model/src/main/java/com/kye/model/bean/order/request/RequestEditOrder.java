package com.kye.model.bean.order.request;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author : Joe
 * @version : 1.0
 * @editor : Joe
 * @created : 03/03/2018
 * @updated : 03/03/2018
 * @description : <Description>
 * @update_reason : <UpdateReason>
 */

public class RequestEditOrder implements Serializable {

//    editType	string	是	2	类型(根据前端点击编辑的动作，如果点击编辑传1，点击删除传2)
//    editTime	string	否	2017-03-23 23:23:19.000	编辑时间 (前端传给我们，客户点击编辑时的本地时间)
//    submitTime	string	否	2017-05-23 23:23:19.000	提交时间 (前端传给我们，客户点击保存时的本地时间)
//    phone	string	是	15818415911	登录账号
//    orderTelphone	string	是	15818415911	下单电话
//    companyCode	string	是	75519398828	客户编码
//    orderMan	string	是	郭蒸央	下单联系人
//    totalNumber	string	是	30	总件数
//    address	string	是	广东省深圳市龙岗区横岗街道保安社区（接口部测试用110）	取货地址
//    goodTime	string	是	2018-01-04T22:20	货好时间
//    remark	string	否	abCde1111f	备注
//    commodities	string	是	测试	托寄物
//    orderCompany	string	是	接口部测试	下单公司
//    orderCode	string	否	XD1801-0005872	下单编码
//    telephone	string	否	1234567891	固定电话
//    orderSource	string	是	3	下单来源(判断0微信下单，1 APP下单，2 QQ公众号下单，3 安卓下单，4 IOS下单，5 官网下单、6微官网下单 7，Pc端下单)
//    totalpoll	string	否	1	总票数
//    destination1	string	否	四川省成都市	目的地1
//    serviceMode1	string	否	次日达	服务方式1
//    weight1	string	否	10	重量1
//    destination2	string	否	广东省深圳市	目的地2
//    serviceMode2	string	否	隔日达	服务方式2
//    weight2	string	否	50	重量2
//    destination3	string	否	江西省赣州市	目的地3
//    serviceMode3	string	否	次日达	服务方式3
//    weight3	string	否	30	重量3
//    getTelphone	string	否		取货人联系电话
//    temporaryAddress	string	否		临时取货地址
//    size	string	否	超大件	尺寸
//    volume	string	否	30.40.50	体积

    /**
     * editType : 2
     * editTime : 2017-03-23 23:23:19.000
     * submitTime : 2017-05-23 23:23:19.000
     * phone : 15818415911
     * orderTelphone : 15818415911
     * companyCode : 75519398828
     * orderMan : 郭蒸央
     * totalNumber : 30
     * address : 广东省深圳市龙岗区横岗街道保安社区（接口部测试用110）
     * goodTime : 2018-01-04T22:20
     * remark : abCde1111f
     * commodities : 测试
     * orderCompany : 接口部测试
     * orderCode : XD1801-0005872
     * telephone : 1234567891
     * orderSource : 3
     * totalPoll : 1
     * destination1 : 四川省成都市
     * serviceMode1 : 次日达
     * weight1 : 10
     * destination2 : 广东省深圳市
     * serviceMode2 : 隔日达
     * weight2 : 50
     * destination3 : 江西省赣州市
     * serviceMode3 : 次日达
     * weight3 : 30
     * getTelphone : 98jx
     * temporaryAddress : i5f0
     * size : 超大件
     * volume : 30.40.50
     */

    @SerializedName("editType")
    private String editType;
    @SerializedName("editTime")
    private String editTime;
    @SerializedName("submitTime")
    private String submitTime;
    @SerializedName("phone")
    private String phone;
    @SerializedName("orderTelphone")
    private String orderTelphone;
    @SerializedName("companyCode")
    private String companyCode;
    @SerializedName("orderMan")
    private String orderMan;
    @SerializedName("totalNumber")
    private String totalNumber;
    @SerializedName("address")
    private String address;
    @SerializedName("goodTime")
    private String goodTime;
    @SerializedName("remark")
    private String remark;
    @SerializedName("commodities")
    private String commodities;
    @SerializedName("orderCompany")
    private String orderCompany;
    @SerializedName("orderCode")
    private String orderCode;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("orderSource")
    private String orderSource;
    @SerializedName("totalPoll")
    private String totalPoll;
    @SerializedName("destination1")
    private String destination1;
    @SerializedName("serviceMode1")
    private String serviceMode1;
    @SerializedName("weight1")
    private String weight1;
    @SerializedName("destination2")
    private String destination2;
    @SerializedName("serviceMode2")
    private String serviceMode2;
    @SerializedName("weight2")
    private String weight2;
    @SerializedName("destination3")
    private String destination3;
    @SerializedName("serviceMode3")
    private String serviceMode3;
    @SerializedName("weight3")
    private String weight3;
    @SerializedName("getTelphone")
    private String getTelphone;
    @SerializedName("temporaryAddress")
    private String temporaryAddress;
    @SerializedName("size")
    private String size;
    @SerializedName("volume")
    private String volume;

    @SerializedName("temporaryAddressGuid")
    private String temporaryAddressGuid;

    public String getTemporaryAddressGuid() {
        return temporaryAddressGuid;
    }

    public void setTemporaryAddressGuid(String temporaryAddressGuid) {
        this.temporaryAddressGuid = temporaryAddressGuid;
    }

    public String getEditType() {
        return editType;
    }

    public void setEditType(String editType) {
        this.editType = editType;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrderTelphone() {
        return orderTelphone;
    }

    public void setOrderTelphone(String orderTelphone) {
        this.orderTelphone = orderTelphone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getOrderMan() {
        return orderMan;
    }

    public void setOrderMan(String orderMan) {
        this.orderMan = orderMan;
    }

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoodTime() {
        return goodTime;
    }

    public void setGoodTime(String goodTime) {
        this.goodTime = goodTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCommodities() {
        return commodities;
    }

    public void setCommodities(String commodities) {
        this.commodities = commodities;
    }

    public String getOrderCompany() {
        return orderCompany;
    }

    public void setOrderCompany(String orderCompany) {
        this.orderCompany = orderCompany;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getTotalPoll() {
        return totalPoll;
    }

    public void setTotalPoll(String totalPoll) {
        this.totalPoll = totalPoll;
    }

    public String getDestination1() {
        return destination1;
    }

    public void setDestination1(String destination1) {
        this.destination1 = destination1;
    }

    public String getServiceMode1() {
        return serviceMode1;
    }

    public void setServiceMode1(String serviceMode1) {
        this.serviceMode1 = serviceMode1;
    }

    public String getWeight1() {
        return weight1;
    }

    public void setWeight1(String weight1) {
        this.weight1 = weight1;
    }

    public String getDestination2() {
        return destination2;
    }

    public void setDestination2(String destination2) {
        this.destination2 = destination2;
    }

    public String getServiceMode2() {
        return serviceMode2;
    }

    public void setServiceMode2(String serviceMode2) {
        this.serviceMode2 = serviceMode2;
    }

    public String getWeight2() {
        return weight2;
    }

    public void setWeight2(String weight2) {
        this.weight2 = weight2;
    }

    public String getDestination3() {
        return destination3;
    }

    public void setDestination3(String destination3) {
        this.destination3 = destination3;
    }

    public String getServiceMode3() {
        return serviceMode3;
    }

    public void setServiceMode3(String serviceMode3) {
        this.serviceMode3 = serviceMode3;
    }

    public String getWeight3() {
        return weight3;
    }

    public void setWeight3(String weight3) {
        this.weight3 = weight3;
    }

    public String getGetTelphone() {
        return getTelphone;
    }

    public void setGetTelphone(String getTelphone) {
        this.getTelphone = getTelphone;
    }

    public String getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(String temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}

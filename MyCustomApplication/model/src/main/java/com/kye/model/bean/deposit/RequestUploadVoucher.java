package com.kye.model.bean.deposit;

/**
 * Created by SkyYu on 2018/1/20
 */
public class RequestUploadVoucher {

    /**
     * phone : 18924656687
     * companyCode : 75519398828
     */

    private String phone;
    private String companyCode;

    /**
     * paymentCompany : 支付公司
     * paymentMoney : 收款金额
     * picture : ["aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWNPUy9KQmt5NUlzK1lFZGJHUmIxemE0Qmt3SWNXSWcwTWVVVGdpRnRqQUZnaUZ0MHJRenpMUS9PcDFwU0NlaGRCTGEwbVRTZjBtaFRjTFFRRHJZTG1DN0JodjhrUHlJd2JZa1czNUl0bVc5ZlBXNDc2NTNkdmJIL3RqdmZPYzc1eXhSWHVkbVdaYm5lWlZhSlFPRlQ2Y0pTV1pjcnRkZlAxdFpXU1VDd0F2QzlTKy9lTmovME8vM1FZUWdoQXpEWEx4NDBXRzNyNFNXdTdxN1Y4SXJ6MjNkV2xOVDQ1OE5QQmtjWkRrT0NUeGZrSitQdDh2bEduenlKSk5tTnhMeHg4TkRrZDlIR2hqR1VlSllESWM3LzljYldWM1RxdFZBbEZTSXFxMnNLcmRZdmFQZWpXd21SNmVqVkZGM2ZWMlpzelFVWEtBSUlBazhxbWxnNm5jMElCbDhwMzEvODY2ZE1zOERUdmp6aHg5T1RFMEUvUDRjclpibmVGNlNLVWhLdkNnQXhaQ2JtNWVmcjlmcjNLNXRTWll0TnBuc1ZtdUNTMDh2QlVWSTJvdHQ0ZkFJRW1YUldXekxKSkxoVUVoV2xKbUEzMmcwaWlTdXFIQXN4cDFDRklJRUNTQUVKQ2tCb0NqS2VuU2RvaWlielZvZzhGQkZCNWVYZXI2NmswbG5EaDE0eGJhekpaWk5JWU11cDhicTZCcnY3RnRjaXNaaVQrZjl1L1k5bjI4cmtqMHlVaFQ4bkNqaldoS3VvZ2c4Z1ZDS1RmcG1acGFYRmgxT3gybzgydFZ6ZjhMakxUTGtTNEN1c0R1QlhzM1JKR3piZitCN3J4eTgyOVgxeEROYVVsVGNjZUU4cjhnQ3g3WHQzVnRSV3VieGVoUlpoZ1JHU1NwQW9XbGFUZE94OWZVOGc5N2R3QVJEeThORHc2VWxEbGZWVmdRUnkzT1B2TVBkOSs3Qk14M25LdXZya21KMmJIejgyKzBIMnR2YXJJVVdpN2xRcFZFaG1ocDhOQUFraWFJcGg5TkowYlFnaUtJa3JxK3RMUzB1Q2lKZlhyR2xxYzdkNkdaS3Q1UnpRTGx4NitaL2J0K0poRmVJY0RUS3F0SGRudnVUUTk3VHJ4NUxSbU96TXpQKzROeDBZR1p5Yk53M1BxbEJxS3FtT3A1SUxDd3NZY0E4eDhtU2lNc1VtczFOemMzN2R1OHRLaXFNcEpLRDQ5N2UzcjdNZWdKUkZOSDFvSmZaM1RLMUVQUjR4NkVrelV3L20vN21tK1ZnRUEvMzgzOWNwMGpBdUJtZUYwZEdQZmtGUnFheHFiWjJXeXFkNnVyczlNL09ZTVp6ZGJtNElaRlFNcktVNVhoRWtpYUxCWEVjTHlXeTJiWGtjbmhsOHVta3hxQmwydmFVK09ZYW5GczJGa094VklMVVVKNmhVWk81OE9peFkxaE9Ga3NSWmxhcjFWNy85TlBsK1dCRWpHSFVVQUdZZG8xV25XZXpGRHBLWUdWdDdjaUVOeFpabS9PTUo1YkRJNDhHSyt5TzB6LzZTV050cmRWaTgzZzhmWDM5T2szTytZNk9WMTg3R2dxSC9BR2YwK0d3V2EzTFMwc2JiR0lqbVNBQWtHVlpWSlM2eHNiakowNW9OUnBTbmFOVkpFbWpWcFZ0cmFqQ3pKZVdzdkhFdjIvZXpHYTV3YUhCdnY1K2RvTTFGdVExTis5WVhWMGxDRkJlVVZIdHFpa3dHdlVHQTZKb0xGdEZWa1JSTkp2TkI5cGZibTNaV1dJdWhCOWN1OWJpYmhBVk1SaGRPWHZ5bE1WdUhSdno3bW5aZWIrcjgwOVhyc1FUY1FDQXlXZzZkUGdRMDhEWVMreVJhUFJCVHc5Q3RNTlI2dlY0SW1zUlVjQ1VFaHFOMm1vdExzakxBd0pQWHJuMHpvUjM5TXN2UGsvRzQ1ekltL0x5ejUwOEZYajI3T08vL2czckhFT0RpRXluMDR1TGk3SW9qWXlNREF3TVJ0YWlnQ0JLeThzd3VSZ21scG9rU3lhVHFaRmhkalF3UjQvOGdERGs1T2h5Y3lXb2lJS3d2Ym5selRkK0ZvdXMvK29YYjJQNk5sc0RDa1JRcGRJMGY2djUwcnZ2UWdyYkJaS0k2dXp1L3ZyMjdZR2VYaTZieGI0Z0NLSzF0Zlc5OTk4cndhMUUxcUVpaUd3MmswbGxuQ2JyVzIvL0V0djdyVGQvdmhRT0FVZ0NCTlcwU3NUWkowaWhVQmliQjVJUW0zOWdZT0JmLzd3eDh2aXhKRXI0T1JrQXBLSUJKREk4aDlTcTFWaU1xSzZwOXMzNkd0ek0xYXRYWlVDY09INDhNRGRIcU5EMlBidVBmUCtJbmxMRjE5WnZmWFY3ZEhnNGswNXBOQnFhUnBLaVlLa0tQRFlSUVVLU1Ztc2dUUmVZVFV4am83bklvdGZyNGQ5dmZNYkhOeTcvOFRKbDBKMC9leTY0c0hEaTFNa3FkMzFKVmVXdVBYdHNsdUwybDE1KzhjV1g3RGI3bU1lYlNySHBkQ3FielFBRkI3cUNtY0NFRWpnVlNTQ1RaSjdSVkYzcndnR0dvb25rQjU5OHJHU3k1MzU2NXVuMDlJVUxGODY4MFRFMTc1TTVNZWxmU0NyRTA0QnZKT2h2Y3JrcW0rcDc3M3hOeWdvSmNCNWd1ZU9GNlNSRlhxUXBXc3h5VXhQalZsdngyZE5uMFA3V0Y3UVEvZWFkUzNmdi9kZFJYdmJDdnVmbkE3TkRqeDRlUG5qNDFtZlg3YzVTRnZzdnpXb0pTdUlFRWlGWkVQQ2tNREk4OTgxRGxIVTZuVXdRRkVVVHN0TC9vQWNwSlB6ZHIzLzcwYlcvL09IeSt3UWtEdTV2ZiszSFA5VG42Wm5udGhsMHVpd0FVd0gvOXUwN2poeityc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBdmdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09"]
     */

    private String paymentCompany;
    private String paymentMoney;
    private String[] picture;

    public RequestUploadVoucher(String phone, String companyCode, String paymentCompany, String paymentMoney, String[] picture) {
        this.phone = phone;
        this.companyCode = companyCode;
        this.paymentCompany = paymentCompany;
        this.paymentMoney = paymentMoney;
        this.picture = picture;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPaymentCompany() {
        return paymentCompany;
    }

    public void setPaymentCompany(String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String[] getPicture() {
        return picture;
    }

    public void setPicture(String[] picture) {
        this.picture = picture;
    }
}

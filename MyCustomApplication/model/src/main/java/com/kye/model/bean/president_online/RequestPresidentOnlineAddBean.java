package com.kye.model.bean.president_online;

import java.io.Serializable;
import java.util.List;

/**
 * Created by harry on 2018/1/10 下午4:30.
 */

public class RequestPresidentOnlineAddBean implements Serializable {

    /**
     * message : 留言测测6222测试2试测试测试的试信息
     * messageClass : 1
     * phone : 13001358032
     * picture : ["aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWN PUy9KQmt5NUlzK1lFZGJHUmIxemE0Qmt3SWNXSWcwTWVVVGdpRnRqQUZnaUZ0MHJRenpMUS9PcDFwU0NlaGRCTGEwbVRTZjBtaFRjTFFRRHJZT G1DN0JodjhrUHlJd2JZa1czNUl0bVc5ZlBXNDc2NTNkdmJIL3RqdmZPYzc1eXhSWHVkbVdaYm5lWlZhSlFPRlQ2Y0pTV1pjcnRkZlAxdFpXU1V Dd0F2QzlTKy9lTmovME8vM1FZUWdoQXpEWEx4NDBXRzNyNFNXdTdxN1Y4SXJ6MjNkV2xOVDQ1OE5QQmtjWkRrT0NUeGZrSitQdDh2bEduenlKS k5tTnhMeHg4TkRrZDlIR2hqR1VlSllESWM3LzljYldWM1RxdFZBbEZTSXFxMnNLcmRZdmFQZWpXd21SNmVqVkZGM2ZWMlpzelFVWEtBSUlBazh xbWxnNm5jMElCbDhwMzEvODY2ZE1zOERUdmp6aHg5T1RFMEUvUDRjclpibmVGNlNLVWhLdkNnQXhaQ2JtNWVmcjlmcjNLNXRTWll0TnBuc1Ztd UNTMDh2QlVWSTJvdHQ0ZkFJRW1YUldXekxKSkxoVUVoV2xKbUEzMmcwaWlTdXFIQXN4cDFDRklJRUNTQUVKQ2tCb0NqS2VuU2RvaWlielZvZzh GQkZCNWVYZXI2NmswbG5EaDE0eGJhekpaWk5JWU11cDhicTZCcnY3RnRjaXNaaVQrZjl1L1k5bjI4cmtqMHlVaFQ4bkNqaldoS3VvZ2c4Z1ZDS 1RmcG1acGFYRmgxT3gybzgydFZ6ZjhMakxUTGtTNEN1c0R1QlhzM1JKR3piZitCN3J4eTgyOVgxeEROYVVsVGNjZUU4cjhnQ3g3WHQzVnRSV3V ieGVoUlpoZ1JHU1NwQW9XbGFUZE94OWZVOGc5N2R3QVJEeThORHc2VWxEbGZWVmdRUnkzT1B2TVBkOSs3Qk14M25LdXZya21KMmJIejgyKzBIM nR2YXJJVVdpN2xRcFZFaG1ocDhOQUFraWFJcGg5TkowYlFnaUtJa3JxK3RMUzB1Q2lKZlhyR2xxYzdkNkdaS3Q1UnpRTGx4NitaL2J0K0poRmV JY0RUS3F0SGRudnVUUTk3VHJ4NUxSbU96TXpQKzROeDBZR1p5Yk53M1BxbEJxS3FtT3A1SUxDd3NZY0E4eDhtU2lNc1VtczFOemMzN2R1OHRLa XFNcEpLRDQ5N2UzcjdNZWdKUkZOSDFvSmZaM1RLMUVQUjR4NkVrelV3L20vN21tK1ZnRUEvMzgzOWNwMGpBdUJtZUYwZEdQZmtGUnFheHFiWjJ XeXFkNnVyczlNL09ZTVp6ZGJtNElaRlFNcktVNVhoRWtpYUxCWEVjTHlXeTJiWGtjbmhsOHVta3hxQmwydmFVK09ZYW5GczJGa094VklMVVVKN mhVWk81OE9peFkxaE9Ga3NSWmxhcjFWNy85TlBsK1dCRWpHSFVVQUdZZG8xV25XZXpGRHBLWUdWdDdjaUVOeFpabS9PTUo1YkRJNDhHSyt5TzB 6LzZTV050cmRWaTgzZzhmWDM5T2szTytZNk9WMTg3R2dxSC9BR2YwK0d3V2EzTFMwc2JiR0lqbVNBQWtHVlpWSlM2eHNiakowNW9OUnBTbmFOV kpFbWpWcFZ0cmFqQ3pKZVdzdkhFdjIvZXpHYTV3YUhCdnY1K2RvTTFGdVExTis5WVhWMGxDRkJlVVZIdHFpa3dHdlVHQTZKb0xGdEZWa1JSTkp 2TkI5cGZibTNaV1dJdWhCOWN1OWJpYmhBVk1SaGRPWHZ5bE1WdUhSdno3bW5aZWIrcjgwOVhyc1FUY1FDQXlXZzZkUGdRMDhEWVMreVJhUFJCV Hc5Q3RNTlI2dlY0SW1zUlVjQ1VFaHFOMm1vdExzakxBd0pQWHJuMHpvUjM5TXN2UGsvRzQ1ekltL0x5ejUwOEZYajI3T08vL2czckhFT0RpRXl uMDR1TGk3SW9qWXlNREF3TVJ0YWlnQ0JLeThzd3VSZ21scG9rU3lhVHFaRmhkalF3UjQvOGdERGs1T2h5Y3lXb2lJS3d2Ym5selRkK0ZvdXMvK 29YYjJQNk5sc0RDa1JRcGRJMGY2djUwcnZ2UWdyYkJaS0k2dXp1L3ZyMjdZR2VYaTZieGI0Z0NLSzF0Zlc5OTk4cndhMUUxcUVpaUd3MmswbGx uQ2JyVzIvL0V0djdyVGQvdmhRT0FVZ0NCTlcwU3NUWkowaWhVQmliQjVJUW0zOWdZT0JmLzd3eDh2aXhKRXI0T1JrQXBLSUJKREk4aDlTcTFWa U1xSzZwOXMzNkd0ek0xYXRYWlVDY09INDhNRGRIcU5EMlBidVBmUCtJbmxMRjE5WnZmWFY3ZEhnNGswNXBOQnFhUnBLaVlLa0tQRFlSUVVLU1Z tc2dUUmVZVFV4am83bklvdGZyNGQ5dmZNYkhOeTcvOFRKbDBKMC9leTY0c0hEaTFNa3FkMzFKVmVXdVBYdHNsdUwybDE1KzhjV1g3RGI3bU1lY lNySHBkQ3FielFBRkI3cUNtY0NFRWpnVlNTQ1RaSjdSVkYzcndnR0dvb25rQjU5OHJHU3k1MzU2NXVuMDlJVUxGODY4MFRFMTc1TTVNZWxmU0N yRTA0QnZKT2h2Y3JrcW0rcDc3M3hOeWdvSmNCNWd1ZU9GNlNSRlhxUXBXc3h5VXhQalZsdngyZE5uMFA3V0Y3UVEvZWFkUzNmdi9kZFJYdmJDd nVmbkE3TkRqeDRlUG5qNDFtZlg3YzVTRnZzdnpXb0pTdUlFRWlGWkVQQ2tNREk4OTgxRGxIVTZuVXdRRkVVVHN0TC9vQWNwSlB6ZHIzLzcwYlc vL09IeSt3UWtEdTV2ZiszSFA5VG42Wm5udGhsMHVpd0FVd0gvOXUwN2poeityc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBd mdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09"]
     * audio : aVZCT1J3MEtHZ29BQUFBTlNVaEVVZ0FBQUJ3QUFBQVZDQUlBQUFEYVlCa0xBQUFHb0VsRVFWUTRFUlZWYTNCVHh4bmRlM2Z2MWN PUy9KQmt5NUlzK1lFZGJHUmIxemE0Qmt3SWNXSWcwTWVVVGdpRnRqQUZnaUZ0MHJRenpMUS9PcDFwU0NlaGRCTGEwbVRTZjBtaFRjTFFRRHJZT G1DN0JodjhrUHlJd2JZa1czNUl0bVc5ZlBXNDc2NTNkdmJIL3RqdmZPYzc1eXhSWHVkbVdaYm5lWlZhSlFPRlQ2Y0pTV1pjcnRkZlAxdFpXU1V Dd0F2QzlTKy9lTmovME8vM1FZUWdoQXpEWEx4NDBXRzNyNFNXdTdxN1Y4SXJ6MjNkV2xOVDQ1OE5QQmtjWkRrT0NUeGZrSitQdDh2bEduenlKS k5tTnhMeHg4TkRrZDlIR2hqR1VlSllESWM3LzljYldWM1RxdFZBbEZTSXFxMnNLcmRZdmFQZWpXd21SNmVqVkZGM2ZWMlpzelFVWEtBSUlBazh xbWxnNm5jMElCbDhwMzEvODY2ZE1zOERUdmp6aHg5T1RFMEUvUDRjclpibmVGNlNLVWhLdkNnQXhaQ2JtNWVmcjlmcjNLNXRTWll0TnBuc1Ztd UNTMDh2QlVWSTJvdHQ0ZkFJRW1YUldXekxKSkxoVUVoV2xKbUEzMmcwaWlTdXFIQXN4cDFDRklJRUNTQUVKQ2tCb0NqS2VuU2RvaWlielZvZzh GQkZCNWVYZXI2NmswbG5EaDE0eGJhekpaWk5JWU11cDhicTZCcnY3RnRjaXNaaVQrZjl1L1k5bjI4cmtqMHlVaFQ4bkNqaldoS3VvZ2c4Z1ZDS 1RmcG1acGFYRmgxT3gybzgydFZ6ZjhMakxUTGtTNEN1c0R1QlhzM1JKR3piZitCN3J4eTgyOVgxeEROYVVsVGNjZUU4cjhnQ3g3WHQzVnRSV3V ieGVoUlpoZ1JHU1NwQW9XbGFUZE94OWZVOGc5N2R3QVJEeThORHc2VWxEbGZWVmdRUnkzT1B2TVBkOSs3Qk14M25LdXZya21KMmJIejgyKzBIM nR2YXJJVVdpN2xRcFZFaG1ocDhOQUFraWFJcGg5TkowYlFnaUtJa3JxK3RMUzB1Q2lKZlhyR2xxYzdkNkdaS3Q1UnpRTGx4NitaL2J0K0poRmV JY0RUS3F0SGRudnVUUTk3VHJ4NUxSbU96TXpQKzROeDBZR1p5Yk53M1BxbEJxS3FtT3A1SUxDd3NZY0E4eDhtU2lNc1VtczFOemMzN2R1OHRLa XFNcEpLRDQ5N2UzcjdNZWdKUkZOSDFvSmZaM1RLMUVQUjR4NkVrelV3L20vN21tK1ZnRUEvMzgzOWNwMGpBdUJtZUYwZEdQZmtGUnFheHFiWjJ XeXFkNnVyczlNL09ZTVp6ZGJtNElaRlFNcktVNVhoRWtpYUxCWEVjTHlXeTJiWGtjbmhsOHVta3hxQmwydmFVK09ZYW5GczJGa094VklMVVVKN mhVWk81OE9peFkxaE9Ga3NSWmxhcjFWNy85TlBsK1dCRWpHSFVVQUdZZG8xV25XZXpGRHBLWUdWdDdjaUVOeFpabS9PTUo1YkRJNDhHSyt5TzB 6LzZTV050cmRWaTgzZzhmWDM5T2szTytZNk9WMTg3R2dxSC9BR2YwK0d3V2EzTFMwc2JiR0lqbVNBQWtHVlpWSlM2eHNiakowNW9OUnBTbmFOV kpFbWpWcFZ0cmFqQ3pKZVdzdkhFdjIvZXpHYTV3YUhCdnY1K2RvTTFGdVExTis5WVhWMGxDRkJlVVZIdHFpa3dHdlVHQTZKb0xGdEZWa1JSTkp 2TkI5cGZibTNaV1dJdWhCOWN1OWJpYmhBVk1SaGRPWHZ5bE1WdUhSdno3bW5aZWIrcjgwOVhyc1FUY1FDQXlXZzZkUGdRMDhEWVMreVJhUFJCV Hc5Q3RNTlI2dlY0SW1zUlVjQ1VFaHFOMm1vdExzakxBd0pQWHJuMHpvUjM5TXN2UGsvRzQ1ekltL0x5ejUwOEZYajI3T08vL2czckhFT0RpRXl uMDR1TGk3SW9qWXlNREF3TVJ0YWlnQ0JLeThzd3VSZ21scG9rU3lhVHFaRmhkalF3UjQvOGdERGs1T2h5Y3lXb2lJS3d2Ym5selRkK0ZvdXMvK 29YYjJQNk5sc0RDa1JRcGRJMGY2djUwcnZ2UWdyYkJaS0k2dXp1L3ZyMjdZR2VYaTZieGI0Z0NLSzF0Zlc5OTk4cndhMUUxcUVpaUd3MmswbGx uQ2JyVzIvL0V0djdyVGQvdmhRT0FVZ0NCTlcwU3NUWkowaWhVQmliQjVJUW0zOWdZT0JmLzd3eDh2aXhKRXI0T1JrQXBLSUJKREk4aDlTcTFWa U1xSzZwOXMzNkd0ek0xYXRYWlVDY09INDhNRGRIcU5EMlBidVBmUCtJbmxMRjE5WnZmWFY3ZEhnNGswNXBOQnFhUnBLaVlLa0tQRFlSUVVLU1Z tc2dUUmVZVFV4am83bklvdGZyNGQ5dmZNYkhOeTcvOFRKbDBKMC9leTY0c0hEaTFNa3FkMzFKVmVXdVBYdHNsdUwybDE1KzhjV1g3RGI3bU1lY lNySHBkQ3FielFBRkI3cUNtY0NFRWpnVlNTQ1RaSjdSVkYzcndnR0dvb25rQjU5OHJHU3k1MzU2NXVuMDlJVUxGODY4MFRFMTc1TTVNZWxmU0N yRTA0QnZKT2h2Y3JrcW0rcDc3M3hOeWdvSmNCNWd1ZU9GNlNSRlhxUXBXc3h5VXhQalZsdngyZE5uMFA3V0Y3UVEvZWFkUzNmdi9kZFJYdmJDd nVmbkE3TkRqeDRlUG5qNDFtZlg3YzVTRnZzdnpXb0pTdUlFRWlGWkVQQ2tNREk4OTgxRGxIVTZuVXdRRkVVVHN0TC9vQWNwSlB6ZHIzLzcwYlc vL09IeSt3UWtEdTV2ZiszSFA5VG42Wm5udGhsMHVpd0FVd0gvOXUwN2poeityc0p4aFFWR0xwdVpud3VJbXpnVmpCTVNTSkkyNHhaL1hXQlRBd mdHK24yKy93TzY4bHlUdE5GTDBnQUFBQUJKUlU1RXJrSmdnZz09
     * audioSize : 444
     * messageType : 2
     * code : 33cl
     * operationType : 0
     */

    private String message;
    private int messageClass;
    private String phone;
    private String audio;
    private String audioSize;
    private int messageType;
    private String code;
    private int operationType;
    private List<String> picture;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getMessageClass() {
        return messageClass;
    }

    public void setMessageClass(int messageClass) {
        this.messageClass = messageClass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAudioSize() {
        return audioSize;
    }

    public void setAudioSize(String audioSize) {
        this.audioSize = audioSize;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public List<String> getPicture() {
        return picture;
    }

    public void setPicture(List<String> picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "RequestPresidentOnlineAddBean{" +
                "message='" + message + '\'' +
                ", messageClass=" + messageClass +
                ", phone='" + phone + '\'' +
                ", audio='" + audio + '\'' +
                ", audioSize='" + audioSize + '\'' +
                ", messageType=" + messageType +
                ", code='" + code + '\'' +
                ", operationType=" + operationType +
                ", picture=" + picture +
                '}';
    }
}

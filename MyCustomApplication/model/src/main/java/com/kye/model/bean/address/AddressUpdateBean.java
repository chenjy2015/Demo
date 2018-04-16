package com.kye.model.bean.address;

import java.util.List;

public class AddressUpdateBean {

    /**
     * timestamp : 45888901889
     * allCities : [{"uniqueID":39065,"fullName":"武康镇","fullPY":"wukangzhen","startPY":"WKZ","parentID":1720,"levelType":4,"status":0,"flag":4,
     * "dotMark":1,"allFlag":0},{"uniqueID":39066,"fullName":"洛舍镇","fullPY":"luoshezhen","startPY":"LSZ","parentID":1720,"levelType":4,"status":0,
     * "flag":4,"dotMark":1,"allFlag":0},{"uniqueID":42099,"fullName":"乐山镇","fullPY":"leshanzhen","startPY":"LSZ","parentID":1427,"levelType":4,
     * "status":0,"flag":4,"dotMark":0,"allFlag":0},{"uniqueID":12060,"fullName":"黄湾乡","fullPY":"huangwanxiag","startPY":"HWX","parentID":2539,
     * "levelType":4,"status":0,"flag":2,"dotMark":0,"allFlag":0}]
     * hotCity : [{"province":"广东省","city":"深圳市","popularity":1},{"province":"上海","city":"上海市","popularity":2},{"province":"北京","city":"北京市",
     * "popularity":3},{"province":"重庆","city":"重庆市","popularity":19}]
     */

    private String timestamp;
    private List<AllCitiesBean> allCities;
    private List<HotCityBean>   hotCity;

    public String getTimestamp()                            { return timestamp;}

    public void setTimestamp(String timestamp)              { this.timestamp = timestamp;}

    public List<AllCitiesBean> getAllCities()               { return allCities;}

    public void setAllCities(List<AllCitiesBean> allCities) { this.allCities = allCities;}

    public List<HotCityBean> getHotCity()                   { return hotCity;}

    public void setHotCity(List<HotCityBean> hotCity)       { this.hotCity = hotCity;}

    public static class AllCitiesBean {
        /**
         * uniqueID : 39065
         * fullName : 武康镇
         * fullPY : wukangzhen
         * startPY : WKZ
         * parentID : 1720
         * levelType : 4
         * status : 0
         * flag : 4
         * dotMark : 1
         * allFlag : 0
         */

        private int uniqueID;
        private String fullName;
        private String fullPY;
        private String startPY;
        private int    parentID;
        private int    levelType;
        private int    status;
        private int    flag;
        private int    dotMark;
        private int    allFlag;

        public int getUniqueID()                 { return uniqueID;}

        public void setUniqueID(int uniqueID)    { this.uniqueID = uniqueID;}

        public String getFullName()              { return fullName;}

        public void setFullName(String fullName) { this.fullName = fullName;}

        public String getFullPY()                { return fullPY;}

        public void setFullPY(String fullPY)     { this.fullPY = fullPY;}

        public String getStartPY()               { return startPY;}

        public void setStartPY(String startPY)   { this.startPY = startPY;}

        public int getParentID()                 { return parentID;}

        public void setParentID(int parentID)    { this.parentID = parentID;}

        public int getLevelType()                { return levelType;}

        public void setLevelType(int levelType)  { this.levelType = levelType;}

        public int getStatus()                   { return status;}

        public void setStatus(int status)        { this.status = status;}

        public int getFlag()                     { return flag;}

        public void setFlag(int flag)            { this.flag = flag;}

        public int getDotMark()                  { return dotMark;}

        public void setDotMark(int dotMark)      { this.dotMark = dotMark;}

        public int getAllFlag()                  { return allFlag;}

        public void setAllFlag(int allFlag)      { this.allFlag = allFlag;}
    }

    public static class HotCityBean {
        /**
         * province : 广东省
         * city : 深圳市
         * popularity : 1
         */

        private String province;
        private String city;
        private int    popularity;

        public String getProvince()               { return province;}

        public void setProvince(String province)  { this.province = province;}

        public String getCity()                   { return city;}

        public void setCity(String city)          { this.city = city;}

        public int getPopularity()                { return popularity;}

        public void setPopularity(int popularity) { this.popularity = popularity;}
    }
}

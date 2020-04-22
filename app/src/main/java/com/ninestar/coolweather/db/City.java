package com.ninestar.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市的实体类，存放的是市的数据信息
 * LitePal中的每一个实体类都是必须继承自DataSupport类的
 */

public class City extends DataSupport {

    /***
     * provinceId记录当前市所属省的id值
     */

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }


}


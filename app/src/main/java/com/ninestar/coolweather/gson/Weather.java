package com.ninestar.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * JSON 实体类
 */


public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

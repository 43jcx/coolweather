package com.example.lenovo.coolweather.gson;

/**
 * Created by lenovo on 2019/7/30.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

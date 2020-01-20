package com.example.geocachingdemo0.constant;

public class AppConfig {
    public static String USERNAME = "";
    public final static String BASE_URL_PATH = "http://127.0.0.1:3801";
    public final static String GET_USERINFO_BY_NAME = BASE_URL_PATH.concat("/userInfo/username/");

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }


}

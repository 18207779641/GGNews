package com.example.ggnews;

public final class Constants {
    private Constants() {
    }

    public static final int NEWS_NUM = 10;
    public static String SERVER_URL = "http://api.tianapi.com/";
    public static String ALL_NEWS_PATH = "https://apis.tianapi.com/generalnews/index";
    public static String GENERAL_NEWS_PATH = "generalnews/";

    public static String API_KEY = "39cb259f2a9eb411c7f319be5322a016";

    public static String ALL_NEWS_URL = SERVER_URL + ALL_NEWS_PATH;
    public static String GENERAL_NEWS_URL = SERVER_URL + GENERAL_NEWS_PATH;

    public static int NEWS_COL5 = 5;
    public static int NEWS_COL7 = 7;
    public static int NEWS_COL8 = 8;
    public static int NEWS_COL10 = 10;
    public static int NEWS_COL11 = 11;

    public static String NEWS_DETAIL_URL_KEY = "news_detail_url_key";
}

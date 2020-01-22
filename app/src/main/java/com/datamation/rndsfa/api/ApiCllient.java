package com.datamation.rndsfa.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rashmi on 7/15/2019.
 */

public class ApiCllient {
    public static final String BASE_URL = "http://123.231.13.199:1025/SWDWebServices/SWDWebServicesRest.svc/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

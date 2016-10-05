package com.metell_a.orders_manager.rest_client.service.config;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Ihor Bilous
 */
public class RetrofitConfig {

    private static final String BASE_URL = "http://yourip/ordersmanager/api/";

    private static Retrofit retrofit;

    static {
        retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }

    public static Retrofit getRetrofit() {
        return retrofit;
    }
}

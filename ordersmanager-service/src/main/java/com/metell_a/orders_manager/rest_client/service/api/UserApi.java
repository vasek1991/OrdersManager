package com.metell_a.orders_manager.rest_client.service.api;

import retrofit2.http.GET;
import rx.Observable;

import java.util.List;

/**
 * @author Ihor Bilous
 */
public interface UserApi {
    @GET("users")
    Observable<List<String>> getUsersList();
}

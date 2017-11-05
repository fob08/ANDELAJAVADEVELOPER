package com.example.badmos.andelajavadeveloper.api;

import com.example.badmos.andelajavadeveloper.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by badmos on 9/16/2017.
 */

public interface Service {

    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}

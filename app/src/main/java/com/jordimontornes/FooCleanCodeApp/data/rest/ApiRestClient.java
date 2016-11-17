package com.jordimontornes.FooCleanCodeApp.data.rest;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;

public class ApiRestClient {
    private static final String API_URL = "http://sandbox.apiplug.com:8000/demo/v1/";

    private ApiEndPoints apiEndPoints;

    public ApiRestClient() {
        setupRestClient();
    }

    private void setupRestClient() {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(httpClient.build())
                .build();

        apiEndPoints = retrofit.create(ApiEndPoints.class);

    }
    public ApiEndPoints getEndPoints() {
        return apiEndPoints;
    }
}

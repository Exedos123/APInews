package com.example.apinews;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface News {

    //@GET("v2/everything?q=bitcoin&from=2020-04-29&sortBy=publishedAt&apiKey=d18cfdeee6c44308a2c20a787f4f1b8e")


    @GET("/v2/everything?q=bitcoin&apiKey=d18cfdeee6c44308a2c20a787f4f1b8e")
    Call<MyNews> getMyArticles();

    /* Syntax
    @GET("endpint")
    Call<className> getMethod();

    @GET("end")
    Call<List<Classname>> getNews();
    */
}
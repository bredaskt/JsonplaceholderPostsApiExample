package com.bbreda.restapiretrofitexample.api

import com.bbreda.restapiretrofitexample.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {

    @GET("posts")
    fun getPosts() : Call<List<Posts>>

}
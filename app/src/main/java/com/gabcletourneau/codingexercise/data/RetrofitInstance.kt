package com.gabcletourneau.codingexercise.data

import com.gabcletourneau.codingexercise.BuildConfig

// Dependencies
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    const val BASE_URL = BuildConfig.BASE_API_URL
    val api: ApiEndpoints by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiEndpoints::class.java)
    }
}
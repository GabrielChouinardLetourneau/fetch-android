package com.gabcletourneau.codingexercise.data

// Dependencies
import retrofit2.http.GET

interface ApiEndpoints {
    @GET("hiring.json")
    suspend fun getList(): List <ListItem>
}
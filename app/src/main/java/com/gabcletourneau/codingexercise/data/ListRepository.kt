package com.gabcletourneau.codingexercise.data

interface ListRepository {

    /**
     * This function will return the result of the JSON for the list at the route /hiring.json
     */
    suspend fun getList(): List <ListItem>
}

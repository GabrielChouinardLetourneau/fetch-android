package com.gabcletourneau.codingexercise.data

class ListRepositoryImpl: ListRepository {
    override suspend fun getList(): List<ListItem> {
        return RetrofitInstance.api.getList()
    }
}
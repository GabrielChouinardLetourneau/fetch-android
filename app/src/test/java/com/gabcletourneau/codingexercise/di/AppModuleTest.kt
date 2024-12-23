package com.gabcletourneau.codingexercise.di

import com.gabcletourneau.codingexercise.data.ListRepository
import com.gabcletourneau.codingexercise.data.ListRepositoryImpl
import org.junit.Test
import org.junit.jupiter.api.assertInstanceOf

class AppModuleTest {

    @Test
    fun shouldProvideListRepository() {
        val repository = ListRepositoryImpl()

        assertInstanceOf<ListRepository>(repository)
    }
}
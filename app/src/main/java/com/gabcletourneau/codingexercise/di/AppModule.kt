package com.gabcletourneau.codingexercise.di

// Dependencies


// Internal imports
import com.gabcletourneau.codingexercise.data.ListRepository
import com.gabcletourneau.codingexercise.data.ListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideListRepository(): ListRepository {
        return ListRepositoryImpl()
    }
}
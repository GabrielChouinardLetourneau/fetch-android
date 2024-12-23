package com.gabcletourneau.codingexercise.ui.list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gabcletourneau.codingexercise.data.ListItem
import com.gabcletourneau.codingexercise.di.AppModule.provideListRepository
import com.gabcletourneau.codingexercise.util.cleanList
import kotlinx.coroutines.launch


class ListViewModel: ViewModel() {
    // Repositories
    private val apiService = provideListRepository()

    // Properties
    val list: MutableState<Map<Int, List<ListItem>>> = mutableStateOf(emptyMap())

    fun getList() {
        viewModelScope.launch {
            try {
                val response = apiService.getList()
                if (response.isNotEmpty()) {

                    val cleanedList = cleanList(response)

                    list.value = cleanedList
                }
            } catch (e: Exception) {
                throw e
            }
        }
    }

}
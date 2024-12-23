package com.gabcletourneau.codingexercise.ui.list

import com.gabcletourneau.codingexercise.util.MainDispatcherRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.jupiter.api.assertDoesNotThrow

class ListViewModelTest {

    // This rule is used to act as a coroutines dispatcher
    @get:Rule
    val mainDispatcherRule = MainDispatcherRule()

    private lateinit var viewModel: ListViewModel

    @Before
    fun setUp() {
        viewModel = ListViewModel()
    }


    @Test
    fun getListShouldNotThrow()  {
        assertDoesNotThrow { viewModel.getList() }
    }

}
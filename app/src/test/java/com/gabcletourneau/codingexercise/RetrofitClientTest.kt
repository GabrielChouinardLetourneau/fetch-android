package com.gabcletourneau.codingexercise

import com.gabcletourneau.codingexercise.data.RetrofitInstance
import junit.framework.TestCase.assertEquals
import org.junit.Test

class RetrofitClientTest {
    @Test
    fun retrofitShouldHaveBaseURL() {
        val instance = RetrofitInstance

        assertEquals(instance.BASE_URL, BuildConfig.BASE_API_URL)
    }
}
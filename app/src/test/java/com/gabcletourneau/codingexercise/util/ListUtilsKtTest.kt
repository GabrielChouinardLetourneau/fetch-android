package com.gabcletourneau.codingexercise.util

import com.gabcletourneau.codingexercise.data.ListItem
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ListUtilsKtTest {
    @Test
    fun cleanListShouldReturnMapListItem() {

        val list = listOf(
            ListItem(6, 3, "G"),
            ListItem(5, 2, "A"),
            ListItem(22, 1, "B"),
            ListItem(44, 11, null),
            ListItem(2, 2,  "C"),
            ListItem(4, 4, "L"),
            ListItem(33, 1, ""),
        )
        val expected = mapOf(
            1 to listOf(
                ListItem(22, 1, "B")
            ),
            2 to listOf(
                ListItem(5, 2, "A"),
                ListItem(2, 2,  "C")
            ),
            3 to listOf(
                ListItem(6, 3, "G")
            ),
            4 to listOf(
                ListItem(4, 4, "L")
            ),
        )

        val cleanList = cleanList(list)

        assertEquals(expected, cleanList)
    }
}
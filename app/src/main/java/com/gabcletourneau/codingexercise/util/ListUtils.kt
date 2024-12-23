package com.gabcletourneau.codingexercise.util

import com.gabcletourneau.codingexercise.data.ListItem

fun cleanList(list: List<ListItem>): Map<Int, List<ListItem>> {
    return list
        .sortedWith(compareBy(ListItem::listId, ListItem::name))
        .filter { !it.name.isNullOrBlank() }
        .groupBy { it.listId }

}

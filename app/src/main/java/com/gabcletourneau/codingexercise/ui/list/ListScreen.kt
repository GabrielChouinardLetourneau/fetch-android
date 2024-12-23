@file:OptIn(ExperimentalFoundationApi::class)

package com.gabcletourneau.codingexercise.ui.list


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gabcletourneau.codingexercise.ui.list.item.ListItem

@Composable
fun ListScreen(
    viewModel: ListViewModel,
    modifier: Modifier = Modifier
) {
    val list by viewModel.list

    if (list.isNotEmpty()) {
        LazyColumn {
            list.forEach { listId ->
                stickyHeader {
                    ListIdHeader(listId.key.toString())
                }
                items(listId.value) { listItem ->
                    ListItem(listItem)
                }
            }

        }
    }
    else {
        Box(modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(20.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "No items to show",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = modifier
                    .fillMaxWidth()


            )
        }
    }
    DisposableEffect(Unit) {
        viewModel.getList()
        onDispose {}
    }
}

@Composable
fun ListIdHeader(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = "ListId: $text",
        fontSize = 20.sp,
        color = MaterialTheme.colorScheme.onBackground,
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 10.dp, vertical = 30.dp)
    )
}
package com.gabcletourneau.codingexercise.ui.list.item

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gabcletourneau.codingexercise.data.ListItem

@Composable
fun ListItem(item: ListItem) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.secondary)
        .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
        ) {

            Text(
                text = "Id: ${item.id.toString()}",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(20.dp)

            )
            item.name?.let {
                Text(
                    text = "Name: $it",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .padding(20.dp, 0.dp, 0.dp, 0.dp)
                )
            }
            Text(
                text = "ListId: ${item.listId.toString()}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .padding(20.dp, 0.dp, 0.dp, 20.dp)
            )
        }
    }
}


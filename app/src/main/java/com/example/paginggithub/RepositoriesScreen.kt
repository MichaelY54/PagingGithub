package com.example.paginggithub

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun RepositoriesScreen(repos: List<Repository>){

    LazyColumn(contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp)){
        itemsIndexed(repos){
            index, repo -> RepositoryItem(index,repo)
        }

    }
}

@Composable
fun RepositoryItem(index:Int, repo:Repository){
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = index.toString(), style = MaterialTheme.typography.titleLarge)
        Column() {
            Text(
                text = repo.fullName,
                style = MaterialTheme.typography.bodySmall,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                text = repo.description,
                style = MaterialTheme.typography.bodySmall,
                overflow = TextOverflow.Ellipsis,
                maxLines = 3
            )
        }
    }
}
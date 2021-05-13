package com.adammcneilly.staggeredgridcompose

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextCardList(texts: List<String>) {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()),
    ) {
        StaggeredVerticalGrid(
            numColumns = 4,
            modifier = Modifier.padding(4.dp),
        ) {
            texts.forEach { text ->
                TextCard(text)
            }
        }
    }
}

@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day Mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
private fun TextCardListPreview() {
    val texts = listOf("Lorem", "Ipsum")
    
    TextCardList(texts = texts)
}

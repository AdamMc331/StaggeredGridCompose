package com.adammcneilly.staggeredgridcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.adammcneilly.staggeredgridcompose.ui.theme.StaggeredGridComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaggeredGridComposeTheme {
                val inputs = getRandomStringList(100)
                
                TextCardList(texts = inputs)
            }
        }
    }
}

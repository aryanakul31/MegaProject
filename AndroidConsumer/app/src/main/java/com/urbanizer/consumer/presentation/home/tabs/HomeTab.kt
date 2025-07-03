package com.urbanizer.consumer.presentation.home.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeTabScreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Text("Home Tab")
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeTabPreview() {
    HomeTabScreen()
}
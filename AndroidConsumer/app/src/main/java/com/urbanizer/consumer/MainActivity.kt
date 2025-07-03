package com.urbanizer.consumer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.urbanizer.consumer.navigation.AppNavHost
import com.urbanizer.consumer.ui.theme.ConsumerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ConsumerTheme {
                AppNavHost(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MainViewPreview() {
    val navController = rememberNavController()
    ConsumerTheme {
        AppNavHost(navController = navController)
    }
}
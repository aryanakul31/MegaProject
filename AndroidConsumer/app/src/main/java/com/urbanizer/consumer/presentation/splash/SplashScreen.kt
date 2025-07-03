package com.urbanizer.consumer.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.urbanizer.consumer.R
import com.urbanizer.consumer.ui.theme.ConsumerTheme
import com.urbanizer.consumer.ui.theme.Dimensions


@Composable
fun SplashScreen(onNavigateToLogin: () -> Unit, viewModel: SplashViewModel = viewModel()) {
    LaunchedEffect(Unit) {
        viewModel.onAutoNavigate(onNavigateToLogin = onNavigateToLogin)
    }
    SplashView()
}

@Composable
private fun SplashView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.app_logo),
            contentDescription = "App logo",
            modifier = Modifier
                .size(Dimensions.dp200)
                .aspectRatio(1f)
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview() {
    ConsumerTheme {
        SplashView()
    }
}
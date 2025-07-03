package com.urbanizer.consumer.navigation

import HomeScreen
import com.urbanizer.consumer.presentation.login.LoginScreen
import OtpScreen
import ReferralScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import com.urbanizer.consumer.presentation.splash.SplashScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.urbanizer.consumer.ui.theme.White

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = Routes.SPLASH,
        modifier = Modifier.fillMaxSize()
            .background(color = White)
            .padding(WindowInsets.safeDrawing.asPaddingValues())
    ) {
        composable(Routes.SPLASH) { SplashScreen(onNavigateToLogin = {
            navController.navigate(Routes.LOGIN)
        }) }
        composable(Routes.LOGIN) { LoginScreen() }
        composable(Routes.OTP) { OtpScreen() }
        composable(Routes.REFERRAL) { ReferralScreen() }
        composable(Routes.HOME) { HomeScreen() }
    }
}
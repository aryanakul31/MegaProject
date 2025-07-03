package com.urbanizer.consumer.presentation.splash

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    fun onAutoNavigate(onNavigateToLogin: () -> Unit) {
        viewModelScope.launch {
            delay(2_000)
            onNavigateToLogin()
        }
    }
}
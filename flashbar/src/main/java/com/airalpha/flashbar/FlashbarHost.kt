package com.airalpha.flashbar

import androidx.compose.material3.SnackbarHost
import androidx.compose.runtime.Composable

@Composable
fun FlashbarHost(snackbarHostState: FlashbarState = rememberSnackbarState()) {

    SnackbarHost(
        hostState = snackbarHostState.snackbarHostState,
        snackbar = {
            CustomSnackbar(snackbarMessage = snackbarHostState.snackbarMessage)
        }
    )
}
package com.airalpha.flashbar

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.launch

class FlashbarState(
    val snackbarHostState: SnackbarHostState,
    private val alertMessageManager: Flash,
    coroutineScope: CoroutineScope,
    var snackbarMessage: FlashbarMessage
) {
    init {
        coroutineScope.launch {
            alertMessageManager.alertMessages.filterNotNull().collect { alertMessage ->
                this@FlashbarState.snackbarMessage = alertMessage
                snackbarHostState.showSnackbar("")
            }
        }
    }
}

@Composable
fun rememberSnackbarState(
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() },
    alertMessageManager: Flash = Flash,
    snackbarMessage: FlashbarMessage = FlashbarMessage.SuccessMessage(""),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) = remember(snackbarHostState, alertMessageManager, coroutineScope) {
    FlashbarState(snackbarHostState, alertMessageManager, coroutineScope, snackbarMessage)
}
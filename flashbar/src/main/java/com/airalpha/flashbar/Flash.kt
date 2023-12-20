package com.airalpha.flashbar

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object Flash {
    private val messages: MutableStateFlow<FlashbarMessage?> = MutableStateFlow(null)
    val alertMessages: StateFlow<FlashbarMessage?>
        get() = messages.asStateFlow()

    fun error(exception: Exception) {
        messages.value = FlashbarMessage.ErrorMessage(exception)
    }

    fun success(message: String) {
        messages.value = FlashbarMessage.SuccessMessage(message)
    }

    fun showMessage(message: FlashbarMessage) {
        messages.value = message
    }

}
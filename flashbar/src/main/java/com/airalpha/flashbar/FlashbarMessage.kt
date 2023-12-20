package com.airalpha.flashbar

sealed class FlashbarMessage {
    class ErrorMessage(val exception: Exception): FlashbarMessage()
    class SuccessMessage(val message: String): FlashbarMessage()
}
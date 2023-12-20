package com.airalpha.flashbar

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomSnackbar(
    modifier: Modifier = Modifier,
    snackbarMessage: FlashbarMessage,
) {
    when (snackbarMessage) {
        is FlashbarMessage.SuccessMessage -> {
            Snackbar(
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                contentColor = MaterialTheme.colorScheme.onSecondary,
                containerColor = MaterialTheme.colorScheme.secondary,
                action = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "Success",
                        tint = MaterialTheme.colorScheme.onSecondary,
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = snackbarMessage.message)
                }
            }
        }
        is FlashbarMessage.ErrorMessage -> {
            Snackbar(
                modifier = modifier.fillMaxWidth(),
                shape = RoundedCornerShape(0.dp),
                contentColor = MaterialTheme.colorScheme.onError,
                containerColor = MaterialTheme.colorScheme.error,
                action = {}
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Warning,
                        contentDescription = "error",
                        tint = MaterialTheme.colorScheme.onError,
                        modifier = Modifier
                            .size(24.dp)
                            .padding(end = 8.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = snackbarMessage.exception.message ?: "Nous avons rencontré un problème")
                }
            }
        }
    }
}
package com.polskitv.ultimate.ui.screens
import androidx.compose.runtime.*
import androidx.tv.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun DashboardScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("NeoTV Ultimate Gotowy!", style = MaterialTheme.typography.displayLarge)
    }
}
package com.doruk.kmptemplate

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState()
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = "KMP Template"
    ) {
        App()  // your root @Composable
    }
}
package com.watermelonkode.simpletemplate

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import com.watermelonkode.simpletemplate.App

fun main() = application {
    val state = rememberWindowState()
    Window(
        onCloseRequest = ::exitApplication,
        state = state,
        title = "Particle Simulator – Desktop"
    ) {
        App()  // your root @Composable
    }
}
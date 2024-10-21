package com.uvg.lab11anggelie.presentation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import serialization.javaClass

@Serializable
internal data object LoginDestination

fun NavGraphBuilder.loginScreen(
    onLoginClick: () -> Unit
) {
    composable<LoginDestination> {
        LoginRoute(
            onLoginClick = onLoginClick,
        )
    }
}
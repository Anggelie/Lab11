package com.uvg.lab11anggelie.presentation.mainFlow.profile

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

@Serializable
internal data object ProfileDestination

fun NavGraphBuilder.profileScreen(
    onLogOutClick: () -> Unit
) {
    composable<ProfileDestination> {
        ProfileRoute(onLogOutClick = onLogOutClick)
    }
}
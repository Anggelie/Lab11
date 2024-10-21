package com.uvg.lab11anggelie.presentation.mainFlow.location.list

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

@Serializable
data object LocationListDestination

fun NavGraphBuilder.locationListScreen(
    onLocationClick: (Int) -> Unit
) {
    composable<LocationListDestination> {
        LocationListRoute(onLocationClick = onLocationClick)
    }
}
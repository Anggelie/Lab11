package com.uvg.lab11anggelie.presentation.mainFlow.location.list

import com.uvg.lab11anggelie.data.model.Location

data class LocationListState(
    val isLoading: Boolean = true,
    val locations: List<Location> = emptyList(),
    val isError: Boolean = false
)
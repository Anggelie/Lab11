package com.uvg.lab11anggelie.presentation.mainFlow.location.profile

import com.uvg.lab11anggelie.data.model.Location

data class LocationProfileState(
    val data: Location? = null,
    val isLoading: Boolean = true
)
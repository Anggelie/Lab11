package com.uvg.lab11anggelie.presentation.mainFlow.location.list

sealed interface LocationListEvent {
    data object ForceError: LocationListEvent
    data object RetryClick: LocationListEvent
}
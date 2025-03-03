package com.uvg.lab11anggelie.presentation.mainFlow.character.list

sealed interface CharacterListEvent {
    data object ForceError: CharacterListEvent
    data object RetryClick: CharacterListEvent
}
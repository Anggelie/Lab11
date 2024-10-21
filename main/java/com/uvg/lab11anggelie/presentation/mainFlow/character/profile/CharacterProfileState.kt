package com.uvg.lab11anggelie.presentation.mainFlow.character.profile

import com.uvg.lab11anggelie.data.model.Character

data class CharacterProfileState(
    val data: Character? = null,
    val isLoading: Boolean = true
)
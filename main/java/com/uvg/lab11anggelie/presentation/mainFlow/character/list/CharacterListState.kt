package com.uvg.lab11anggelie.presentation.mainFlow.character.list


import com.uvg.lab11anggelie.data.model.Character

data class CharacterListState(
    val isLoading: Boolean = true,
    val characters: List<Character> = emptyList(),
    val isError: Boolean = false
)
package com.uvg.lab11anggelie.presentation.mainFlow.character.list


import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
@Serializable
data object CharacterListDestination

fun NavGraphBuilder.characterListScreen(
    onCharacterClick: (Int) -> Unit
) {
    composable<CharacterListDestination> {
        CharacterListRoute(onCharacterClick = onCharacterClick)
    }
}
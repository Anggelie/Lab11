package com.uvg.lab11anggelie.domain

import com.uvg.lab11anggelie.data.model.Character


interface CharacterRepository {
    suspend fun getCharacters(): List<Character>
    suspend fun getCharacterById(id: Int): Character
}
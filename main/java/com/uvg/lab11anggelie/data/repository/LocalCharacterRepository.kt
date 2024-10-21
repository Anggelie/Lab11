package com.uvg.lab11anggelie.data.repository

import com.uvg.lab11anggelie.data.model.Character
import com.uvg.lab11anggelie.data.source.CharacterDb
import com.uvg.lab11anggelie.domain.CharacterRepository
import kotlinx.coroutines.delay

class LocalCharacterRepository: CharacterRepository {
    private val characterDb = CharacterDb()

    override suspend fun getCharacters(): List<Character> {
        delay(2000L)
        return characterDb.getAllCharacters()
    }

    override suspend fun getCharacterById(id: Int): Character {
        delay(2000L)
        return characterDb.getCharacterById(id)
    }
}
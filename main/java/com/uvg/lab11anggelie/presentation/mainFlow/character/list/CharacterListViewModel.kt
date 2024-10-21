package com.uvg.lab11anggelie.presentation.mainFlow.character.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.uvg.lab11anggelie.data.repository.LocalCharacterRepository
import com.uvg.lab11anggelie.domain.repository.CharacterRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CharacterListViewModel(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    private var getDataJob: Job? = null
    private val _state = MutableStateFlow(CharacterListState())
    val state = _state.asStateFlow()

    init {
        getCharacters()
    }

    fun onEvent(event: CharacterListEvent) {
        when (event) {
            CharacterListEvent.ForceError -> {
                getDataJob?.cancel()
                _state.update { state ->
                    state.copy(
                        isLoading = false,
                        isError = true
                    )
                }
            }
            CharacterListEvent.RetryClick -> {
                getCharacters()
            }
        }
    }

    private fun getCharacters() {
        getDataJob = viewModelScope.launch {
            _state.update { state ->
                state.copy(
                    isLoading = true,
                    isError = false
                )
            }

            val characters = characterRepository.getCharacters()

            _state.update { state ->
                state.copy(
                    isLoading = false,
                    characters = characters
                )
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                CharacterListViewModel(
                    characterRepository = LocalCharacterRepository()
                )
            }
        }
    }
}
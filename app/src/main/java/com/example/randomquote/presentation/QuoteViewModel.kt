package com.example.randomquote.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.randomquote.domain.GetRandomQuoteUseCase
import com.example.randomquote.domain.Quote
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed class QuoteUiState {
    object Loading : QuoteUiState()
    data class Success(val quote: Quote) : QuoteUiState()
    data class Error(val message: String) : QuoteUiState()
}

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow<QuoteUiState>(QuoteUiState.Loading)
    val uiState: StateFlow<QuoteUiState> = _uiState.asStateFlow()

    init {
        generateNewQuote()
    }

    fun generateNewQuote() {
        viewModelScope.launch {
            _uiState.value = QuoteUiState.Loading
            try {
                val nextQuote = getRandomQuoteUseCase()
                _uiState.value = QuoteUiState.Success(nextQuote)
            } catch (e: Exception) {
                _uiState.value = QuoteUiState.Error(e.localizedMessage ?: "Unknown error occurred")
            }
        }
    }
}

package com.example.tcenavigator.presentation.search

sealed class SearchUiEvent{
    object SearchSuccess: SearchUiEvent()
    object SearchInvalid: SearchUiEvent()
}

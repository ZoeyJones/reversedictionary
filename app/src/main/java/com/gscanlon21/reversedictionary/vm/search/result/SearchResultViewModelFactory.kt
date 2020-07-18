package com.gscanlon21.reversedictionary.vm.search.result

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gscanlon21.reversedictionary.repository.search.result.SearchResultRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Factory for creating a [SearchResultViewModel] with a constructor that takes a
 * [SearchResultRepository]
 */
@ExperimentalCoroutinesApi
class SearchResultViewModelFactory(private val repository: SearchResultRepository) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SearchResultViewModel(repository) as T
    }
}
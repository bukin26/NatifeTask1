package com.gmail.notifytask1.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gmail.notifytask1.repository.ItemsRepository

@Suppress("UNCHECKED_CAST")
class MyViewModelFactory(
    private val repository: ItemsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        when (modelClass) {
            MainViewModel::class.java -> return MainViewModel(repository) as T
            ListViewModel::class.java -> return ListViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}
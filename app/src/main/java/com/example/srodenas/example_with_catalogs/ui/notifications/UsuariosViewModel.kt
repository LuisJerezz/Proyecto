package com.example.srodenas.example_with_catalogs.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UsuariosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Usuarios"
    }
    val text: LiveData<String> = _text
}
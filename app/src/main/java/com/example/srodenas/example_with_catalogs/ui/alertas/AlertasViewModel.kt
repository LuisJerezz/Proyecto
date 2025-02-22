package com.example.srodenas.example_with_catalogs.ui.alertas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AlertasViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Alertas"
    }
    val text: LiveData<String> = _text
}
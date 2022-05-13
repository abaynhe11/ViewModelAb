package com.google.firebase.quickstart.auth.viewmodelab.ui.main

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private var message = ""
    private var editText: String = ""

    fun setEditText(value: String){
        this.editText = value
        message = value
    }
    fun getMessage() : String?{
        return message
    }
}


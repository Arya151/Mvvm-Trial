package com.mvvm.mvvmtrial.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null

    fun onLogInButtonClicked(view : View){

        if(email.isNullOrEmpty() || password.isNullOrEmpty()){

            return
        }
        //successful

    }
}
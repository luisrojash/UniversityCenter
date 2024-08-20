package com.lerp.login.presentation

sealed class LoginScreenEvent {

    object OnGoogleSignInButtonClicked : LoginScreenEvent()
}
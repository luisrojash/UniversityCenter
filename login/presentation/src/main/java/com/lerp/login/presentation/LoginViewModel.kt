package com.lerp.login.presentation

import android.content.res.Resources
import androidx.lifecycle.SavedStateHandle
import com.lerp.core.common.presentation.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val coroutineDispatcher: CoroutineDispatcher,
    resources: Resources,
    savedStateHandle: SavedStateHandle,
) : BaseViewModel<LoginScreenState, LoginScreenEvent>(savedStateHandle, resources) {
    override fun initialContent(): LoginScreenState = LoginScreenState()

    override fun initialLoadingPage(): Boolean = false


    override fun initialLoadingContent(): Boolean  = false

}

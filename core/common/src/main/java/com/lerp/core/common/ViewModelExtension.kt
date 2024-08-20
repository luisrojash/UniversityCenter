package com.lerp.core.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.lerp.core.common.result.Result
import com.lerp.core.common.result.Failure

fun <T> ViewModel.executeTask(
    coroutineDispatcher: CoroutineDispatcher,
    onSuccess: (T) -> Unit,
    onFailure: (Failure) -> Unit,
    task: suspend () -> Result<T>,
) {
    viewModelScope.launch(coroutineDispatcher) {
        try {
            val result = task.invoke()
            withContext(Dispatchers.Main) {
                when (result) {
                    is Result.Success -> onSuccess.invoke(result.data)
                    is Result.Error -> onFailure.invoke(result.error)
                }
            }
        } catch (e: Throwable) {
            withContext(Dispatchers.Main) {
                onFailure.invoke(Failure.Others)
            }
        }
    }
}

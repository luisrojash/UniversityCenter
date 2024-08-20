package com.lerp.core.common.result

sealed class Result<T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error<T>(val error: Failure) : Result<T>()
}
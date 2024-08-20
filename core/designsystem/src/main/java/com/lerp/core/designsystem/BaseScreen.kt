package com.lerp.core.designsystem

import androidx.compose.runtime.Composable
import com.lerp.core.common.presentation.ScreenState

@Composable
fun <T> BaseScreen(
    state: ScreenState<T>,
    loadingContent: @Composable () -> Unit,
    content: @Composable () -> Unit
) {
}
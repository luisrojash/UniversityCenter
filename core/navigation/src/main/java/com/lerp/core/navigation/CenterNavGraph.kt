package com.lerp.core.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.navigation


fun NavGraphBuilder.mainGraph(navController: NavController) {
    navigation(
        route = "/main",
        startDestination = "",
    ) {

    }
}
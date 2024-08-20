package com.lerp.login.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.lerp.login.presentation.LoginScreen
import com.lerp.login.presentation.LoginViewModel

class LoginNavigation {
    companion object {
        const val route: String = "/login"
        fun getRouteToNavigate() = route
    }
}


fun NavGraphBuilder.loginScreen(
    navigateToForgotMyPassword: () -> Unit,
    navigateToRegister: () -> Unit,
    navigateOnSuccess: () -> Unit,
    navigateToMigrate: () -> Unit
) {

    composable(LoginNavigation.route) {
        val viewModel = hiltViewModel<LoginViewModel>()
        val screenState = viewModel.screenState.collectAsStateWithLifecycle().value

        LoginScreen()
    }

}
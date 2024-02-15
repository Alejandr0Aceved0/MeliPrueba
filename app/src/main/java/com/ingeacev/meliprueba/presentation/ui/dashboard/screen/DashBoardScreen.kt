package com.ingeacev.meliprueba.presentation.ui.dashboard.screen

import com.ingeacev.meliprueba.presentation.ui.theme.MeliPruebaTheme
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardScreen(
    dashBoardViewModel: DashBoardViewModel = hiltViewModel(),
    onScheduleActivityClick: () -> Unit,
) {
    MeliPruebaTheme {
        val navController = rememberNavController()
    }
}


package com.ingeacev.meliprueba.presentation.ui.navigations.graphs

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.ingeacev.meliprueba.presentation.ui.dashboard.screen.DashboardScreen
import com.ingeacev.meliprueba.presentation.ui.navigations.Router

fun NavGraphBuilder.dashBoardNavigationGraph(rootNavController: NavHostController) {
    navigation(
        route = Router.DASHBOARD_GRAPH,
        startDestination = Router.MAIN_DASHBOARD_SCREEN
    ) {
        composable(
            route = Router.MAIN_DASHBOARD_SCREEN
        ) {

            DashboardScreen(
                onScheduleActivityClick = {
                    rootNavController.navigate(Router.PRODUCT_DETAILS_GRAPH)
                }
            )
        }
    }
}

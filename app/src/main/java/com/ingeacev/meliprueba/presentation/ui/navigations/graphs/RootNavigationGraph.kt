package com.ingeacev.meliprueba.presentation.ui.navigations.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun RootNavigationGraph(
    rootNavController: NavHostController,
    startDestination: String,
    permissionRequestedDenied : () -> Unit = {}
) {
    NavHost(
        navController = rootNavController,
        startDestination = startDestination
    ) {
        splashNavigationGraph(rootNavController,permissionRequestedDenied)
        authenticationNavigationGraph(rootNavController)
        preoperationalInspectionGraph(rootNavController)
        dashBoardNavigationGraph(rootNavController)
        noScheduleActivitiesNavigationGraph(rootNavController)
        scheduleActivitiesNavigationGraph(rootNavController)
        incidentsNavigationGraph(rootNavController)
        evidenceNavigationGraph(rootNavController)
        generalReportGraph(rootNavController)
        abandonedDocumentsGraph(rootNavController)
        fuelControlNavigationGraph(rootNavController)
    }
}

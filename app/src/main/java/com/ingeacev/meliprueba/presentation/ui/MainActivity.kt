package com.ingeacev.meliprueba.presentation.ui

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.ingeacev.meliprueba.presentation.ui.navigations.Router
import com.ingeacev.meliprueba.presentation.ui.navigations.graphs.RootNavigationGraph
import com.ingeacev.meliprueba.presentation.ui.theme.MeliPruebaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val rootController = rememberNavController()
            MeliPruebaTheme {
                Surface {
                    RootNavigationGraph(
                        rootNavController = rootController,
                        startDestination = Router.SPLASH_GRAPH,
                        permissionRequestedDenied = ::openAppSettings
                    )
                }
            }
        }
    }
}

fun Activity.openAppSettings() {
    Intent(
        Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
        Uri.fromParts("package", packageName, null)
    ).also(::startActivity)
}

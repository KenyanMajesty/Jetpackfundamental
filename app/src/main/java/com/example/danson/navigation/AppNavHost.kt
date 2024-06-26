package com.example.danson.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.danson.ui.theme.screens.about.AboutScreen
import com.example.danson.ui.theme.screens.busforbooking.ViewBusBookedScreen
import com.example.danson.ui.theme.screens.contact.ContactScreen
import com.example.danson.ui.theme.screens.dashboard.DashboardScreen
import com.example.danson.ui.theme.screens.home.HomeScreen
import com.example.danson.ui.theme.screens.login.LoginScreen
import com.example.danson.ui.theme.screens.nairobibooking.NairobiBookingScreen
import com.example.danson.ui.theme.screens.services.ServicesScreen
import com.example.danson.ui.theme.screens.signup.SignupScreen
import com.example.danson.ui.theme.screens.splash.SplashScreen
import com.example.danson.ui.theme.screens.upload.UploadScreen
import com.example.wazitoecommerce.ui.theme.screens.passenger.AddPassengersScreen
import com.example.wazitoecommerce.ui.theme.screens.passenger.ViewPassengersScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }

        composable(ROUT_DASHBOARD){
            DashboardScreen(navController)
        }

        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }

        composable(ROUT_CONTACT){
            ContactScreen(navController)
        }

        composable(ROUT_SPLASH){
            SplashScreen(navController)
        }

        composable(ROUT_SERVICES){
            ServicesScreen(navController)
        }

        composable(ROUT_CLOTHING){
          NairobiBookingScreen(navController)
        }

        composable(ROUT_NAKURU){
            NairobiBookingScreen(navController)
        }

        composable(ROUT_KISUMU){
            NairobiBookingScreen(navController)
        }

        composable(ROUT_MOMBASA){
            NairobiBookingScreen(navController)
        }

        composable(ROUT_MALINDI){
            NairobiBookingScreen(navController)
        }

        composable(ROUT_NAIVASHA){
            NairobiBookingScreen(navController)
        }


        composable(ADD_PASSENGERS_URL){
            AddPassengersScreen(navController = navController)
        }
        composable(VIEW_PASSENGERS_URL){
            ViewPassengersScreen(navController = navController)
        }

        composable(ADD_BUSBOOKING_URL){
            ViewBusBookedScreen(navController = navController)
        }

        composable(VIEW_BUSBOOKING_URL){
            ViewBusBookedScreen(navController = navController)
        }




























    }
}

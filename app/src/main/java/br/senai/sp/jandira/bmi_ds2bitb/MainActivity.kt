package br.senai.sp.jandira.bmi_ds2bitb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi_ds2bitb.screens.BMIResultScreen
import br.senai.sp.jandira.bmi_ds2bitb.screens.TelaInicial
import br.senai.sp.jandira.bmi_ds2bitb.screens.UserDataScreen
import br.senai.sp.jandira.bmi_ds2bitb.ui.theme.BMIDS2BITBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BMIDS2BITBTheme {

                var navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = "home"
                ) {
                    composable(
                        route = "home"
                    ) {
                        TelaInicial(navController)
                    }
                    composable(
                        route = "user_data"
                    ) {
                        UserDataScreen(navController)
                    }
                    composable(
                        route = "result_screen"
                    ) {
                        BMIResultScreen(navController)
                    }
                }
            }
        }
    }
}

package com.example.mvvmjetpack07

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmjetpack07.fragment.DetailFragment
import com.example.mvvmjetpack07.fragment.HomeFragment
import com.example.mvvmjetpack07.ui.theme.MVVMJETPACK07Theme
import com.example.mvvmjetpack07.util.Route

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMJETPACK07Theme {
                // A surface container using the 'background' color from the theme
                JetpackComposeAppScreen()
            }
        }
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MVVMJETPACK07Theme {
        JetpackComposeAppScreen()

    }
}

@Composable
fun JetpackComposeAppScreen() {
    val navController = rememberNavController()
    NavHost(
        navController = navController, startDestination = Route.Home.route
    ) {

        composable(route = Route.Home.route) {
            HomeFragment(modifier = Modifier,
                onClickToDetailScreen = {
                    navController.navigate(Route.Detail.route)
                })
        }
        composable(route = Route.Detail.route) {
            DetailFragment(modifier = Modifier)

        }
    }
}
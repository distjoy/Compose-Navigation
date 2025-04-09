package com.tunieapps.composenavigation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tunieapps.features.Feature

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                val controller = rememberNavController()
                NavHost(controller, startDestination = Feature.Splash::class){
                    composable<Feature.Splash> {  }
                    composable<Feature.Home> {  }
                    composable<Feature.Splash> {  }
                    composable<Feature.Splash> {  }
                    composable<Feature.Splash> {  }
                }
            }
        }
    }
}
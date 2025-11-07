package com.example.questnavigasitugas_235.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

// Import ini sekarang seharusnya benar semua
import com.example.questnavigasitugas_235.view.Beranda
import com.example.questnavigasitugas_235.view.Formulir
import com.example.questnavigasitugas_235.view.ListData

enum class Navigasi {
    Beranda,
    ListData,
    Formulir
}
@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { isiRuang->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Beranda.name,
            modifier = Modifier.padding(paddingValues = isiRuang)
        ) {
            composable(route = Navigasi.Beranda.name) {
                Beranda(
                    // PERBAIKAN: Nama parameter disesuaikan dengan file Beranda.kt
                    onNavigateToList = {
                        navController.navigate(route = Navigasi.ListData.name)
                    }
                )
            }
            composable(route = Navigasi.ListData.name) {
                ListData(
                    OnFormulirBtnClick = {
                        navController.navigate(route = Navigasi.Formulir.name)
                    },
                    OnBackToBeranda = { backToBeranda(navController) }
                )
            }
            composable(route= Navigasi.Formulir.name) {
                Formulir (
                    OnBackToListData = { backToListData(navController) }
                )
            }
        }
    }
}
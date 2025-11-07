package com.example.questnavigasitugas_235.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_235.R // Import R

@Composable
fun Beranda(onNavigateToList: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "SELAMAT DATANG",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF673AB7),
            modifier = Modifier.padding(bottom = 50.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Logo",
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 50.dp)
        )

        Text(text = "Muhammad Haris", fontSize = 18.sp)
        Text(
            text = "20230140235",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 100.dp)
        )

        Button(
            onClick = onNavigateToList,
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF673AB7)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text("Submit", fontSize = 18.sp)
        }
    }
}
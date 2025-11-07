package com.example.questnavigasitugas_235.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_235.R // Import R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListData(
    OnFormulirBtnClick: () -> Unit,
    OnBackToBeranda: () -> Unit
) {
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Muhammad Haris"),
        Pair(stringResource(R.string.jenis_kelamin), "Laki-Laki"),
        Pair(stringResource(R.string.status), "Lajang"),
        Pair(stringResource(R.string.alamat), "Sleman")
    )
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.list), color = Color.White) },
                // PERBAIKAN: Menambahkan 'containerColor'
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(R.color.purple_200)
                )
            )
        }
    ) { isiRuang ->
        // PERBAIKAN: Memindahkan 'verticalArrangement' ke dalam Column
        Column(
            modifier = Modifier
                .fillMaxSize() // Mengisi seluruh layar
                .background(Color(0xFFE8D3ED))
                .padding(isiRuang) // Terapkan padding dari Scaffold
                .padding(horizontal = dimensionResource(R.dimen.padding_medium)), // Padding horizontal
            verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium))
        ) {
            items.forEach { item ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth(), // Mengisi lebar
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp) // Padding di dalam Card
                    ) {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 20.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(), // Mengisi lebar
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.purple_200)
                ),
                onClick = OnBackToBeranda
            ) {
                Text(text = stringResource(R.string.beranda))
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth(), // Mengisi lebar
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFDCA2E6)
                ),
                onClick = OnFormulirBtnClick
            ) {
                Text(text = stringResource(R.string.formulir))
            }
           }
       }
}
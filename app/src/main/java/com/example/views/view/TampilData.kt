package com.example.views.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.views.R

@OptIn(markerClass = ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()-> Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Contoh Nama"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Lainnya"),
        Pair(first = stringResource(id = "ALAMAT"), second = "Yogyakarta")
    )
}
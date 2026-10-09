package com.example.tugas_pertemuan4

import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

data class Mahasiswa(
    @StringRes val nama: Int,
    @StringRes val alamat: Int,
    @ColorRes val warnaCard: Int,
    @ColorRes val warnaNama: Int,
    @ColorRes val warnaAlamat: Int,
    @StringRes val noHp: Int? = null,
    @ColorRes val warnaNoHp: Int = R.color.cyan_hp,
    val fontNama: FontFamily = FontFamily.Default,
    val bobotNama: FontWeight = FontWeight.Bold,
    val ukuranNama: Int = R.dimen.teks_nama
)

private val daftarMahasiswa = listOf(
    Mahasiswa(
        nama = R.string.nama_0,
        alamat = R.string.alamat_0,
        warnaCard = R.color.card_0_bg,
        warnaNama = R.color.putih,
        warnaAlamat = R.color.kuning,
        fontNama = FontFamily.Cursive,
        bobotNama = FontWeight.Normal,
        ukuranNama = R.dimen.teks_nama_cursive
    ),
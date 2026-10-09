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
    Mahasiswa(
        nama = R.string.nama_1,
        alamat = R.string.alamat_1,
        warnaCard = R.color.card_1_bg,
        warnaNama = R.color.putih,
        warnaAlamat = R.color.kuning,
        noHp = R.string.no_hp,
        warnaNoHp = R.color.biru_hp
    ),
    Mahasiswa(
        nama = R.string.nama_2,
        alamat = R.string.alamat_2,
        warnaCard = R.color.card_2_bg,
        warnaNama = R.color.putih,
        warnaAlamat = R.color.putih,
        noHp = R.string.no_hp,
        warnaNoHp = R.color.biru_hp
    ),
    Mahasiswa(
        nama = R.string.nama_3,
        alamat = R.string.alamat_3,
        warnaCard = R.color.card_3_bg,
        warnaNama = R.color.putih,
        warnaAlamat = R.color.putih,
        noHp = R.string.no_hp,
        warnaNoHp = R.color.cyan_hp
    )
)

@Composable
fun KartuMahasiswa(data: Mahasiswa, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = dimensionResource(R.dimen.padding_card_luar),
                vertical = dimensionResource(R.dimen.jarak_kecil)
            ),
        shape = RoundedCornerShape(dimensionResource(R.dimen.radius_card)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(data.warnaCard)
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            LogoKartu()
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(data.nama),
                    fontSize = androidx.compose.ui.unit.TextUnit(
                        dimensionResource(data.ukuranNama).value,
                        androidx.compose.ui.unit.TextUnitType.Sp
                    ),
                    fontFamily = data.fontNama,
                    fontWeight = data.bobotNama,
                    color = colorResource(data.warnaNama)
                )
                data.noHp?.let {
                    Text(
                        text = stringResource(it),
                        fontSize = dimensionResource(R.dimen.teks_info).value.let {
                            androidx.compose.ui.unit.TextUnit(it, androidx.compose.ui.unit.TextUnitType.Sp)
                        },
                        color = colorResource(data.warnaNoHp)
                    )
                }
                Text(
                    text = stringResource(data.alamat),
                    fontSize = dimensionResource(R.dimen.teks_info).value.let {
                        androidx.compose.ui.unit.TextUnit(it, androidx.compose.ui.unit.TextUnitType.Sp)
                    },
                    color = colorResource(data.warnaAlamat)
                )
            }
            LogoKartu()
        }
    }
}

@Composable
private fun LogoKartu() {
    Image(
        painter = painterResource(R.drawable.logo_umy),
        contentDescription = null,
        modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_logo))
            .size(dimensionResource(R.dimen.ukuran_logo))
    )
}
package com.example.p3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        HeaderSection2()
        DetailMhs(
            param = "Nama",
            argu = "Inayah Ummu Ardillah"
        )
        DetailMhs(param = "NIM", argu = "20220140143")
    }
}

@Composable
fun HeaderSection2() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.ti_umy),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray) // Background color for the box.clip(CircleShape)
                )                      
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .align(Alignment.BottomEnd)
                        .padding(4.dp) // Optional padding for the icon
                )
            }
            Column(
                modifier = Modifier
                    .padding(14.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = "Teknologi Informasi", color = Color.Black)
                Text(text = "Universitas Muhammadiyah Yogyakarta", color = Color.Black)
            }
        }
    }
}

@Composable
fun DetailMhs(
    param: String,
    argu: String
) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = param, modifier = Modifier.weight(0.8f), color = Color.Black)
            Text(text = ": ", modifier = Modifier.weight(0.2f), color = Color.Black)
            Text(text = argu, modifier = Modifier.weight(2f), color = Color.Black)
        }
    }
}
